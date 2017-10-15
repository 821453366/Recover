package com.eu.front.web;

import com.eu.front.dto.Result;
import com.eu.front.entity.Admin;
import com.eu.front.service.LoginService;
import com.eu.front.utils.Constant;
import com.eu.front.utils.ImgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class LoginController extends HttpServlet {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(HttpSession session, Admin admin) {
        Map<String, Object> data = new HashMap<String, Object>();

        Admin userInfo = loginService.login(admin);
        if (userInfo != null) {

            session.setAttribute("user", userInfo);
            data.put("result", true);

        } else {
            data.put("result", false);
        }
        return data;
    }

    //判断是否有session
    @RequestMapping("/session")
    @ResponseBody
    public Map<String, Object> session(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        Boolean haveSession=true;
        try {
            Admin user = (Admin) session.getAttribute("user");
            if(user == null){
                haveSession = false;
            }
            result.put("haveSession",haveSession);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    //登出
    @RequestMapping("/outSession")
    @ResponseBody
    public Map<String, Object> out(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            session.removeAttribute("user");
            result.put("msg", Constant.ACCOUNT_OUT);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    //用户信息
    @RequestMapping("/userInfo")
    @ResponseBody
    public Map<String, Object> userInfo(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            String username = ((Admin)session.getAttribute("user")).getAdminName();
           Admin user = loginService.queryUserInfo(username);
            result.put("msg", Constant.ACCOUNT_OUT);
            result.put("user", user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    //用户信息
    @RequestMapping("/updateInfoAjax")
    @ResponseBody
    public Map<String, Object> updateInfoAjax(Admin user) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            loginService.updateUserInfo(user);
            result.put("msg", Constant.UPDATE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", Constant.UPDATE_FAILURE);
        }

        return result;
    }

    @RequestMapping("/updateImage")
    @ResponseBody
    public Result updateImage(MultipartFile file, HttpServletRequest request) {
        try {
            String imgPath = ImgUtil.saveImg(file, request.getServletContext().getRealPath("/images") + Constant.USER_IMAGE_PATH);
            String imgName = imgPath.substring(imgPath.lastIndexOf("/"));

            return Result.success(imgName, Constant.UPLOAD_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Result.failure(null, Constant.UPDATE_FAILURE);
    }


}
