package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelCountriesCategoriesBrands implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer countrycategoryid;

    public Integer getCountrycategoryid() {
        return countrycategoryid;
    }

    public void setCountrycategoryid(Integer countrycategoryid) {
        this.countrycategoryid = countrycategoryid;
    }

    private BaddelCountriesCategories countrycategoryidObj;

    public BaddelCountriesCategories getCountrycategoryidObj() {
        if (countrycategoryidObj == null) {
            countrycategoryidObj = BaddelCountriesCategoriesDAO.selectById(this.countrycategoryid);
        }
        return countrycategoryidObj;
    }

    public void setCountrycategoryidObj(BaddelCountriesCategories countrycategoryidObj) {
        this.countrycategoryidObj = countrycategoryidObj;
    }

    private Integer brandid;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    private BaddelBrands brandidObj;

    public BaddelBrands getBrandidObj() {
        if (brandidObj == null) {
            brandidObj = BaddelBrandsDAO.selectById(this.brandid);
        }
        return brandidObj;
    }

    public void setBrandidObj(BaddelBrands brandidObj) {
        this.brandidObj = brandidObj;
    }

    public BaddelCountriesCategoriesBrands copy() {
        BaddelCountriesCategoriesBrands copyObj = new BaddelCountriesCategoriesBrands();
        copyObj.setId(this.id);
        copyObj.setCountrycategoryid(this.countrycategoryid);
        copyObj.setCountrycategoryidObj(this.countrycategoryidObj);
        copyObj.setBrandid(this.brandid);
        copyObj.setBrandidObj(this.brandidObj);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
