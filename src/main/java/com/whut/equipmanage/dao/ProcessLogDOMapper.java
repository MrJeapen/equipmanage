package com.whut.equipmanage.dao;

import com.whut.equipmanage.dataobject.ProcessLogDO;

public interface ProcessLogDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_process_log
     *
     * @mbg.generated Tue Dec 15 15:21:03 CST 2020
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_process_log
     *
     * @mbg.generated Tue Dec 15 15:21:03 CST 2020
     */
    int insert(ProcessLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_process_log
     *
     * @mbg.generated Tue Dec 15 15:21:03 CST 2020
     */
    int insertSelective(ProcessLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_process_log
     *
     * @mbg.generated Tue Dec 15 15:21:03 CST 2020
     */
    ProcessLogDO selectByPrimaryKey(Integer orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_process_log
     *
     * @mbg.generated Tue Dec 15 15:21:03 CST 2020
     */
    int updateByPrimaryKeySelective(ProcessLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_process_log
     *
     * @mbg.generated Tue Dec 15 15:21:03 CST 2020
     */
    int updateByPrimaryKey(ProcessLogDO record);
}