package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.sql.Timestamp;
import java.io.Serializable;

public class BaddelProducts implements Serializable, DataModel {

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

    private Integer countrycategorybrandid;

    public Integer getCountrycategorybrandid() {
        return countrycategorybrandid;
    }

    public void setCountrycategorybrandid(Integer countrycategorybrandid) {
        this.countrycategorybrandid = countrycategorybrandid;
    }

    private BaddelCountriesCategoriesBrands countrycategorybrandidObj;

    public BaddelCountriesCategoriesBrands getCountrycategorybrandidObj() {
        if (countrycategorybrandidObj == null) {
            countrycategorybrandidObj = BaddelCountriesCategoriesBrandsDAO.selectById(this.countrycategorybrandid);
        }
        return countrycategorybrandidObj;
    }

    public void setCountrycategorybrandidObj(BaddelCountriesCategoriesBrands countrycategorybrandidObj) {
        this.countrycategorybrandidObj = countrycategorybrandidObj;
    }

    private Integer productstatus;

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    private BaddelProductStatus productstatusObj;

    public BaddelProductStatus getProductstatusObj() {
        if (productstatusObj == null) {
            productstatusObj = BaddelProductStatusDAO.selectById(this.productstatus);
        }
        return productstatusObj;
    }

    public void setProductstatusObj(BaddelProductStatus productstatusObj) {
        this.productstatusObj = productstatusObj;
    }

    private Timestamp created;

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    private Timestamp updated;

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
    private String productdescription;

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    private Integer productitemscount;

    public Integer getProductitemscount() {
        return productitemscount;
    }

    public void setProductitemscount(Integer productitemscount) {
        this.productitemscount = productitemscount;
    }

    public BaddelProducts copy() {
        BaddelProducts copyObj = new BaddelProducts();
        copyObj.setId(this.id);
        copyObj.setName(this.name);
        copyObj.setCountrycategorybrandid(this.countrycategorybrandid);
        copyObj.setCountrycategorybrandidObj(this.countrycategorybrandidObj);
        copyObj.setProductstatus(this.productstatus);
        copyObj.setProductstatusObj(this.productstatusObj);
        copyObj.setCreated(this.created);
        copyObj.setUpdated(this.updated);
        copyObj.setProductdescription(this.productdescription);
        copyObj.setProductitemscount(this.productitemscount);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
