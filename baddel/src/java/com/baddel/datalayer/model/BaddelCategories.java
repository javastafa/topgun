package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelCategories implements Serializable {

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

    private Integer parentid;

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    private BaddelCategories parentidObj;

    public BaddelCategories getParentidObj() {
        if (parentidObj == null) {
            parentidObj = BaddelCategoriesDAO.selectById(this.parentid);
        }
        return parentidObj;
    }

    public void setParentidObj(BaddelCategories parentidObj) {
        this.parentidObj = parentidObj;
    }

    private Boolean cancontainproducts;

    public Boolean getCancontainproducts() {
        return cancontainproducts;
    }

    public void setCancontainproducts(Boolean cancontainproducts) {
        this.cancontainproducts = cancontainproducts;
    }

    public BaddelCategories copy() {
        BaddelCategories copyObj = new BaddelCategories();
        copyObj.setId(this.id);
        copyObj.setName(this.name);
        copyObj.setParentid(this.parentid);
        copyObj.setParentidObj(this.parentidObj);
        copyObj.setCancontainproducts(this.cancontainproducts);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
