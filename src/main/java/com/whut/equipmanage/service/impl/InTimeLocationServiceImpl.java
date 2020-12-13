package com.whut.equipmanage.service.impl;

import com.whut.equipmanage.dao.LocationDOMapper;
import com.whut.equipmanage.dataobject.LocationDO;
import com.whut.equipmanage.service.InTimeLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InTimeLocationServiceImpl implements InTimeLocationService {
    @Autowired
    LocationDOMapper locationDOMapper;

    @Override
    public List<LocationDO> getLocations() {

        List<LocationDO> allLocations = locationDOMapper.getAllLocations();
        return allLocations;
    }
}
