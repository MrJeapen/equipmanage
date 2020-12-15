package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.dataobject.EquipClassDO;
import com.whut.equipmanage.dataobject.EquipDO;
import com.whut.equipmanage.dataobject.RouteDO;
import com.whut.equipmanage.service.impl.InTimeLocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class RouteController {


    @Autowired
    InTimeLocationServiceImpl inTimeLocationService;

    @RequestMapping("/equipClasses")
    public ResponseBean getEquipClasses(){
        ResponseBean responseBean = new ResponseBean();
        List<EquipClassDO> equipClasses = inTimeLocationService.getEquipClasses();
        responseBean.setData(equipClasses);
        return responseBean;
    }


    @RequestMapping("/getEquipsByClassId")
    public ResponseBean getEquipsByClassId(@RequestParam("classId") Integer classId){
        ResponseBean responseBean = new ResponseBean();
        List<EquipDO> equipsById = inTimeLocationService.getEquipsById(classId);
        responseBean.setData(equipsById);
        return  responseBean;
    }


    @RequestMapping("/getRoute")
    public ResponseBean getRoute(@RequestParam("equipid") Integer equipId,
                                 @RequestParam("endtime") Timestamp endTime,
                                 @RequestParam("starttime") Timestamp startTime){

        ResponseBean responseBean = new ResponseBean();
        List<RouteDO> routeByEquipIdAndTime = inTimeLocationService.getRouteByEquipIdAndTime(equipId, startTime, endTime);
        System.out.println(equipId + endTime.toString() + startTime.toString());
        responseBean.setData(routeByEquipIdAndTime);
        return responseBean;
    }


}
