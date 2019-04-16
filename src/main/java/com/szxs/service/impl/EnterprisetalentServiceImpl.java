package com.szxs.service.impl;

import com.szxs.dao.DepartmentDao;
import com.szxs.dao.EnterprisetalentDao;
import com.szxs.entity.Department;
import com.szxs.entity.Enterprisetalent;
import com.szxs.service.EnterprisetalentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnterprisetalentServiceImpl implements EnterprisetalentService {
    @Resource
    private EnterprisetalentDao enterprisetalentDao;
    @Resource
    private DepartmentDao departmentDao;
    public List<Enterprisetalent> queryEnterprisetalents(int departmentId) {
        return enterprisetalentDao.queryEnterprisetalents(departmentId);
    }

    public Enterprisetalent queryEnterprisetalent(int id) {
        return enterprisetalentDao.queryEnterprisetalent(id);
    }

    public Boolean add(Enterprisetalent enterprisetalent) {
        return enterprisetalentDao.add(enterprisetalent)>0;
    }

    public Boolean delete(int id) {
        return enterprisetalentDao.delete(new Enterprisetalent(id))>0;
    }

    public Boolean modify(Enterprisetalent enterprisetalent) {
        return enterprisetalentDao.modify(enterprisetalent)>0;
    }

    public List<Department> queryDepartments() {
        return departmentDao.queryDepartments();
    }
}
