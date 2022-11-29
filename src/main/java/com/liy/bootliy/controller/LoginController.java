package com.liy.bootliy.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： liy
 * @date： 2022/11/27 0027
 */
@RestController
public class LoginController {

    @PostMapping("/dologin")
    public String login(String userName, String password){
        System.out.println(userName+"  "+password);
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(userName,password));
        return "登陆成功";
    }

}
