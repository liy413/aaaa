package com.liy.bootliy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
//@MapperScan(basePackages = "com.liy.bootliy.dao")
public class BootLiyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootLiyApplication.class, args);
    }

}
