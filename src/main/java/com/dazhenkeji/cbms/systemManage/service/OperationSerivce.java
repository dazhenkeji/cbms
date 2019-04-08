package com.dazhenkeji.cbms.systemManage.service;

import com.dazhenkeji.cbms.systemManage.entity.OperationLog;
import com.dazhenkeji.cbms.systemManage.model.OperationModel;

import java.util.List;

/**
 * created by lgl on 2019/4/4 14:10
 **/

public interface  OperationSerivce {

    public void saveOperationLog(OperationModel operationModel);
    //public OperationModel getOperation(OperationModel operationModel);
    public List<OperationLog> getOperationList();

}
