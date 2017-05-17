package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.sql.Timestamp;
import java.io.Serializable;

public class ApisBlackedlistedIps implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private Integer blockingtype;

    public Integer getBlockingtype() {
        return blockingtype;
    }

    public void setBlockingtype(Integer blockingtype) {
        this.blockingtype = blockingtype;
    }

    private ApisBlockingTypes blockingtypeObj;

    public ApisBlockingTypes getBlockingtypeObj() {
        if (blockingtypeObj == null) {
            blockingtypeObj = ApisBlockingTypesDAO.selectById(this.blockingtype);
        }
        return blockingtypeObj;
    }

    public void setBlockingtypeObj(ApisBlockingTypes blockingtypeObj) {
        this.blockingtypeObj = blockingtypeObj;
    }

    private String blockingreason;

    public String getBlockingreason() {
        return blockingreason;
    }

    public void setBlockingreason(String blockingreason) {
        this.blockingreason = blockingreason;
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

    public ApisBlackedlistedIps copy() {
        ApisBlackedlistedIps copyObj = new ApisBlackedlistedIps();
        copyObj.setId(this.id);
        copyObj.setIp(this.ip);
        copyObj.setBlockingtype(this.blockingtype);
        copyObj.setBlockingtypeObj(this.blockingtypeObj);
        copyObj.setBlockingreason(this.blockingreason);
        copyObj.setCreated(this.created);
        copyObj.setUpdated(this.updated);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(ip);
    }
}
