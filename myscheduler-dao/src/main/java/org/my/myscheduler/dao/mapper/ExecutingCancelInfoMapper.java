package org.my.myscheduler.dao.mapper;

import org.my.myscheduler.dao.entity.ExecutingCancelInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
*generated auto
*/
@Repository
public interface ExecutingCancelInfoMapper {

    ExecutingCancelInfoEntity selectExecutingCancelInfoById(Long executingCancelInfoId);

    Integer deleteExecutingCancelInfoById(Long executingCancelInfoId); 

    List<ExecutingCancelInfoEntity> selectExecutingCancelInfoList(Map<String, Object> reqParam);

    Integer selectExecutingCancelInfoCount(Map<String, Object> reqParam);

    Integer insertExecutingCancelInfo(ExecutingCancelInfoEntity executingCancelInfo);

    Integer updateExecutingCancelInfo(ExecutingCancelInfoEntity executingCancelInfo);

}
