package com.itcc.coll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色权限
 */
@Data
@TableName("COLL_ROLE_PERMISSION")
public class RolePermission implements Serializable {

    private String id;

    private String roleId;

    private String permissionId;

}
