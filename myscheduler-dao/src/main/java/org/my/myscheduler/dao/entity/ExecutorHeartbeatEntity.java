package org.my.myscheduler.dao.entity;

import java.io.Serializable;

/**
*generated auto
*/
public class ExecutorHeartbeatEntity implements Serializable {

    private String executorName;

    private String heartBeatTime;

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public String getExecutorName() {
        return this.executorName;
    }

    public void setHeartBeatTime(String heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
    }

    public String getHeartBeatTime() {
        return this.heartBeatTime;
    }
}
