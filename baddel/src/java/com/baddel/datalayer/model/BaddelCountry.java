package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelCountry implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String iso;

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    private Integer currencyid;

    public Integer getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Integer currencyid) {
        this.currencyid = currencyid;
    }

    private BaddelCurrency currencyidObj;

    public BaddelCurrency getCurrencyidObj() {
        if (currencyidObj == null) {
            currencyidObj = BaddelCurrencyDAO.selectById(this.currencyid);
        }
        return currencyidObj;
    }

    public void setCurrencyidObj(BaddelCurrency currencyidObj) {
        this.currencyidObj = currencyidObj;
    }

    public BaddelCountry copy() {
        BaddelCountry copyObj = new BaddelCountry();
        copyObj.setId(this.id);
        copyObj.setName(this.name);
        copyObj.setIso(this.iso);
        copyObj.setCurrencyid(this.currencyid);
        copyObj.setCurrencyidObj(this.currencyidObj);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
