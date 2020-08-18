package com.itcc.coll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 任务表
 */
@Data
@TableName("COLL_TASK")
public class Task implements Serializable {

    private String id;

    private String globalId;

    private String taskId;

    private String taskParentId;

    private String taskName;

    private String relyPreId;

    private String relyPreStatus;

    private String taskNodePath;

    private String taskNodeLevel;

    private String taskIsfinished;

    private Date createTime;

    private String description;

    private String remark;

}
