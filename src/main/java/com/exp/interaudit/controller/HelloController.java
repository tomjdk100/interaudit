package com.exp.interaudit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/idnex")
    public String sayHello(){
        return "index";
    }




}
