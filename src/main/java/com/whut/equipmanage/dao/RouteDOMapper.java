package com.whut.equipmanage.dao;

import com.whut.equipmanage.dataobject.RouteDO;

public interface RouteDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int deleteByPrimaryKey(Integer equipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int insert(RouteDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int insertSelective(RouteDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    RouteDO selectByPrimaryKey(Integer equipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int updateByPrimaryKeySelective(RouteDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_route
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int updateByPrimaryKey(RouteDO record);
}