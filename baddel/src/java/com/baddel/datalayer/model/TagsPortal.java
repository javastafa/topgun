package com.baddel.datalayer.model;

import java.io.Serializable;

public class TagsPortal implements Serializable, DataModel {

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

    private Integer itemid;

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    private Integer tagid;

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }
    private String tagvalue;

    public String getTagvalue() {
        return tagvalue;
    }

    public void setTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
    }

    public TagsPortal copy() {
        TagsPortal copyObj = new TagsPortal();
        copyObj.setId(this.id);
        copyObj.setItemtype(this.itemtype);
        copyObj.setItemid(this.itemid);
        copyObj.setTagid(this.tagid);
        copyObj.setTagvalue(this.tagvalue);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(tagvalue);
    }
}
