package com.exp.interaudit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/idnex")
    public String sayHello(){
        System.out.println("test dev");
        System.out.println("test dev");
        System.out.println("test dev");
        System.out.println("test dev");
        return "index";
    }




}
