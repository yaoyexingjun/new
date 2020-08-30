package com.resources.wu.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class TDiary implements Serializable {
    /**
    * 编号
    */
    private Integer dId;

    /**
    * 日期
    */
    private LocalDate dDate;

    /**
    * 描述
    */
    private String dInfo;

    private static final long serialVersionUID = 1L;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public LocalDate getdDate() {
        return dDate;
    }

    public void setdDate(LocalDate dDate) {
        this.dDate = dDate;
    }

    public String getdInfo() {
        return dInfo;
    }

    public void setdInfo(String dInfo) {
        this.dInfo = dInfo;
    }
}