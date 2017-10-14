package com.eu.front.service;

import com.eu.front.entity.Admin;

public interface LoginService {
    /**
     * 登录页面验证
     * @param admin
     * @return
     */
    Admin login(Admin admin);

    /**
     * 查找用户信息
     * @param username
     * @return
     */
    Admin queryUserInfo(String username);

    /**
     * 更新用户信息
     * @param admin
     */
    void updateUserInfo(Admin admin);




}
