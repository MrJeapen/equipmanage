package com.whut.equipmanage.common.resultBean;

import java.util.Date;

import java.io.Serializable;

public class ProcessLog implements Serializable{

    private Long oriderId;

    private String equipName;

    private String workName;

    private String note;

    private Date startTime;

    private Date endTime;

    public ProcessLog( ) { }

    public Long getOriderId() {
        return oriderId;
    }

    public void setOriderId(Long oriderId) {
        this.oriderId = oriderId;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
