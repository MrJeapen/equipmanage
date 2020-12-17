package com.whut.equipmanage.common.resultBean;

import java.io.Serializable;

public class DetailBean implements Serializable {

    private String item;
    private String detail;

    public String getItem() {
        return item;
    }

    public DetailBean(String item, String detail) {
        this.item = item;
        this.detail = detail;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
