package com.yzx.dao;

import com.yzx.domain.Role;

import java.util.List;

/**
 * @program: day03mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-07 10:56
 */
public interface IRoleDao {
    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
