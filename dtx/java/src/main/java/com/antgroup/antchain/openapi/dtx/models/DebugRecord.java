// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DebugRecord extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 1：发起方联调，2：参与者联调
    @NameInMap("debug_type")
    @Validation(required = true)
    public Long debugType;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 记录id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 发起方信息
    @NameInMap("initiator")
    @Validation(required = true)
    public DebugInitiator initiator;

    // 环境唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 执行人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 参与者信息
    @NameInMap("participator")
    @Validation(required = true)
    public DebugParticipator participator;

    // 状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 联调结果信息
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    public static DebugRecord build(java.util.Map<String, ?> map) throws Exception {
        DebugRecord self = new DebugRecord();
        return TeaModel.build(map, self);
    }

    public DebugRecord setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DebugRecord setDebugType(Long debugType) {
        this.debugType = debugType;
        return this;
    }
    public Long getDebugType() {
        return this.debugType;
    }

    public DebugRecord setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DebugRecord setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DebugRecord setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DebugRecord setInitiator(DebugInitiator initiator) {
        this.initiator = initiator;
        return this;
    }
    public DebugInitiator getInitiator() {
        return this.initiator;
    }

    public DebugRecord setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DebugRecord setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DebugRecord setParticipator(DebugParticipator participator) {
        this.participator = participator;
        return this;
    }
    public DebugParticipator getParticipator() {
        return this.participator;
    }

    public DebugRecord setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DebugRecord setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
