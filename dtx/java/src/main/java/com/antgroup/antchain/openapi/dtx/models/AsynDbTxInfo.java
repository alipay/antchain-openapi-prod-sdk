// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AsynDbTxInfo extends TeaModel {
    // action_mode
    @NameInMap("action_mode")
    public Long actionMode;

    // activity_mode
    @NameInMap("activity_mode")
    @Validation(required = true)
    public Long activityMode;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // desc
    @NameInMap("desc")
    public String desc;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // role
    @NameInMap("role")
    @Validation(required = true)
    public Long role;

    // split_rule
    @NameInMap("split_rule")
    public SplitRule splitRule;

    public static AsynDbTxInfo build(java.util.Map<String, ?> map) throws Exception {
        AsynDbTxInfo self = new AsynDbTxInfo();
        return TeaModel.build(map, self);
    }

    public AsynDbTxInfo setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public AsynDbTxInfo setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public AsynDbTxInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AsynDbTxInfo setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public AsynDbTxInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AsynDbTxInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AsynDbTxInfo setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public AsynDbTxInfo setSplitRule(SplitRule splitRule) {
        this.splitRule = splitRule;
        return this;
    }
    public SplitRule getSplitRule() {
        return this.splitRule;
    }

}
