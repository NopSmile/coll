package com.itcc.coll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户
 */
@Data
@TableName("COLL_USER")
public class User implements Serializable {

    private String id;

    private String username;

    private String userpassword;

    private Date createtime;

    private String salt;

    private String userstatus;
    /**
     * 角色集合
     */
    private List<Role> roleList;

}
