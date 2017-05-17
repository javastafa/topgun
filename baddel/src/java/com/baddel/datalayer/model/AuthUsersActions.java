package com.baddel.datalayer.model;

import java.io.Serializable;

public class AuthUsersActions implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String actionname;

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname;
    }
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AuthUsersActions copy() {
        AuthUsersActions copyObj = new AuthUsersActions();
        copyObj.setId(this.id);
        copyObj.setActionname(this.actionname);
        copyObj.setDescription(this.description);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(actionname);
    }
}
