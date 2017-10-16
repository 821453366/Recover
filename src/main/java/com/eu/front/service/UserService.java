package com.eu.front.service;

import com.eu.front.entity.Admin;
import com.eu.front.utils.PageUtil;
import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 用户信息
     * @param
     * @return
     */
    List<Map<String,String>>  insertUser(PageUtil pageUtil,String adminRealname) throws Exception;

    /**
     * 插入管理员
     * @param admin
     */
    void addUser(Admin admin) throws Exception;

    /**
     * 通过ID删除用户
     * @param id
     */
    void deleteUser(String id) throws Exception;
}
