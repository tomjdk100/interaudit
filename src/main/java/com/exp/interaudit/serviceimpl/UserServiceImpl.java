package com.exp.interaudit.serviceimpl;

import com.exp.interaudit.bean.UserBean;
import com.exp.interaudit.mapper.UserMapper;
import com.exp.interaudit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //将DAO注入service层
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserBean loginIn(String name, String password) {
        System.out.println("test commit");
        System.out.println("test dev");
            return userMapper.getInfo( name,password);
    }





}
