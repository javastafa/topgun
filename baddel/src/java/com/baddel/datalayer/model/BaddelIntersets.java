package com.baddel.datalayer.model;

import java.io.Serializable;

public class BaddelIntersets implements Serializable, DataModel {

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

    public BaddelIntersets copy() {
        BaddelIntersets copyObj = new BaddelIntersets();
        copyObj.setId(this.id);
        copyObj.setName(this.name);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
