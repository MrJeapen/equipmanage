package com.whut.equipmanage.dataobject;

public class EquipDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_equip.equip_id
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private Integer equipId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_equip.equip_class
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private String equipClass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_equip.equip_name
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private String equipName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_equip.status
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_equip.equip_id
     *
     * @return the value of t_equip.equip_id
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public Integer getEquipId() {
        return equipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_equip.equip_id
     *
     * @param equipId the value for t_equip.equip_id
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_equip.equip_class
     *
     * @return the value of t_equip.equip_class
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public String getEquipClass() {
        return equipClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_equip.equip_class
     *
     * @param equipClass the value for t_equip.equip_class
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setEquipClass(String equipClass) {
        this.equipClass = equipClass == null ? null : equipClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_equip.equip_name
     *
     * @return the value of t_equip.equip_name
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public String getEquipName() {
        return equipName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_equip.equip_name
     *
     * @param equipName the value for t_equip.equip_name
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setEquipName(String equipName) {
        this.equipName = equipName == null ? null : equipName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_equip.status
     *
     * @return the value of t_equip.status
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_equip.status
     *
     * @param status the value for t_equip.status
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}