package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingParametersEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutingParametersMapper {

    ExecutingParametersEntity selectExecutingParametersById(Long executingParametersId);

    Integer deleteExecutingParametersById(Long executingParametersId); 

    List<ExecutingParametersEntity> selectExecutingParametersList(Map<String, Object> reqParam);

    Integer selectExecutingParametersCount(Map<String, Object> reqParam);

    Integer insertExecutingParameters(ExecutingParametersEntity executingParameters);

    Integer updateExecutingParameters(ExecutingParametersEntity executingParameters);

    Integer initExecutingParameters();

    Integer initParametersByExecutingJobsId(Map<String, Object> reqParam);

    Integer updateParametersByExecutingJobsId(Map<String, Object> reqParam);

    Integer deleteParametersByExecutingJobsId(Map<String, Object> reqParam);
}
