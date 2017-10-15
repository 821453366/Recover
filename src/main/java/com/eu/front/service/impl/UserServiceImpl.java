package com.eu.front.service.impl;


import com.eu.front.dao.UserDao;
import com.eu.front.service.UserService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<Map<String, String>> insertUser(PageUtil page) throws Exception {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        page.setTotalSize(userDao.queryUserCount());

        return userDao.queryUser(data);
    }
}
