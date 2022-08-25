package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingLogsEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutingLogsMapper {

    ExecutingLogsEntity selectExecutingLogsById(Long executingLogsId);

    Integer deleteExecutingLogsById(Long executingLogsId); 

    List<ExecutingLogsEntity> selectExecutingLogsList(Map<String, Object> reqParam);

    Integer selectExecutingLogsCount(Map<String, Object> reqParam);

    Integer insertExecutingLogs(ExecutingLogsEntity executingLogs);

    Integer updateExecutingLogs(ExecutingLogsEntity executingLogs);

    Integer insertByJobsHisId(ExecutingLogsEntity executingLogs);

}
