package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.sql.Timestamp;
import java.io.Serializable;

public class AuthUsersActionsLog implements Serializable {

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

    private AuthUser useridObj;

    public AuthUser getUseridObj() {
        if (useridObj == null) {
            useridObj = AuthUserDAO.selectById(this.userid);
        }
        return useridObj;
    }

    public void setUseridObj(AuthUser useridObj) {
        this.useridObj = useridObj;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private Integer actionid;

    public Integer getActionid() {
        return actionid;
    }

    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }

    private AuthUsersActions actionidObj;

    public AuthUsersActions getActionidObj() {
        if (actionidObj == null) {
            actionidObj = AuthUsersActionsDAO.selectById(this.actionid);
        }
        return actionidObj;
    }

    public void setActionidObj(AuthUsersActions actionidObj) {
        this.actionidObj = actionidObj;
    }

    private Timestamp actiondate;

    public Timestamp getActiondate() {
        return actiondate;
    }

    public void setActiondate(Timestamp actiondate) {
        this.actiondate = actiondate;
    }
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public AuthUsersActionsLog copy() {
        AuthUsersActionsLog copyObj = new AuthUsersActionsLog();
        copyObj.setId(this.id);
        copyObj.setUserid(this.userid);
        copyObj.setUseridObj(this.useridObj);
        copyObj.setUsername(this.username);
        copyObj.setActionid(this.actionid);
        copyObj.setActionidObj(this.actionidObj);
        copyObj.setActiondate(this.actiondate);
        copyObj.setDescription(this.description);
        copyObj.setIp(this.ip);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(username);
    }
}
