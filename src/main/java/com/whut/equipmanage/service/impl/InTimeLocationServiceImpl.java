package com.whut.equipmanage.service.impl;

import com.whut.equipmanage.dao.EquipClassDOMapper;
import com.whut.equipmanage.dao.EquipDOMapper;
import com.whut.equipmanage.dao.LocationDOMapper;
import com.whut.equipmanage.dao.RouteDOMapper;
import com.whut.equipmanage.dataobject.EquipClassDO;
import com.whut.equipmanage.dataobject.EquipDO;
import com.whut.equipmanage.dataobject.LocationDO;
import com.whut.equipmanage.dataobject.RouteDO;
import com.whut.equipmanage.service.InTimeLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InTimeLocationServiceImpl implements InTimeLocationService {
    @Autowired
    LocationDOMapper locationDOMapper;

    @Autowired
    EquipClassDOMapper equipClassDOMapper;

    @Autowired
    EquipDOMapper equipDOMapper;

    @Autowired
    RouteDOMapper routeDOMapper;
    @Override
    public List<LocationDO> getLocations() {

        List<LocationDO> allLocations = locationDOMapper.getAllLocations();
        return allLocations;
    }

    @Override
    public List<EquipClassDO> getEquipClasses() {
        List<EquipClassDO> equpClasses = equipClassDOMapper.getEqupClasses();
        return equpClasses;
    }

    @Override
    public List<EquipDO> getEquipsById(Integer classId) {
        List<EquipDO> equipsByClassId = equipDOMapper.getEquipsByClassId(classId);
        return  equipsByClassId;
    }

    @Override
    public List<RouteDO> getRouteByEquipIdAndTime(Integer id, Date startTime, Date endTime) {
        return routeDOMapper.getRouteByEquipIdAndTime(id, startTime, endTime);
    }
}
