package com.whut.equipmanage.test;

import com.whut.equipmanage.dao.LocationDOMapper;
import com.whut.equipmanage.dao.RouteDOMapper;
import com.whut.equipmanage.dataobject.LocationDO;
import com.whut.equipmanage.dataobject.RouteDO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Monitor implements Runnable {

    @Autowired
     LocationDOMapper locationDOMapper;
    @Autowired
     RouteDOMapper routeDOMapper;

    @Override
    public void run() {
        // 更新定位
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
        while(flag){
            int t = 10;
            for (int i = 0; i < t; i++) {
                latitude -= 0.001;
                locationDO.setLatitude(String.valueOf(latitude));
                routeDO.setLatitude(latitude);
                routeDO.setPointTime(new Date());

                locationDOMapper.updateByPrimaryKey(locationDO);
                routeDOMapper.insertSelective(routeDO);
                try {
                    Thread.sleep(2000);
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
                    Thread.sleep(2000);
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
                    Thread.sleep(2000);
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
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Thread thread = new Thread(monitor);
        thread.start();
    }
}
