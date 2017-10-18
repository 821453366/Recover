package com.eu.front.web.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

/**
 * Created 马欢欢 pc on 2017/5/23.
 */
@Controller
@RequestMapping("/menu")
public class menuController extends HttpServlet {

    //用户
    @RequestMapping("/user")
    public String tronClass() {
        return "web/user/user";
    }
    //客户
    @RequestMapping("/customerce")
    public String classUserRate() {
        return "web/customerce/customerce";
    }
    //废钢类型
    @RequestMapping("/steel")
    public String studioClassFront() {
        return "web/steel/steel";
    }
    //库房
    @RequestMapping("/storage")
    public String leaveReason() {
        return "web/storage/storage";
    }
    //
    @RequestMapping("/superUserInfo")
    public String superUserInfo() {
        return "userInfo/superUserInfo";
    }
    @RequestMapping("/firstUserInfo")
    public String firstUserInfo() {
        return "userInfo/firstUserInfo";
    }
    @RequestMapping("/secondUserInfo")
    public String secondUserInfo() {
        return "userInfo/secondUserInfo";
    }
    @RequestMapping("/thirdUserInfo")
    public String thirdUserInfo() {
        return "userInfo/thirdUserInfo";
    }



}
