package com.dazhenkeji.cbms.loginManage.controller;

import com.dazhenkeji.cbms.base.controller.BaseController;
import com.dazhenkeji.cbms.loginManage.service.LoginService;
import com.dazhenkeji.cbms.util.Encrypt;
import com.dazhenkeji.cbms.util.StringTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.MessageDigest;

/**
 * created by lgl on 2019/4/4 13:27
 **/
@Controller
public class LoginController extends BaseController {

    @Autowired
    private LoginService service;

    @GetMapping("/login.action")
    public String login(){
        return "login/login";
    }

    @GetMapping("/index.action")
    public String index(){
        return "index";
    }

    @PostMapping("/confirm.action")
    public String confirm(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        //用户名密码不为空
        if (StringTools.isNotNull(userName) && StringTools.isNotNull(password)) {
            password = Encrypt.encodeByMD5(request.getParameter("password"));
            String msg = service.checkUserAndPassword(userName,password);
            if ("success".equals(msg)) {
                return "redirect:/index.action";
            } else if ("fail".equals(msg)) {
                request.getSession().setAttribute("error", "用户名或密码错误");
            } else if ("disable".equals(msg)) {
                request.getSession().setAttribute("error", "您的用户已被锁定，不能进行登录");
            }
        } else {
            request.getSession().setAttribute("error", "用户名或密码不能为空");
        }
        return "redirect:login/login";
    }

}
