// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConnectorJobInfo extends TeaModel {
    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 任务的调度类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 任务描述
    @NameInMap("remark")
    public String remark;

    // 任务状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 所属应用
    @NameInMap("app")
    @Validation(required = true)
    public String app;

    // 工单状态
    @NameInMap("process_status")
    @Validation(required = true)
    public String processStatus;

    // 系统标签
    @NameInMap("sys_labels")
    public java.util.List<String> sysLabels;

    // 应用标签
    @NameInMap("user_labels")
    public java.util.List<String> userLabels;

    // 事件订阅是否开启
    @NameInMap("event_sub_enabled")
    public Boolean eventSubEnabled;

    public static ConnectorJobInfo build(java.util.Map<String, ?> map) throws Exception {
        ConnectorJobInfo self = new ConnectorJobInfo();
        return TeaModel.build(map, self);
    }

    public ConnectorJobInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConnectorJobInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConnectorJobInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ConnectorJobInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ConnectorJobInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ConnectorJobInfo setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public ConnectorJobInfo setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public ConnectorJobInfo setSysLabels(java.util.List<String> sysLabels) {
        this.sysLabels = sysLabels;
        return this;
    }
    public java.util.List<String> getSysLabels() {
        return this.sysLabels;
    }

    public ConnectorJobInfo setUserLabels(java.util.List<String> userLabels) {
        this.userLabels = userLabels;
        return this;
    }
    public java.util.List<String> getUserLabels() {
        return this.userLabels;
    }

    public ConnectorJobInfo setEventSubEnabled(Boolean eventSubEnabled) {
        this.eventSubEnabled = eventSubEnabled;
        return this;
    }
    public Boolean getEventSubEnabled() {
        return this.eventSubEnabled;
    }

}
