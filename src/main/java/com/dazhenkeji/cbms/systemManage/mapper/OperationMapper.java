package com.dazhenkeji.cbms.systemManage.mapper;




import com.dazhenkeji.cbms.systemManage.entity.OperationLog;
import com.dazhenkeji.cbms.systemManage.model.OperationModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * created by lgl on 2019/4/4 14:14
 **/

public interface OperationMapper {

    public void saveOperation(@Param("om") OperationModel operationModel);

    public List<OperationLog> getOperationList();
}
