package com.eu.front.service.impl;


import com.eu.front.dao.LoginDao;
import com.eu.front.entity.Admin;
import com.eu.front.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 马欢欢 on 2017/5/24.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Admin login(Admin admin) {
        try {
            if (loginDao.login(admin) != null) {
                return  loginDao.login(admin);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Admin queryUserInfo(String username) {
        try {
            return loginDao.queryUserInfo(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUserInfo(Admin admin) {
        try {
             loginDao.updateUserInfo(admin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
