package com.diy.entity;

import java.io.Serializable;

/**
 * Created by JAVA on 2018/6/6.
 */
public class Respose implements Serializable {

    private  int code;

    private  boolean success;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
