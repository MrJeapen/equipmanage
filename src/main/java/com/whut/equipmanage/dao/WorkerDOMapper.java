package com.whut.equipmanage.dao;

import com.whut.equipmanage.dataobject.WorkerDO;

public interface WorkerDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_worker
     *
     * @mbg.generated Tue Dec 15 15:04:24 CST 2020
     */
    int deleteByPrimaryKey(Integer workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_worker
     *
     * @mbg.generated Tue Dec 15 15:04:24 CST 2020
     */
    int insert(WorkerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_worker
     *
     * @mbg.generated Tue Dec 15 15:04:24 CST 2020
     */
    int insertSelective(WorkerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_worker
     *
     * @mbg.generated Tue Dec 15 15:04:24 CST 2020
     */
    WorkerDO selectByPrimaryKey(Integer workerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_worker
     *
     * @mbg.generated Tue Dec 15 15:04:24 CST 2020
     */
    int updateByPrimaryKeySelective(WorkerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_worker
     *
     * @mbg.generated Tue Dec 15 15:04:24 CST 2020
     */
    int updateByPrimaryKey(WorkerDO record);
}