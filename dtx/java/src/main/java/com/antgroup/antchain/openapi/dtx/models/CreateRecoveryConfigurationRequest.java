// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateRecoveryConfigurationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // actionMode取值：1代表TCC模式，2是FMT模式
    @NameInMap("action_mode")
    public Long actionMode;

    // activityMode取值：1是同库模式，2是异库模式，3是Saga模式
    @NameInMap("activity_mode")
    @Validation(required = true)
    public Long activityMode;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 业务码
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 应用描述
    @NameInMap("desc")
    public String desc;

    // 环境的唯一标识
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 如果修改biztype，要穿老的bizType
    @NameInMap("old_biztype")
    public String oldBiztype;

    // role取值：1是发起方，2是参与者
    @NameInMap("role")
    @Validation(required = true)
    public Long role;

    // split_rule
    @NameInMap("split_rule")
    public SplitRule splitRule;

    // Saga状态机的json定义
    @NameInMap("content")
    public String content;

    public static CreateRecoveryConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecoveryConfigurationRequest self = new CreateRecoveryConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecoveryConfigurationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRecoveryConfigurationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRecoveryConfigurationRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public CreateRecoveryConfigurationRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateRecoveryConfigurationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRecoveryConfigurationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateRecoveryConfigurationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateRecoveryConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRecoveryConfigurationRequest setOldBiztype(String oldBiztype) {
        this.oldBiztype = oldBiztype;
        return this;
    }
    public String getOldBiztype() {
        return this.oldBiztype;
    }

    public CreateRecoveryConfigurationRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public CreateRecoveryConfigurationRequest setSplitRule(SplitRule splitRule) {
        this.splitRule = splitRule;
        return this;
    }
    public SplitRule getSplitRule() {
        return this.splitRule;
    }

    public CreateRecoveryConfigurationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
