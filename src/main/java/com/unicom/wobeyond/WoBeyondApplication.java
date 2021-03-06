package com.unicom.wobeyond;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.unicom.wobeyond.mapper")
public class WoBeyondApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoBeyondApplication.class, args);
    }
}
