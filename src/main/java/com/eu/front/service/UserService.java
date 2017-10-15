package com.eu.front.service;

import com.eu.front.utils.PageUtil;
import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 用户信息
     * @param
     * @return
     */
    List<Map<String,String>>  insertUser(PageUtil pageUtil) throws Exception;

}
