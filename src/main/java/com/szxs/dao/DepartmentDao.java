package com.szxs.dao;

import com.szxs.entity.Department;

import java.util.List;

public interface DepartmentDao {
    /**
     * 查询所有部门
     * @return
     */
    List<Department> queryDepartments();
}
