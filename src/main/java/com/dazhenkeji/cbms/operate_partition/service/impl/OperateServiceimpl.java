package com.dazhenkeji.cbms.operate_partition.service.impl;

import com.dazhenkeji.cbms.operate_partition.entity.OperatePartition;
import com.dazhenkeji.cbms.operate_partition.mapper.OperateMapper;
import com.dazhenkeji.cbms.operate_partition.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperateServiceimpl implements OperateService {
    @Autowired
    public OperateMapper operateMapper;

    @Override
    public List<OperatePartition> findPage(String str) {
        return operateMapper.findPage(str);
    }

    @Override
    public void save(OperatePartition operatePartition) {
        operateMapper.save(operatePartition);
    }

    @Override
    public void update(OperatePartition operatePartition) {
        operateMapper.update(operatePartition);
    }

    @Override
    public void del(Integer id) {
        operateMapper.del(id);
    }

    @Override
    public OperatePartition findById(Integer id) {
        return operateMapper.findById(id);
    }
}
