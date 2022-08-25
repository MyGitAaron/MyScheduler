package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingConstraintsHisEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutingConstraintsHisMapper {

    ExecutingConstraintsHisEntity selectExecutingConstraintsHisById(Long executingConstraintsHisId);

    Integer deleteExecutingConstraintsHisById(Long executingConstraintsHisId); 

    List<ExecutingConstraintsHisEntity> selectExecutingConstraintsHisList(Map<String, Object> reqParam);

    Integer selectExecutingConstraintsHisCount(Map<String, Object> reqParam);

    Integer insertExecutingConstraintsHis(ExecutingConstraintsHisEntity executingConstraintsHis);

    Integer updateExecutingConstraintsHis(ExecutingConstraintsHisEntity executingConstraintsHis);

    Integer copyExecutingConstraintsToHis(Map<String, Object> reqParam);
}
