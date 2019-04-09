package com.dazhenkeji.cbms.operate_partition.mapper;

import com.dazhenkeji.cbms.operate_partition.entity.OperatePartition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperateMapper {
    List<OperatePartition> findPage(@Param("str")String str);

    void save(OperatePartition operatePartition);

    void update(OperatePartition operatePartition);

    void del(Integer id);

    OperatePartition findById(Integer id);
}
