package com.dazhenkeji.cbms.base.mapper;

import org.apache.ibatis.annotations.Param;

import com.dazhenkeji.cbms.base.model.OperationModel;


/**
 * created by lgl on 2019/4/4 14:14
 **/

public interface OperationMapper {

    public void saveOperation(@Param("om") OperationModel operationModel);
}
