package com.whut.equipmanage.dao;

import com.whut.equipmanage.dataobject.EquipDO;

public interface EquipDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_equip
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int deleteByPrimaryKey(Integer equipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_equip
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int insert(EquipDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_equip
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int insertSelective(EquipDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_equip
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    EquipDO selectByPrimaryKey(Integer equipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_equip
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int updateByPrimaryKeySelective(EquipDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_equip
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    int updateByPrimaryKey(EquipDO record);
}