package com.resources.wu.entity;

/**
 * 
 * @Description 
 * @author wutao
 * @date 2020/9/27
 */
/**
    * 定时任务信息表
    */
public class QuartzTaskInformations {
    private Long id;

    /**
    * 版本号：需要乐观锁控制
    */
    private Integer version;

    /**
    * 任务编号
    */
    private String taskno;

    /**
    * 任务名称
    */
    private String taskname;

    /**
    * 定时规则表达式
    */
    private String schedulerrule;

    /**
    * 冻结状态
    */
    private String frozenstatus;

    /**
    * 执行方
    */
    private String executorno;

    /**
    * 冻结时间
    */
    private Long frozentime;

    /**
    * 解冻时间
    */
    private Long unfrozentime;

    /**
    * 创建时间
    */
    private Long createtime;

    /**
    * 最近修改时间
    */
    private Long lastmodifytime;

    /**
    * 发送方式
    */
    private String sendtype;

    /**
    * 请求地址
    */
    private String url;

    /**
    * 执行参数
    */
    private String executeparamter;

    private String timekey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTaskno() {
        return taskno;
    }

    public void setTaskno(String taskno) {
        this.taskno = taskno;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getSchedulerrule() {
        return schedulerrule;
    }

    public void setSchedulerrule(String schedulerrule) {
        this.schedulerrule = schedulerrule;
    }

    public String getFrozenstatus() {
        return frozenstatus;
    }

    public void setFrozenstatus(String frozenstatus) {
        this.frozenstatus = frozenstatus;
    }

    public String getExecutorno() {
        return executorno;
    }

    public void setExecutorno(String executorno) {
        this.executorno = executorno;
    }

    public Long getFrozentime() {
        return frozentime;
    }

    public void setFrozentime(Long frozentime) {
        this.frozentime = frozentime;
    }

    public Long getUnfrozentime() {
        return unfrozentime;
    }

    public void setUnfrozentime(Long unfrozentime) {
        this.unfrozentime = unfrozentime;
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

    public String getSendtype() {
        return sendtype;
    }

    public void setSendtype(String sendtype) {
        this.sendtype = sendtype;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExecuteparamter() {
        return executeparamter;
    }

    public void setExecuteparamter(String executeparamter) {
        this.executeparamter = executeparamter;
    }

    public String getTimekey() {
        return timekey;
    }

    public void setTimekey(String timekey) {
        this.timekey = timekey;
    }
}