package com.itcc.coll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("COLL_PERMISSION")
public class Permission implements Serializable {

    private String id;

    private String name;

    private String url;

}
