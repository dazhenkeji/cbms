package com.dazhenkeji.cbms.operationCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName OperationController
 * @Description
 * @Author hp
 * @Date 2019/4/810:48
 **/
@Controller
@RequestMapping("/operation")
public class OperationController {
    @RequestMapping("/init.action")
    public String test(){
        return "operation/operationInit";
    }
}
