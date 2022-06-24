package com.bosssoft.hr.javase.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.bosssoft.hr.javase.springexample.dao")
@MapperScan("com.bosssoft.hr.javase.springexample.dao")
public class SpringexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringexampleApplication.class, args);
    }

}
