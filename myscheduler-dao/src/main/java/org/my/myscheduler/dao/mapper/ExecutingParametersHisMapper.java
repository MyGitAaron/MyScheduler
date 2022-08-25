package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingParametersHisEntity;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
//@Repository
public interface ExecutingParametersHisMapper {

    ExecutingParametersHisEntity selectExecutingParametersHisById(Long executingParametersHisId);

    Integer deleteExecutingParametersHisById(Long executingParametersHisId); 

    List<ExecutingParametersHisEntity> selectExecutingParametersHisList(Map<String, Object> reqParam);

    Integer selectExecutingParametersHisCount(Map<String, Object> reqParam);

    Integer insertExecutingParametersHis(ExecutingParametersHisEntity executingParametersHis);

    Integer updateExecutingParametersHis(ExecutingParametersHisEntity executingParametersHis);

    Integer copyExecutingParametersToHis(Map<String, Object> reqParam);

}
