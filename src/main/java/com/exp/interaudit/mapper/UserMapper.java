package com.exp.interaudit.mapper;

import com.exp.interaudit.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserBean getInfo(String name,String password);
}

