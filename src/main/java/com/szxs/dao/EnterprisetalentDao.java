package com.szxs.dao;

import com.szxs.entity.Enterprisetalent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnterprisetalentDao {
    /**
     * 查询所有人才信息(符合条件)
     * @return
     */
    List<Enterprisetalent> queryEnterprisetalents(@Param("departmentId") int departmentId);

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
    int add(Enterprisetalent enterprisetalent);

    /**
     * 删除人才信息
     * @param enterprisetalent
     * @return
     */
    int delete(Enterprisetalent enterprisetalent);

    /**
     * 修改人才信息
     * @param enterprisetalent
     * @return
     */
    int modify(Enterprisetalent enterprisetalent);
}
