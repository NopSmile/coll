package com.itcc.coll.mapper;

import com.itcc.coll.entity.Task;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TaskMapper {

    @Select("" +
            "SELECT ct.ID" +
            "    , ct.GLOBAL_ID" +
            "    , ct.TASK_ID" +
            "    , ct.TASK_PARENT_ID" +
            "    , ct.TASK_NAME" +
            "    , ct.RELY_PRE_ID" +
            "    , ct.RELY_PRE_STATUS" +
            "    , ct.TASK_NODE_PATH" +
            "    , ct.TASK_NODE_LEVEL" +
            "    , ct.TASK_ISFINISHED" +
            "    , ct.CREATE_TIME" +
            "    , ct.DESCRIPTION" +
            "    , ct.REMARK" +
            "    FROM COLL_TASK_ROLE ctr" +
            "    LEFT JOIN COLL_TASK ct ON ctr.TASK_ID = ct.TASK_ID" +
            "    WHERE ctr.role_id =  #{roleId} ")
    List<Task> findTaskListByRoleId(@Param("roleId") int roleId);
}
