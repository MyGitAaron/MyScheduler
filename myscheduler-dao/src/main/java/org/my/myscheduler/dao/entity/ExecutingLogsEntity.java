package org.my.myscheduler.dao.entity;

import java.io.Serializable;

/**
*generated auto
*/
public class ExecutingLogsEntity implements Serializable {

    private Long executingJobsHisId;

    private Long executingLogsId;

    private Long executingJobsId;

    private String executorName;

    private Integer jobStatus;

    private Integer attempt;

    private String startTime;

    private String endTime;

    private String log;

    private String isDeleted;

    private String inputDate;

    private String inputBy;

    private String stampDate;

    private String modifiedBy;

    public void setExecutingJobsHisId(Long executingJobsHisId) {
        this.executingJobsHisId = executingJobsHisId;
    }

    public Long getExecutingJobsHisId() {
        return this.executingJobsHisId;
    }

    public void setExecutingLogsId(Long executingLogsId) {
        this.executingLogsId = executingLogsId;
    }

    public Long getExecutingLogsId() {
        return this.executingLogsId;
    }

    public void setExecutingJobsId(Long executingJobsId) {
        this.executingJobsId = executingJobsId;
    }

    public Long getExecutingJobsId() {
        return this.executingJobsId;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public String getExecutorName() {
        return this.executorName;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public Integer getAttempt() {
        return this.attempt;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLog() {
        return this.log;
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
