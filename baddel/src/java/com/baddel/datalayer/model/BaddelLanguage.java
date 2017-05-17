package com.baddel.datalayer.model;

import java.io.Serializable;

public class BaddelLanguage implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
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

    public BaddelLanguage copy() {
        BaddelLanguage copyObj = new BaddelLanguage();
        copyObj.setId(this.id);
        copyObj.setLang(this.lang);
        copyObj.setName(this.name);
        copyObj.setIso(this.iso);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(lang);
    }
}
