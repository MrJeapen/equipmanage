package com.whut.equipmanage.dao;

import com.whut.equipmanage.dataobject.OrderDO;
import com.whut.equipmanage.common.resultBean.Order;

import java.util.List;

public interface OrderDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Tue Dec 15 15:01:22 CST 2020
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Tue Dec 15 15:01:22 CST 2020
     */
    int insert(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Tue Dec 15 15:01:22 CST 2020
     */
    int insertSelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Tue Dec 15 15:01:22 CST 2020
     */
    OrderDO selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Tue Dec 15 15:01:22 CST 2020
     */
    int updateByPrimaryKeySelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order
     *
     * @mbg.generated Tue Dec 15 15:01:22 CST 2020
     */
    int updateByPrimaryKey(OrderDO record);

    //查询全部作业发布
    List<OrderDO> commonQuery(int start, int limit);


    Integer getLogCount();
}