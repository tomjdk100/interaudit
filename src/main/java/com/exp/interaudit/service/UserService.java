package com.exp.interaudit.service;

import com.exp.interaudit.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name,String password);
}
