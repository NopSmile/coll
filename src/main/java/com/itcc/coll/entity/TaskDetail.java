package com.itcc.coll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 任务详情表
 */
@Data
@TableName("COLL_TASK_DETAIL")
public class TaskDetail implements Serializable {

    private String id;

    private String globalId;

    private String taskId;

    private String taskName;

    private Date createTime;

    private Date upgradeTime;

    private Date completeTime;

    private String message;

    private String description;

    private String remark;
}
