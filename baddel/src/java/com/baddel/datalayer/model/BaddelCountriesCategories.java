package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelCountriesCategories implements Serializable {

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

    private Integer categoryid;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    private BaddelCategories categoryidObj;

    public BaddelCategories getCategoryidObj() {
        if (categoryidObj == null) {
            categoryidObj = BaddelCategoriesDAO.selectById(this.categoryid);
        }
        return categoryidObj;
    }

    public void setCategoryidObj(BaddelCategories categoryidObj) {
        this.categoryidObj = categoryidObj;
    }

    public BaddelCountriesCategories copy() {
        BaddelCountriesCategories copyObj = new BaddelCountriesCategories();
        copyObj.setId(this.id);
        copyObj.setCountryid(this.countryid);
        copyObj.setCountryidObj(this.countryidObj);
        copyObj.setCategoryid(this.categoryid);
        copyObj.setCategoryidObj(this.categoryidObj);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
