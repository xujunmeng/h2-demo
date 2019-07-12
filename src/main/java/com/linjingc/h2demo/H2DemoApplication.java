package com.linjingc.h2demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.linjingc.h2demo.dao.*")
public class H2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2DemoApplication.class, args);
    }

}
