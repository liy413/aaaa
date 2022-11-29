package com.liy.bootliy.controller;

import com.liy.bootliy.entity.User;
import com.liy.bootliy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： liy
 * @date： 2022/11/18 0018
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String get(HttpSession session){
         return session.getAttribute("user").toString() + port;
    }

    @GetMapping("/set")
    public String set(HttpSession session){
        session.setAttribute("user","liy");
        return session.getAttribute("user").toString() + port;
    }

    @GetMapping("/hello")
    public User hello(){
        User user = helloService.getUserById(11);

        System.out.println("hello1=---"+user.toString());
        return user;
    }

}
