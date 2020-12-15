package com.whut.equipmanage.dao;

import com.whut.equipmanage.dataobject.RouteDO;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface RouteDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    int insert(RouteDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    int insertSelective(RouteDO record);

    List<RouteDO> getRouteByEquipIdAndTime(Integer equipId, Date startTime, Date endTime);
}