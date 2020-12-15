package com.whut.equipmanage.service;

import com.whut.equipmanage.dataobject.EquipClassDO;
import com.whut.equipmanage.dataobject.EquipDO;
import com.whut.equipmanage.dataobject.LocationDO;
import com.whut.equipmanage.dataobject.RouteDO;

import java.util.Date;
import java.util.List;

public interface InTimeLocationService {


    List<LocationDO> getLocations();

    List<EquipClassDO> getEquipClasses();

    List<EquipDO> getEquipsById(Integer classId);

    List<RouteDO> getRouteByEquipIdAndTime(Integer id, Date startTime, Date endTime);
}
