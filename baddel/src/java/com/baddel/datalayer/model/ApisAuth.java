package com.baddel.datalayer.model;

import java.io.Serializable;

public class ApisAuth implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String authKey;

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
    private String authValue;

    public String getAuthValue() {
        return authValue;
    }

    public void setAuthValue(String authValue) {
        this.authValue = authValue;
    }

    public ApisAuth copy() {
        ApisAuth copyObj = new ApisAuth();
        copyObj.setId(this.id);
        copyObj.setAuthKey(this.authKey);
        copyObj.setAuthValue(this.authValue);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(authKey);
    }
}
