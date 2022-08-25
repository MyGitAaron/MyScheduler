package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutorHeartbeatEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutorHeartbeatMapper {

    ExecutorHeartbeatEntity selectExecutorHeartbeatById(Long executorHeartbeatId);

    List<ExecutorHeartbeatEntity> selectExecutorHeartbeatList(Map<String, Object> reqParam);

    Integer selectExecutorHeartbeatCount(Map<String, Object> reqParam);

    Integer upsertExecutorHeartbeat(String executorName);

}
