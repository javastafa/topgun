package com.baddel.datalayer.model;

import java.sql.Timestamp;
import java.io.Serializable;

public class BaddelUser implements Serializable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    private String seconname;

    public String getSeconname() {
        return seconname;
    }

    public void setSeconname(String seconname) {
        this.seconname = seconname;
    }
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public BaddelUser copy() {
        BaddelUser copyObj = new BaddelUser();
        copyObj.setId(this.id);
        copyObj.setUsername(this.username);
        copyObj.setPassword(this.password);
        copyObj.setFirstname(this.firstname);
        copyObj.setSeconname(this.seconname);
        copyObj.setEmail(this.email);
        copyObj.setCreated(this.created);
        copyObj.setUpdated(this.updated);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(username);
    }
}
