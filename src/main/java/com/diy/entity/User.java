package com.diy.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by JAVA on 2018/6/6.
 */


@ApiModel(value = "用户对象", description = "user2")
public class User implements Serializable{


    @ApiModelProperty(value = "用户id",example = "11")
    private int id;

    @ApiModelProperty(value = "用户名称")
    private String username;


    @ApiModelProperty(hidden=true)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
