package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelCountryLanguages implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer countryid;

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    private BaddelCountry countryidObj;

    public BaddelCountry getCountryidObj() {
        if (countryidObj == null) {
            countryidObj = BaddelCountryDAO.selectById(this.countryid);
        }
        return countryidObj;
    }

    public void setCountryidObj(BaddelCountry countryidObj) {
        this.countryidObj = countryidObj;
    }

    private Integer languageid;

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }

    private BaddelLanguage languageidObj;

    public BaddelLanguage getLanguageidObj() {
        if (languageidObj == null) {
            languageidObj = BaddelLanguageDAO.selectById(this.languageid);
        }
        return languageidObj;
    }

    public void setLanguageidObj(BaddelLanguage languageidObj) {
        this.languageidObj = languageidObj;
    }

    public BaddelCountryLanguages copy() {
        BaddelCountryLanguages copyObj = new BaddelCountryLanguages();
        copyObj.setId(this.id);
        copyObj.setCountryid(this.countryid);
        copyObj.setCountryidObj(this.countryidObj);
        copyObj.setLanguageid(this.languageid);
        copyObj.setLanguageidObj(this.languageidObj);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
