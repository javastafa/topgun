package com.baddel.datalayer.model;

import java.io.Serializable;

public class ApisPages implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String apiname;

    public String getApiname() {
        return apiname;
    }

    public void setApiname(String apiname) {
        this.apiname = apiname;
    }
    private String apidescription;

    public String getApidescription() {
        return apidescription;
    }

    public void setApidescription(String apidescription) {
        this.apidescription = apidescription;
    }
    private String apiurl;

    public String getApiurl() {
        return apiurl;
    }

    public void setApiurl(String apiurl) {
        this.apiurl = apiurl;
    }

    private Boolean issecure;

    public Boolean getIssecure() {
        return issecure;
    }

    public void setIssecure(Boolean issecure) {
        this.issecure = issecure;
    }

    public ApisPages copy() {
        ApisPages copyObj = new ApisPages();
        copyObj.setId(this.id);
        copyObj.setApiname(this.apiname);
        copyObj.setApidescription(this.apidescription);
        copyObj.setApiurl(this.apiurl);
        copyObj.setIssecure(this.issecure);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(apiname);
    }
}
