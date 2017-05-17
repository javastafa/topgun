package com.baddel.datalayer.model;

import java.io.Serializable;

public class BaddelCurrency implements Serializable {

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

    public BaddelCurrency copy() {
        BaddelCurrency copyObj = new BaddelCurrency();
        copyObj.setId(this.id);
        copyObj.setName(this.name);
        copyObj.setIso(this.iso);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
