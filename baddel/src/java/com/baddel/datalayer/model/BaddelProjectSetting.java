package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelProjectSetting implements Serializable, DataModel {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String settingkey;

    public String getSettingkey() {
        return settingkey;
    }

    public void setSettingkey(String settingkey) {
        this.settingkey = settingkey;
    }
    private String settingvalue;

    public String getSettingvalue() {
        return settingvalue;
    }

    public void setSettingvalue(String settingvalue) {
        this.settingvalue = settingvalue;
    }

    private Integer project;

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    private BaddelProject projectObj;

    public BaddelProject getProjectObj() {
        if (projectObj == null) {
            projectObj = BaddelProjectDAO.selectById(this.project);
        }
        return projectObj;
    }

    public void setProjectObj(BaddelProject projectObj) {
        this.projectObj = projectObj;
    }

    public BaddelProjectSetting copy() {
        BaddelProjectSetting copyObj = new BaddelProjectSetting();
        copyObj.setId(this.id);
        copyObj.setSettingkey(this.settingkey);
        copyObj.setSettingvalue(this.settingvalue);
        copyObj.setProject(this.project);
        copyObj.setProjectObj(this.projectObj);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(settingkey);
    }
}
