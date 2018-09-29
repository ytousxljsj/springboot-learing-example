package com.gj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gj.mapper")
public class SpringBoot6MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot6MybatisApplication.class, args);
    }
}
