package com.whut.equipmanage.dataobject;

public class DetailDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_detail.detail_id
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private Integer detailId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_detail.tyre_pressure
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private String tyrePressure;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_detail.oil
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private String oil;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_detail.engine_oil
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private String engineOil;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_detail.screw
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    private String screw;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_detail.detail_id
     *
     * @return the value of t_detail.detail_id
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public Integer getDetailId() {
        return detailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_detail.detail_id
     *
     * @param detailId the value for t_detail.detail_id
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_detail.tyre_pressure
     *
     * @return the value of t_detail.tyre_pressure
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public String getTyrePressure() {
        return tyrePressure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_detail.tyre_pressure
     *
     * @param tyrePressure the value for t_detail.tyre_pressure
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setTyrePressure(String tyrePressure) {
        this.tyrePressure = tyrePressure == null ? null : tyrePressure.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_detail.oil
     *
     * @return the value of t_detail.oil
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public String getOil() {
        return oil;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_detail.oil
     *
     * @param oil the value for t_detail.oil
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setOil(String oil) {
        this.oil = oil == null ? null : oil.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_detail.engine_oil
     *
     * @return the value of t_detail.engine_oil
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public String getEngineOil() {
        return engineOil;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_detail.engine_oil
     *
     * @param engineOil the value for t_detail.engine_oil
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setEngineOil(String engineOil) {
        this.engineOil = engineOil == null ? null : engineOil.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_detail.screw
     *
     * @return the value of t_detail.screw
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public String getScrew() {
        return screw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_detail.screw
     *
     * @param screw the value for t_detail.screw
     *
     * @mbg.generated Sun Dec 13 14:21:34 CST 2020
     */
    public void setScrew(String screw) {
        this.screw = screw == null ? null : screw.trim();
    }
}