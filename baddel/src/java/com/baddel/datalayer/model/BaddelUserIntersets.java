package com.baddel.datalayer.model;

import com.baddel.datalayer.dao.*;
import java.io.Serializable;

public class BaddelUserIntersets implements Serializable {

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

    private Integer intersetid;

    public Integer getIntersetid() {
        return intersetid;
    }

    public void setIntersetid(Integer intersetid) {
        this.intersetid = intersetid;
    }

    private BaddelIntersets intersetidObj;

    public BaddelIntersets getIntersetidObj() {
        if (intersetidObj == null) {
            intersetidObj = BaddelIntersetsDAO.selectById(this.intersetid);
        }
        return intersetidObj;
    }

    public void setIntersetidObj(BaddelIntersets intersetidObj) {
        this.intersetidObj = intersetidObj;
    }

    private Integer intersetweight;

    public Integer getIntersetweight() {
        return intersetweight;
    }

    public void setIntersetweight(Integer intersetweight) {
        this.intersetweight = intersetweight;
    }

    public BaddelUserIntersets copy() {
        BaddelUserIntersets copyObj = new BaddelUserIntersets();
        copyObj.setId(this.id);
        copyObj.setUserid(this.userid);
        copyObj.setUseridObj(this.useridObj);
        copyObj.setIntersetid(this.intersetid);
        copyObj.setIntersetidObj(this.intersetidObj);
        copyObj.setIntersetweight(this.intersetweight);

        return copyObj;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
