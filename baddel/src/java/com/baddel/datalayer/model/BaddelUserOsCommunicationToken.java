package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelUserOsCommunicationToken implements Serializable {

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

    private Integer osid;

    public Integer getOsid() {
        return osid;
    }

    public void setOsid(Integer osid) {
        this.osid = osid;
    }

    private BaddelUserOs osidObj;

    public BaddelUserOs getOsidObj() {
        if (osidObj == null) {
            osidObj = BaddelUserOsDAO.selectById(this.osid);
        }
        return osidObj;
    }

    public void setOsidObj(BaddelUserOs osidObj) {
        this.osidObj = osidObj;
    }

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BaddelUserOsCommunicationToken copy() {
        BaddelUserOsCommunicationToken copyObj = new BaddelUserOsCommunicationToken();
        copyObj.setId(this.id);
        copyObj.setUserid(this.userid);
        copyObj.setUseridObj(this.useridObj);
        copyObj.setOsid(this.osid);
        copyObj.setOsidObj(this.osidObj);
        copyObj.setToken(this.token);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(token);
    }
}
