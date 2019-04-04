package com.dazhenkeji.cbms.base.mapper;

import com.dazhenkeji.cbms.base.model.OperationModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * created by lgl on 2019/4/4 14:14
 **/
@Mapper
public interface OperationMapper {

    public void saveOperation(OperationModel operationModel);
}
