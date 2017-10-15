package com.eu.front.dao;

import java.util.List;
import java.util.Map;

public interface UserDao {
 /**
  * 分页查询数据
  */
 List<Map<String,String>> queryUser(Map<String, Object> data) throws Exception;

 Long queryUserCount() throws Exception;

}
