package com.liy.bootliy;

import com.alibaba.fastjson.JSONObject;
import com.liy.bootliy.dao.NumsDao;
import com.liy.bootliy.dao.UserDao;
import com.liy.bootliy.entity.Nums;
import com.liy.bootliy.entity.User;
import com.liy.bootliy.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.List;

@SpringBootTest
class BootLiyApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    HelloService helloService;

    @Autowired
    NumsDao numsDao;

    @Autowired
    UserDao userDao;

    @Test
    void testJpa(){
        User user = userDao.findById(1).get();
        System.out.println(user.toString());
    }

    @Test
    void contextLoads() {
        List<Nums> nums = numsDao.getNums();
        for (Nums num : nums) {
            System.out.println(num.toString());
        }
    }

    @Test
    void getbyId(){
        Nums byId = numsDao.getById(3);
        System.out.println(byId.toString());
    }
    @Test
    void testRedis(){
       redisTemplate.setKeySerializer(new StringRedisSerializer());
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("11","11");
        Object o = ops.get("11");
        System.out.println(JSONObject.toJSON(o));
    }

    @Test
    void restCache(){
        User userById = helloService.getUserById(13);
        System.out.println("test类--"+userById.toString());
    }

}
