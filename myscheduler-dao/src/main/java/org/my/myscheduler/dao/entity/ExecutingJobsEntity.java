package org.my.myscheduler.dao.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aaron on 2018/4/18.
 */
public class ExecutingJobsEntity implements Serializable {

    private Long executingJobsId;

    private String jobName;

    private Integer executingType;

    private String executingPeriod;

    private String jobScript;

    private String jobScriptDate;

    private Integer priority;

    private Integer jobStatus;

    private Integer retries;

    private Integer retriesInterval;

    private Integer attempt;

    private String submitTime;

    private String startTime;

    private String endTime;

    private String executorName;

    private Integer executeTimes;

    private String isDeleted;

    private String inputDate;

    private String inputBy;

    private String stampDate;

    private String modifiedBy;

    private Integer processId;

    private Long jobHisId;

    public void setExecutingJobsId(Long executingJobsId) {
        this.executingJobsId = executingJobsId;
    }

    public Long getExecutingJobsId() {
        return this.executingJobsId;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobName() {
        return this.jobName;
    }

    public void setExecutingType(Integer executingType) {
        this.executingType = executingType;
    }

    public Integer getExecutingType() {
        return this.executingType;
    }

    public void setExecutingPeriod(String executingPeriod) {
        this.executingPeriod = executingPeriod;
    }

    public String getExecutingPeriod() {
        return this.executingPeriod;
    }

    public void setJobScript(String jobScript) {
        this.jobScript = jobScript;
    }

    public String getJobScript() {
        return this.jobScript;
    }

    public void setJobScriptDate(String jobScriptDate) {
        this.jobScriptDate = jobScriptDate;
    }

    public String getJobScriptDate() {
        return this.jobScriptDate;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getRetries() {
        return this.retries;
    }

    public void setRetriesInterval(Integer retriesInterval) {
        this.retriesInterval = retriesInterval;
    }

    public Integer getRetriesInterval() {
        return this.retriesInterval;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public String getSubmitTime() {
        return this.submitTime;
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

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public String getExecutorName() {
        return this.executorName;
    }

    public void setExecuteTimes(Integer executeTimes) {
        this.executeTimes = executeTimes;
    }

    public Integer getExecuteTimes() {
        return this.executeTimes;
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

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Long getJobHisId() {
        return jobHisId;
    }

    public void setJobHisId(Long jobHisId) {
        this.jobHisId = jobHisId;
    }

    private String jobPeriod;

    /**
     * 获取任务的周期信息，临时变量
     * @return
     */
    public String getJobPeriod() {
        return jobPeriod;
    }

    /**
     * 设置任务的周期信息，临时变量
     */
    public void setJobPeriod(String jobPeriod) {
        this.jobPeriod = jobPeriod;
    }

    private List<ExecutingJobsEntity> children;

    public List<ExecutingJobsEntity> getChildren() {
        return children;
    }

    public void setChildren(List<ExecutingJobsEntity> children) {
        this.children = children;
    }
}
