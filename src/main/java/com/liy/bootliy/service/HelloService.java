package com.liy.bootliy.service;

import com.liy.bootliy.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： liy
 * @date： 2022/11/21 0021
 */
@Service
@CacheConfig(cacheNames = "redis")
public class HelloService{


    @Cacheable(key = "#id")
    public User getUserById(Integer id){
        User user = new User();
        user.setId(111);
        user.setName("liy");
        System.out.println("--进入service方法--"+user.toString());
        return user;
    }
}
