package com.resources.wu.entity;

/**
 * 
 * @Description 定时任务出错现场信息表
 * @author wutao
 * @date 2020/9/27
 */
public class QuartzTaskErrors {
    private Long id;

    /**
    * 任务执行记录Id
    */
    private String taskexecuterecordid;

    /**
    * 信息关键字
    */
    private String errorkey;

    /**
    * 信息内容
    */
    private String errorvalue;

    /**
    * 创建时间
    */
    private Long createtime;

    /**
    * 最近修改时间
    */
    private Long lastmodifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskexecuterecordid() {
        return taskexecuterecordid;
    }

    public void setTaskexecuterecordid(String taskexecuterecordid) {
        this.taskexecuterecordid = taskexecuterecordid;
    }

    public String getErrorkey() {
        return errorkey;
    }

    public void setErrorkey(String errorkey) {
        this.errorkey = errorkey;
    }

    public String getErrorvalue() {
        return errorvalue;
    }

    public void setErrorvalue(String errorvalue) {
        this.errorvalue = errorvalue;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Long lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }
}