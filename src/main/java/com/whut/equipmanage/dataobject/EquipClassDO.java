package com.whut.equipmanage.dataobject;

import java.io.Serializable;

public class EquipClassDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_equip_class.class_id
     *
     * @mbg.generated Mon Dec 14 18:00:41 CST 2020
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_equip_class.class_name
     *
     * @mbg.generated Mon Dec 14 18:00:41 CST 2020
     */
    private String className;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_equip_class.class_id
     *
     * @return the value of t_equip_class.class_id
     *
     * @mbg.generated Mon Dec 14 18:00:41 CST 2020
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_equip_class.class_id
     *
     * @param classId the value for t_equip_class.class_id
     *
     * @mbg.generated Mon Dec 14 18:00:41 CST 2020
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_equip_class.class_name
     *
     * @return the value of t_equip_class.class_name
     *
     * @mbg.generated Mon Dec 14 18:00:41 CST 2020
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_equip_class.class_name
     *
     * @param className the value for t_equip_class.class_name
     *
     * @mbg.generated Mon Dec 14 18:00:41 CST 2020
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}