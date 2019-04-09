package com.dazhenkeji.cbms.systemManage.controller;

import com.alibaba.fastjson.JSONObject;
import com.dazhenkeji.cbms.systemManage.entity.OperationLog;
import com.dazhenkeji.cbms.systemManage.service.OperationSerivce;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public JSONObject getList(){
        PageHelper.startPage(1,10);
        List<OperationLog> operationList = service.getOperationList();
        PageInfo<OperationLog> page = new PageInfo<>(operationList);

        JSONObject result = new JSONObject();
        result.put("rows", page.getList());
        result.put("total",page.getTotal());
        return result;
    }
}
