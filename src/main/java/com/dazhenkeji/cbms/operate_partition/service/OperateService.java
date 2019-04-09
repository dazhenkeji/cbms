package com.dazhenkeji.cbms.operate_partition.service;

import com.dazhenkeji.cbms.operate_partition.entity.OperatePartition;

import java.util.List;

public interface OperateService {

    List<OperatePartition> findPage(String str);

    void save(OperatePartition operatePartition);

    void update(OperatePartition operatePartition);

    void del(Integer id);

    OperatePartition findById(Integer id);
}
