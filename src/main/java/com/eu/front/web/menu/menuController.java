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

    //创客访问量
    @RequestMapping("/tronClass")
    public String tronClass() {
        return "web/user/user";
    }
    //教室利用率
    @RequestMapping("/customerce")
    public String classUserRate() {
        return "web/customerce/customerce";
    }
    //工作室利用率
    @RequestMapping("/steel")
    public String studioClassFront() {
        return "web/steel/steel";
    }
    //学籍异动
    @RequestMapping("/leaveReason")
    public String leaveReason() {
        return "schoolChange/leaveReason/leaveReason";
    }
    //权限菜单
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
