package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingJobsEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutingJobsMapper {

    ExecutingJobsEntity selectExecutingJobsById(Long executingJobsId);

    Integer deleteExecutingJobsById(Long executingJobsId); 

    List<ExecutingJobsEntity> selectExecutingJobsList(Map<String, Object> reqParam);

    Integer selectExecutingJobsCount(Map<String, Object> reqParam);

    Integer insertExecutingJobs(ExecutingJobsEntity executingJobs);

    Integer updateExecutingJobs(ExecutingJobsEntity executingJobs);

    Integer initExecutingJobs();

    List<ExecutingJobsEntity> getExecutableJobList(Map<String, Object> reqParam);

    Integer setJobsRunning(Map<String, Object> reqParam);

    Integer initExecutingJobsManual(Map<String, Object> reqParam);

    ExecutingJobsEntity getExecutingJobsManual(Map<String, Object> reqParam);

    Integer reInitExecutingJobs(Map<String, Object> reqParam);

    Integer refreshExecutingJobs(Map<String, Object> reqParam);

    List<ExecutingJobsEntity> getUpStreamExecutingJobs(Map<String, Object> reqParam);

    List<ExecutingJobsEntity> getDownStreamExecutingJobs(Map<String, Object> reqParam);

    List<Map> getProjectConfig(Map<String, Object> reqParam);

    Map getProjectByJobName(Map<String, Object> reqParam);

    Long getMaxJobHisId(Map<String, Object> reqParam);

    List<ExecutingJobsEntity> getJobsWithoutJobHisId(Map<String, Object> reqParam);

    Integer updateJobHisIds();
}
