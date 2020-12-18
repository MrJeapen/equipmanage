package com.whut.equipmanage;

import com.whut.equipmanage.dao.LocationDOMapper;
import com.whut.equipmanage.dao.RouteDOMapper;
import com.whut.equipmanage.dataobject.LocationDO;
import com.whut.equipmanage.dataobject.RouteDO;
import com.whut.equipmanage.test.Monitor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@SpringBootApplication

@MapperScan("com.whut.equipmanage.dao")

public class QeuipmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(QeuipmanageApplication.class, args);



    }




}
