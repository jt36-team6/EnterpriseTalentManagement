package com.szxs.service;

import com.szxs.entity.Department;
import com.szxs.entity.Enterprisetalent;

import java.util.List;

public interface EnterprisetalentService {

    /**
     * 查询所有人才信息（符合条件）
     * @return
     */
    List<Enterprisetalent> queryEnterprisetalents(int departmentId);
    /**
     * 根据id查询人才信息
     * @param id
     * @return
     */
    Enterprisetalent queryEnterprisetalent(int id);

    /**
     * 添加人才信息
     * @param enterprisetalent
     * @return
     */
    Boolean add(Enterprisetalent enterprisetalent);

    /**
     * 根据id删除人才信息
     * @param id
     * @return
     */
    Boolean delete(int id);

    /**
     * 修改人才信息
     * @param enterprisetalent
     * @return
     */
    Boolean modify(Enterprisetalent enterprisetalent);

    /**
     * 查询所有部门
     * @return
     */
    List<Department> queryDepartments();
}
