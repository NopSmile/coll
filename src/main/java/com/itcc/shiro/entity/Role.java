package com.itcc.shiro.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 角色
 */
@Data
@TableName("COLL_ROLE")
public class Role implements Serializable {

    private String id;

    private String name;

    private String description;

    private List<Permission> permissionList;

}
