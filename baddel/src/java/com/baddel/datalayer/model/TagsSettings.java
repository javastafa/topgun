package com.baddel.datalayer.model;

import java.io.Serializable;

public class TagsSettings implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer itemtype;

    public Integer getItemtype() {
        return itemtype;
    }

    public void setItemtype(Integer itemtype) {
        this.itemtype = itemtype;
    }
    private String tagname;

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    private Boolean iscmstagged;

    public Boolean getIscmstagged() {
        return iscmstagged;
    }

    public void setIscmstagged(Boolean iscmstagged) {
        this.iscmstagged = iscmstagged;
    }

    private Boolean isportaltagged;

    public Boolean getIsportaltagged() {
        return isportaltagged;
    }

    public void setIsportaltagged(Boolean isportaltagged) {
        this.isportaltagged = isportaltagged;
    }

    public TagsSettings copy() {
        TagsSettings copyObj = new TagsSettings();
        copyObj.setId(this.id);
        copyObj.setItemtype(this.itemtype);
        copyObj.setTagname(this.tagname);
        copyObj.setIscmstagged(this.iscmstagged);
        copyObj.setIsportaltagged(this.isportaltagged);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(tagname);
    }
}
