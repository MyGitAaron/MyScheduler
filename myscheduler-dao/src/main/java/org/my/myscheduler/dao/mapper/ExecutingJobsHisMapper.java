package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingJobsHisEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutingJobsHisMapper {

    ExecutingJobsHisEntity selectExecutingJobsHisById(Long executingJobsHisId);

    Integer deleteExecutingJobsHisById(Long executingJobsHisId); 

    List<ExecutingJobsHisEntity> selectExecutingJobsHisList(Map<String, Object> reqParam);

    Integer selectExecutingJobsHisCount(Map<String, Object> reqParam);

    Integer insertExecutingJobsHis(ExecutingJobsHisEntity executingJobsHis);

    Integer updateExecutingJobsHis(ExecutingJobsHisEntity executingJobsHis);

    Integer insertByExecutingJobsId(ExecutingJobsHisEntity executingJobsHis);

}
