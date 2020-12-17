package com.whut.equipmanage.common.resultBean;

import com.whut.equipmanage.dataobject.CheckDO;

import java.io.Serializable;
import java.util.Date;


public class Check implements Serializable {


    private String equipName;

    private String equipClass;

    private String checkTime;

    private String workerName;

    private String workerPhone;

    private String note;

    private Integer detailId;

    public Check() { }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getEquipClass() {
        return equipClass;
    }

    public void setEquipClass(String equipClass) {
        this.equipClass = equipClass;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }
}
