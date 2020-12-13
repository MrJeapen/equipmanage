package com.whut.equipmanage.controller.map;

import com.whut.equipmanage.common.ResponseBean;
import com.whut.equipmanage.dataobject.LocationDO;
import com.whut.equipmanage.service.InTimeLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InTimeLocationComtroller {

    @Autowired
    InTimeLocationService locationService;

    @RequestMapping("/alllocations")
    public ResponseBean getInTimeLocation(){

        List<LocationDO> locations = locationService.getLocations();
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(locations);
        return responseBean;
    }
}
