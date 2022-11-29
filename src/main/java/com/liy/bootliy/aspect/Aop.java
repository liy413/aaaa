package com.liy.bootliy.aspect;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： liy
 * @date： 2022/11/19 0019
 */

@Aspect
@Component
public class Aop {

    @Pointcut("execution(* com.liy.bootliy.controller.*.*(..))")
    public void pointCut(){
        System.out.println("进入切面类");
    }

    @Before(value = "pointCut()")
    public void before(){
        System.out.println("前面执行");
    }

    @AfterReturning(returning = "ret",value = "pointCut()")
    public void after(Object ret){
        System.out.println("后面执行--"+ JSONObject.toJSONString(ret));
    }
}
