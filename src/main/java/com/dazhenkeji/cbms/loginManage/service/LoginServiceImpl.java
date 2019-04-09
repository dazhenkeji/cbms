package com.dazhenkeji.cbms.loginManage.service;

import com.dazhenkeji.cbms.loginManage.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName LoginServiceImpl
 * @Description
 * @Author hp
 * @Date 2019/4/914:04
 **/
@Service
@Transactional
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper mapper;

    @Override
    public String checkUserAndPassword(String userName, String password) {
        return mapper.checkUserAndPassword(userName,password);
    }
}
