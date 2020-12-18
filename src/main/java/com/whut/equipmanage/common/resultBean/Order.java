package com.whut.equipmanage.common.resultBean;

import com.whut.equipmanage.dataobject.OrderDO;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order extends OrderDO implements Serializable{

    private String workerName;

    private String publishName;

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    private String theInitTime;

    public String getTheInitTime() {
        return theInitTime;
    }

    public void setTheInitTime(String theInitTime) {
        this.theInitTime = theInitTime;
    }

    public Order(OrderDO orderDO) {

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

//          super();
        this.setInstruction(orderDO.getInstruction());
        this.setOrderId(orderDO.getOrderId());
        this.setPublisher(orderDO.getPublisher());
        this.setStatus(orderDO.getStatus());
        this.setWorkClass(orderDO.getWorkClass());
        this.setWorkerId(orderDO.getWorkerId());
        this.setInitTime((orderDO.getInitTime()));
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

}
