package com.whut.equipmanage.controller;

import com.whut.equipmanage.dao.LocationDOMapper;
import com.whut.equipmanage.dao.RouteDOMapper;
import com.whut.equipmanage.dataobject.LocationDO;
import com.whut.equipmanage.dataobject.RouteDO;
import com.whut.equipmanage.test.Monitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MonitorController {

    @Autowired
    LocationDOMapper locationDOMapper;
    @Autowired
    RouteDOMapper routeDOMapper;

    @RequestMapping("/monitor")
    public String  monitor(){

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                LocationDO locationDO = new LocationDO();
                RouteDO routeDO = new RouteDO();
                routeDO.setEquipId(1);

                double longitude = 114.355;
                double latitude = 30.617340;
                routeDO.setLatitude(latitude);
                routeDO.setLongitude(longitude);

                locationDO.setLatitude(String.valueOf(latitude));
                locationDO.setLongitude(String.valueOf(longitude));
                boolean flag = true;
                locationDO.setEquiId(1);
                int t = 10;
                while(flag){

                    for (int i = 0; i < t; i++) {
                        latitude -= 0.001;
                        locationDO.setLatitude(String.valueOf(latitude));
                        routeDO.setLatitude(latitude);
                        routeDO.setPointTime(new Date());

                        locationDOMapper.updateByPrimaryKey(locationDO);
                        routeDOMapper.insertSelective(routeDO);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    for (int i = 0; i < t; i++) {
                        longitude += 0.001;
                        locationDO.setLongitude(String.valueOf(longitude));
                        routeDO.setLongitude(longitude);
                        routeDO.setPointTime(new Date());
                        locationDOMapper.updateByPrimaryKey(locationDO);
                        routeDOMapper.insertSelective(routeDO);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    for (int i = 0; i < t; i++) {
                        latitude += 0.001;
                        locationDO.setLatitude(String.valueOf(latitude));
                        routeDO.setLatitude(latitude);
                        routeDO.setPointTime(new Date());

                        locationDOMapper.updateByPrimaryKey(locationDO);
                        routeDOMapper.insertSelective(routeDO);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    t--;
                    if(t == 0){
                        flag = false;
                    }
                    for (int i = 0; i < t; i++) {
                        longitude -= 0.001;
                        locationDO.setLongitude(String.valueOf(longitude));
                        routeDO.setLongitude(longitude);
                        routeDO.setPointTime(new Date());
                        locationDOMapper.updateByPrimaryKey(locationDO);
                        routeDOMapper.insertSelective(routeDO);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        return "开始模拟";
    }
}
