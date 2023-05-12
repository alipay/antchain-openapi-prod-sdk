// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AppStats extends TeaModel {
    // app name
    @NameInMap("app_name")
    public String appName;

    // 异常数
    @NameInMap("exception_total")
    public Long exceptionTotal;

    // 时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 发起方
    @NameInMap("initiator")
    public java.util.List<String> initiator;

    // 参与者
    @NameInMap("participator")
    public java.util.List<String> participator;

    // 今日事务总数
    @NameInMap("today_total")
    public Long todayTotal;

    // Saga模式返回3，其它模式不返回
    @NameInMap("action_mode")
    public Long actionMode;

    // 字段ID
    @NameInMap("id")
    public Long id;

    public static AppStats build(java.util.Map<String, ?> map) throws Exception {
        AppStats self = new AppStats();
        return TeaModel.build(map, self);
    }

    public AppStats setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppStats setExceptionTotal(Long exceptionTotal) {
        this.exceptionTotal = exceptionTotal;
        return this;
    }
    public Long getExceptionTotal() {
        return this.exceptionTotal;
    }

    public AppStats setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppStats setInitiator(java.util.List<String> initiator) {
        this.initiator = initiator;
        return this;
    }
    public java.util.List<String> getInitiator() {
        return this.initiator;
    }

    public AppStats setParticipator(java.util.List<String> participator) {
        this.participator = participator;
        return this;
    }
    public java.util.List<String> getParticipator() {
        return this.participator;
    }

    public AppStats setTodayTotal(Long todayTotal) {
        this.todayTotal = todayTotal;
        return this;
    }
    public Long getTodayTotal() {
        return this.todayTotal;
    }

    public AppStats setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public AppStats setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
