package com.dazhenkeji.cbms.systemManage.controller;

import com.dazhenkeji.cbms.systemManage.entity.OperationLog;
import com.dazhenkeji.cbms.systemManage.service.OperationSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName OperationController
 * @Description
 * @Author hp
 * @Date 2019/4/810:48
 **/
@Controller
@RequestMapping("/operation")
public class OperationController {
    @Autowired
    public OperationSerivce service;
    @RequestMapping("/init.action")
    public String init(){

        return "operation/operationList";
    }

    @GetMapping("/getList.action")
    @ResponseBody
    public List<OperationLog> getList(){
        return service.getOperationList();
    }
}
