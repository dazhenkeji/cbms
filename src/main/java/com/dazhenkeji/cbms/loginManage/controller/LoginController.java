package com.dazhenkeji.cbms.loginManage.controller;

import com.dazhenkeji.cbms.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by lgl on 2019/4/4 13:27
 **/
@Controller
public class LoginController extends BaseController {
    @RequestMapping("/bb")
    public String test(){
        //saveOperation();
        return "index";
    }

}
