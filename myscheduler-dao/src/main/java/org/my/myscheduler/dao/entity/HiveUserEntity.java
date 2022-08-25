package org.my.myscheduler.dao.entity;

/**
 * Created by TF016468 on 2018/5/11.
 */
public class HiveUserEntity {

    private Integer hiveUserId;

    private String userName;

    private String passwd;

    private String passwdEncode;

    private String isDeleted;

    private String inputDate;

    private String inputBy;

    private String stampDate;

    private String modifiedBy;

    public void setHiveUserId(Integer hiveUserId) {
        this.hiveUserId = hiveUserId;
    }

    public Integer getHiveUserId() {
        return this.hiveUserId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswdEncode(String passwdEncode) {
        this.passwdEncode = passwdEncode;
    }

    public String getPasswdEncode() {
        return this.passwdEncode;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getIsDeleted() {
        return this.isDeleted;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getInputDate() {
        return this.inputDate;
    }

    public void setInputBy(String inputBy) {
        this.inputBy = inputBy;
    }

    public String getInputBy() {
        return this.inputBy;
    }

    public void setStampDate(String stampDate) {
        this.stampDate = stampDate;
    }

    public String getStampDate() {
        return this.stampDate;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedBy() {
        return this.modifiedBy;
    }
}
