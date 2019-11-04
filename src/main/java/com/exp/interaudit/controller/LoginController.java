package com.exp.interaudit.controller;

import com.exp.interaudit.bean.UserBean;
import com.exp.interaudit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login (String name,String password){
        UserBean userBean = userService.loginIn(name, password);
        if(userBean != null){
            return "success";
        }else{
            return "error";
        }
    }



}
