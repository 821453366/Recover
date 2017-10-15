package com.eu.front.web.user;

import com.eu.front.service.UserService;
import com.eu.front.utils.Constant;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    @ResponseBody
    public Map<String, Object> insertProfession(PageUtil page){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> TronClass;
        try {
            TronClass = userService.insertUser(page);
            data.put("user", TronClass);
            data.put("page", page);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);
            e.printStackTrace();
        }

        return data;
    }

}
