package com.exp.interaudit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.exp.interaudit.mapper")
public class InterauditApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterauditApplication.class, args);

    }

}
