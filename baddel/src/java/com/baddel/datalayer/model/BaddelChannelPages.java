package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelChannelPages implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer channelid;

    public Integer getChannelid() {
        return channelid;
    }

    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

    private BaddelChannel channelidObj;

    public BaddelChannel getChannelidObj() {
        if (channelidObj == null) {
            channelidObj = BaddelChannelDAO.selectById(this.channelid);
        }
        return channelidObj;
    }

    public void setChannelidObj(BaddelChannel channelidObj) {
        this.channelidObj = channelidObj;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaddelChannelPages copy() {
        BaddelChannelPages copyObj = new BaddelChannelPages();
        copyObj.setId(this.id);
        copyObj.setChannelid(this.channelid);
        copyObj.setChannelidObj(this.channelidObj);
        copyObj.setName(this.name);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
