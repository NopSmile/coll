package com.itcc.shiro.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserQuery implements Serializable {
    private String name;
    private String pwd;
}
