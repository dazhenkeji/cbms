package com.dazhenkeji.cbms.base.controller;


import com.dazhenkeji.cbms.systemManage.model.OperationModel;
import com.dazhenkeji.cbms.systemManage.service.OperationSerivce;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * created by lgl on 2019/4/4 14:00
 **/
public class BaseController {

    @Autowired
    public OperationSerivce operationSerivce;

    public void saveOperation(){
        OperationModel om = new OperationModel();
        om.setFunId("1");
        om.setOperationalDivisionId("1");
        om.setOperationContent("2");
        om.setOperatorId("1");
        om.setOperationTime(new Date());
        om.setOperationType("1");
        om.setOperatorIp("1");
        om.setServerIp("1");
        operationSerivce.saveOperationLog(om);
    }
}
