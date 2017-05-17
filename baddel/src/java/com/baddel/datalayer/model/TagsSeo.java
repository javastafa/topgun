package com.baddel.datalayer.model;

import java.io.Serializable;

public class TagsSeo implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String tagtype;

    public String getTagtype() {
        return tagtype;
    }

    public void setTagtype(String tagtype) {
        this.tagtype = tagtype;
    }
    private String tagvalue;

    public String getTagvalue() {
        return tagvalue;
    }

    public void setTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
    }

    public TagsSeo copy() {
        TagsSeo copyObj = new TagsSeo();
        copyObj.setId(this.id);
        copyObj.setTagtype(this.tagtype);
        copyObj.setTagvalue(this.tagvalue);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(tagtype);
    }
}
