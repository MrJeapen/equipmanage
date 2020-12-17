package com.whut.equipmanage.common.resultBean;

import java.io.Serializable;

public class TokenBean implements Serializable {
    private String access_token;

    public TokenBean(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
