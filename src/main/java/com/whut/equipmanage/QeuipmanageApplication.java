package com.whut.equipmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.whut.equipmanage.dao")
public class QeuipmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(QeuipmanageApplication.class, args);
    }

}
