package com.dazhenkeji.cbms.base.service;

import com.dazhenkeji.cbms.base.model.OperationModel;
import org.springframework.stereotype.Service;

/**
 * created by lgl on 2019/4/4 14:10
 **/

public interface  OperationSerivce {

    public void saveOperationLog(OperationModel operationModel);

}
