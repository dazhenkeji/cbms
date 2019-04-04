package com.dazhenkeji.cbms.base.service;

import com.dazhenkeji.cbms.base.mapper.OperationMapper;
import com.dazhenkeji.cbms.base.model.OperationModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * created by lgl on 2019/4/4 14:11
 **/
@Service
public class OperationSerivceImpl implements OperationSerivce {

    @Resource
    private OperationMapper operationMapper;

    @Override
    public void saveOperationLog(OperationModel operationModel) {

        operationMapper.saveOperation(operationModel);
    }

}
