package com.resources.wu.entity;
import java.util.List;
import com.resources.wu.entity.Code;

import java.io.Serializable;

/**
 * code
 */
public class Code implements Serializable {
    private Integer id;

    /**
     * code
     */
    private String code;

    /**
     * pwd
     */
    private String pwd;


    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }





}