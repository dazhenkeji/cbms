package com.dazhenkeji.cbms.operate_partition.controller;

import com.dazhenkeji.cbms.operate_partition.ResultPage;
import com.dazhenkeji.cbms.operate_partition.entity.OperatePartition;
import com.dazhenkeji.cbms.operate_partition.service.OperateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/operate")
public class OperateController {
    @Autowired
    public OperateService operateService;
    @RequestMapping("/findPage.action")
    public ResultPage findPage( Integer PageNum, Integer PageSize, String str){
        PageHelper.startPage(PageNum,PageSize);
        List<OperatePartition> list = operateService.findPage(str);
        PageInfo<OperatePartition> pageInfo = new PageInfo<>(list);
        ResultPage resultPage = new ResultPage();
        resultPage.setRows(pageInfo.getList());
        resultPage.setTotal(pageInfo.getTotal());
        return resultPage;
    }
    @RequestMapping("/save.action")
    public void save(@RequestBody OperatePartition operatePartition){
        operateService.save(operatePartition);
    }
    @RequestMapping("/update.action")
    public void update(OperatePartition operatePartition){
        operateService.update(operatePartition);
    }
    @RequestMapping("/delete.action")
    public void delete (Integer id){
        operateService.del(id);
    }
    @RequestMapping("/findById.action")
    public OperatePartition findById (Integer id){
        return operateService.findById(id);
    }
}
