package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelUserLoginChannelsToken implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    private BaddelUser useridObj;

    public BaddelUser getUseridObj() {
        if (useridObj == null) {
            useridObj = BaddelUserDAO.selectById(this.userid);
        }
        return useridObj;
    }

    public void setUseridObj(BaddelUser useridObj) {
        this.useridObj = useridObj;
    }

    private Integer loginchannelid;

    public Integer getLoginchannelid() {
        return loginchannelid;
    }

    public void setLoginchannelid(Integer loginchannelid) {
        this.loginchannelid = loginchannelid;
    }

    private BaddelUserLoginChannels loginchannelidObj;

    public BaddelUserLoginChannels getLoginchannelidObj() {
        if (loginchannelidObj == null) {
            loginchannelidObj = BaddelUserLoginChannelsDAO.selectById(this.loginchannelid);
        }
        return loginchannelidObj;
    }

    public void setLoginchannelidObj(BaddelUserLoginChannels loginchannelidObj) {
        this.loginchannelidObj = loginchannelidObj;
    }

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BaddelUserLoginChannelsToken copy() {
        BaddelUserLoginChannelsToken copyObj = new BaddelUserLoginChannelsToken();
        copyObj.setId(this.id);
        copyObj.setUserid(this.userid);
        copyObj.setUseridObj(this.useridObj);
        copyObj.setLoginchannelid(this.loginchannelid);
        copyObj.setLoginchannelidObj(this.loginchannelidObj);
        copyObj.setToken(this.token);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(token);
    }
}
