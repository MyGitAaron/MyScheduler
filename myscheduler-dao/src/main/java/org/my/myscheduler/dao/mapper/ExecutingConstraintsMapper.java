package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingConstraintsEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutingConstraintsMapper {

    ExecutingConstraintsEntity selectExecutingConstraintsById(Long executingConstraintsId);

    Integer deleteExecutingConstraintsById(Long executingConstraintsId); 

    List<ExecutingConstraintsEntity> selectExecutingConstraintsList(Map<String, Object> reqParam);

    Integer selectExecutingConstraintsCount(Map<String, Object> reqParam);

    Integer insertExecutingConstraints(ExecutingConstraintsEntity executingConstraints);

    Integer updateExecutingConstraints(ExecutingConstraintsEntity executingConstraints);

    Integer initExecutingConstraints();

    Integer initConstraintsByExecutingJobsId(Map<String, Object> reqParam);

    Integer deleteConstraintsByExecutingJobsId0(Map<String, Object> reqParam);

    Integer deleteConstraintsByExecutingJobsId1(Map<String, Object> reqParam);

    Integer deleteConstraintsByExecutingJobsId2(Map<String, Object> reqParam);
}
