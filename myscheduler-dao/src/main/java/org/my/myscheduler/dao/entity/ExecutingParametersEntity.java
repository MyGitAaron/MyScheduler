package org.my.myscheduler.dao.entity;

import java.io.Serializable;

/**
*generated auto
*/
public class ExecutingParametersEntity implements Serializable {

    private Long executingParametersId;

    private Long executingJobsId;

    private String parameterName;

    private String parameterExpression;

    private String parameterValue;

    private String isDeleted;

    private String inputDate;

    private String inputBy;

    private String stampDate;

    private String modifiedBy;

    public void setExecutingParametersId(Long executingParametersId) {
        this.executingParametersId = executingParametersId;
    }

    public Long getExecutingParametersId() {
        return this.executingParametersId;
    }

    public void setExecutingJobsId(Long executingJobsId) {
        this.executingJobsId = executingJobsId;
    }

    public Long getExecutingJobsId() {
        return this.executingJobsId;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterName() {
        return this.parameterName;
    }

    public String getParameterExpression() {
        return parameterExpression;
    }

    public void setParameterExpression(String parameterExpression) {
        this.parameterExpression = parameterExpression;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public String getParameterValue() {
        return this.parameterValue;
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
