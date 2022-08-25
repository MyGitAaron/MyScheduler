package org.my.myscheduler.dao.entity;

import java.io.Serializable;

/**
*generated auto
*/
public class ExecutingConstraintsEntity implements Serializable {

    private Long executingConstraintsId;

    private Long executingJobsId;

    private Integer depType;

    private String depJob;

    private String depJobPeriod;

    private String depTime;

    private String isDeleted;

    private String inputDate;

    private String inputBy;

    private String stampDate;

    private String modifiedBy;

    public void setExecutingConstraintsId(Long executingConstraintsId) {
        this.executingConstraintsId = executingConstraintsId;
    }

    public Long getExecutingConstraintsId() {
        return this.executingConstraintsId;
    }

    public void setExecutingJobsId(Long executingJobsId) {
        this.executingJobsId = executingJobsId;
    }

    public Long getExecutingJobsId() {
        return this.executingJobsId;
    }

    public void setDepType(Integer depType) {
        this.depType = depType;
    }

    public Integer getDepType() {
        return this.depType;
    }

    public void setDepJob(String depJob) {
        this.depJob = depJob;
    }

    public String getDepJob() {
        return this.depJob;
    }

    public void setDepJobPeriod(String depJobPeriod) {
        this.depJobPeriod = depJobPeriod;
    }

    public String getDepJobPeriod() {
        return this.depJobPeriod;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getDepTime() {
        return this.depTime;
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
