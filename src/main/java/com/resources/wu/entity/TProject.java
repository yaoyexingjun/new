package com.resources.wu.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class TProject implements Serializable {
    /**
    * 编号
    */
    private Integer pId;

    /**
    * 项目名称
    */
    private String pName;

    /**
    * 客户名称
    */
    private String pCustname;

    /**
    * 项目资金
    */
    private Integer pMoney;

    /**
    * 起始日期
    */
    private LocalDate pStartday;

    /**
    * 交付日期
    */
    private LocalDate pEndday;

    /**
    * 项目状态
    */
    private Object pState;

    /**
    * 客户负责人姓名
    */
    private String pProname;

    /**
    * 客户负责人电话
    */
    private String pProphone;

    private static final long serialVersionUID = 1L;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCustname() {
        return pCustname;
    }

    public void setpCustname(String pCustname) {
        this.pCustname = pCustname;
    }

    public Integer getpMoney() {
        return pMoney;
    }

    public void setpMoney(Integer pMoney) {
        this.pMoney = pMoney;
    }

    public LocalDate getpStartday() {
        return pStartday;
    }

    public void setpStartday(LocalDate pStartday) {
        this.pStartday = pStartday;
    }

    public LocalDate getpEndday() {
        return pEndday;
    }

    public void setpEndday(LocalDate pEndday) {
        this.pEndday = pEndday;
    }

    public Object getpState() {
        return pState;
    }

    public void setpState(Object pState) {
        this.pState = pState;
    }

    public String getpProname() {
        return pProname;
    }

    public void setpProname(String pProname) {
        this.pProname = pProname;
    }

    public String getpProphone() {
        return pProphone;
    }

    public void setpProphone(String pProphone) {
        this.pProphone = pProphone;
    }
}