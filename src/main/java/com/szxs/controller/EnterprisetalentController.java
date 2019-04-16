package com.szxs.controller;

import com.szxs.entity.Department;
import com.szxs.entity.Enterprisetalent;
import com.szxs.service.EnterprisetalentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EnterprisetalentController {

    @Resource
    private EnterprisetalentService enterprisetalentService;

    //查询所有的人才信息(可以按部门编号查询)
    @RequestMapping("/enterprisetalentList")
    public String queryEnterprisetalents(@RequestParam(required = false) String departmentId, Model model){
        if(departmentId==null||departmentId==""){
            departmentId = "0";
        }
        List<Enterprisetalent> enterprisetalentList = enterprisetalentService.queryEnterprisetalents(Integer.parseInt(departmentId));
        List<Department> departmentList = enterprisetalentService.queryDepartments();
        model.addAttribute("enterprisetalentList",enterprisetalentList);
        model.addAttribute("departmentList",departmentList);
        model.addAttribute("departmentId",departmentId);
        return "index";
    }

    //跳转添加页面
    @RequestMapping("/toadd")
    public String toAdd(){
        return "add";
    }

    //添加人才信息
    @RequestMapping("/add")
    public String addEnterprisetalent(Enterprisetalent enterprisetalent){
        if(enterprisetalentService.add(enterprisetalent)){
            return "redirect:enterprisetalentList";
        }else{
            return "redirect:toadd";
        }
    }

    //删除人才信息
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id,Model model){
        enterprisetalentService.delete(id);
        int departmentId = 0;
        List<Enterprisetalent> enterprisetalentList = enterprisetalentService.queryEnterprisetalents(departmentId);
        model.addAttribute("enterprisetalentList",enterprisetalentList);
        return "index";
    }

    //进入修改下页面
    @RequestMapping("/toModify/{id}")
    public String toModify(@PathVariable("id") int id,Model model){
        Enterprisetalent enterprisetalent = enterprisetalentService.queryEnterprisetalent(id);
        List<Department> departmentList = enterprisetalentService.queryDepartments();
        model.addAttribute("departmentList",departmentList);
        model.addAttribute("enterprisetalent",enterprisetalent);
        return "modify";
    }

    //修改人才信息
    @RequestMapping(value = "/modify/{id}",produces = "text/html;charset=utf-8")
    public String modify(Enterprisetalent enterprisetalent,Model model){
        enterprisetalentService.modify(enterprisetalent);
        int departmentId = 0;
        List<Enterprisetalent> enterprisetalentList = enterprisetalentService.queryEnterprisetalents(departmentId);
        List<Department> departmentList = enterprisetalentService.queryDepartments();
        model.addAttribute("departmentList",departmentList);
        model.addAttribute("enterprisetalentList",enterprisetalentList);
        return "index";
    }
}
