package com.yzx.dao;

import com.yzx.domain.Account;
import com.yzx.domain.AccountUser;

import java.util.List;

/**
 * @program: day03mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-06 19:07
 */
public interface IAccountDao {
    /**
     * 查询所有账户，同时还要获取到当前账户的所属用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 查询所有账户，并且带有用户名称和地址信息
     * @return
     */
    List<AccountUser> findAllAccount();
}
