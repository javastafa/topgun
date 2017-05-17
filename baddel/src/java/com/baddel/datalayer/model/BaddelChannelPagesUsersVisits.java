package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.sql.Timestamp;
import java.io.Serializable;

public class BaddelChannelPagesUsersVisits implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer pageid;

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    private BaddelChannelPages pageidObj;

    public BaddelChannelPages getPageidObj() {
        if (pageidObj == null) {
            pageidObj = BaddelChannelPagesDAO.selectById(this.pageid);
        }
        return pageidObj;
    }

    public void setPageidObj(BaddelChannelPages pageidObj) {
        this.pageidObj = pageidObj;
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

    private Timestamp visittime;

    public Timestamp getVisittime() {
        return visittime;
    }

    public void setVisittime(Timestamp visittime) {
        this.visittime = visittime;
    }

    public BaddelChannelPagesUsersVisits copy() {
        BaddelChannelPagesUsersVisits copyObj = new BaddelChannelPagesUsersVisits();
        copyObj.setId(this.id);
        copyObj.setPageid(this.pageid);
        copyObj.setPageidObj(this.pageidObj);
        copyObj.setUserid(this.userid);
        copyObj.setUseridObj(this.useridObj);
        copyObj.setVisittime(this.visittime);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
