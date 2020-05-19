package com.yzx.domain;

import java.util.List;

/**
 * @program: day02mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-04-02 15:42
 */
public class QueryVo {
    private User user;
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
