package com.whut.equipmanage.dataobject;

import java.util.Date;

public class RouteDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_route.equip_id
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    private Integer equipId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_route.longitude
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    private Double longitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_route.latitude
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    private Double latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_route.point_time
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    private Date pointTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_route.equip_id
     *
     * @return the value of t_route.equip_id
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public Integer getEquipId() {
        return equipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_route.equip_id
     *
     * @param equipId the value for t_route.equip_id
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_route.longitude
     *
     * @return the value of t_route.longitude
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_route.longitude
     *
     * @param longitude the value for t_route.longitude
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_route.latitude
     *
     * @return the value of t_route.latitude
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_route.latitude
     *
     * @param latitude the value for t_route.latitude
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_route.point_time
     *
     * @return the value of t_route.point_time
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public Date getPointTime() {
        return pointTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_route.point_time
     *
     * @param pointTime the value for t_route.point_time
     *
     * @mbg.generated Mon Dec 14 19:57:34 CST 2020
     */
    public void setPointTime(Date pointTime) {
        this.pointTime = pointTime;
    }
}