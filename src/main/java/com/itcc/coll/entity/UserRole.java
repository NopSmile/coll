package com.itcc.coll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("COLL_USER_ROLE")
public class UserRole implements Serializable {
    private String id;
    private String userId;
    private String roleId;
    private String remarks;
}
