package com.whut.equipmanage.dao;

import com.whut.equipmanage.dataobject.LocationDO;

public interface LocationDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_location
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int deleteByPrimaryKey(Integer equiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_location
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int insert(LocationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_location
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int insertSelective(LocationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_location
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    LocationDO selectByPrimaryKey(Integer equiId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_location
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int updateByPrimaryKeySelective(LocationDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_location
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int updateByPrimaryKey(LocationDO record);
}