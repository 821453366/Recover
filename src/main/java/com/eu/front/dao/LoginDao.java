package com.eu.front.dao;


import com.eu.front.entity.Admin;

/**
 * Created by 马欢欢 on 2017/5/24.
 */

public interface LoginDao {
    /**
     * 登录
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
