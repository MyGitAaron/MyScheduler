package org.my.myscheduler.dao.entity;

import java.io.Serializable;

/**
*generated auto
*/
public class ExecutingCancelInfoEntity implements Serializable {

private Long executingCancelInfoId;

private Long executingJobsId;

private String executorName;

private Integer processId;

private Integer cancelStatus;

private String isDeleted;

private String inputDate;

private String inputBy;

private String stampDate;

private String modifiedBy;

public void setExecutingCancelInfoId(Long executingCancelInfoId) { this.executingCancelInfoId = executingCancelInfoId; } 

public Long getExecutingCancelInfoId() { return this.executingCancelInfoId; }

public void setExecutingJobsId(Long executingJobsId) { this.executingJobsId = executingJobsId; } 

public Long getExecutingJobsId() { return this.executingJobsId; }

public void setExecutorName(String executorName) { this.executorName = executorName; } 

public String getExecutorName() { return this.executorName; }

public void setProcessId(Integer processId) { this.processId = processId; } 

public Integer getProcessId() { return this.processId; }

public void setCancelStatus(Integer cancelStatus) { this.cancelStatus = cancelStatus; } 

public Integer getCancelStatus() { return this.cancelStatus; }

public void setIsDeleted(String isDeleted) { this.isDeleted = isDeleted; } 

public String getIsDeleted() { return this.isDeleted; }

public void setInputDate(String inputDate) { this.inputDate = inputDate; } 

public String getInputDate() { return this.inputDate; }

public void setInputBy(String inputBy) { this.inputBy = inputBy; } 

public String getInputBy() { return this.inputBy; }

public void setStampDate(String stampDate) { this.stampDate = stampDate; } 

public String getStampDate() { return this.stampDate; }

public void setModifiedBy(String modifiedBy) { this.modifiedBy = modifiedBy; } 

public String getModifiedBy() { return this.modifiedBy; }

}
