package com.exp.interaudit;

import com.exp.interaudit.bean.UserBean;
import com.exp.interaudit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lyfstart
 * @create 2019-11-04-23:53
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads(){
        UserBean userBean = userService.loginIn("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }
}
