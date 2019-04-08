package com.dazhenkeji.cbms.systemManage.service;



import com.dazhenkeji.cbms.systemManage.entity.OperationLog;
import com.dazhenkeji.cbms.systemManage.mapper.OperationMapper;
import com.dazhenkeji.cbms.systemManage.model.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//import org.springframework.transaction.annotation.Transactional;

/**
 * created by lgl on 2019/4/4 14:11
 **/
@Service
@Transactional
public class OperationSerivceImpl implements  OperationSerivce{

    @Autowired
    private OperationMapper operationMapper;


    @Override
    public void saveOperationLog(OperationModel operationModel) {
        operationMapper.saveOperation(operationModel);
    }

    @Override
    public List<OperationLog> getOperationList() {
        return operationMapper.getOperationList();
    }
}
