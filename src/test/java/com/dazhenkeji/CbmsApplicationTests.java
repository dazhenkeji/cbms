package com.dazhenkeji;

import com.dazhenkeji.cbms.operate_partition.entity.OperatePartition;
import com.dazhenkeji.cbms.operate_partition.mapper.OperateMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CbmsApplicationTests {
    @Autowired
    public OperateMapper operateMapper;
    @Test
    public void contextLoads() {
        OperatePartition operatePartition = new OperatePartition();
        operatePartition.setCode(12);
        operatePartition.setHead("ul");
        operatePartition.setOperateName("jiuba");
        operatePartition.setRegionName("bali");
        operateMapper.save(operatePartition);
    }

}
