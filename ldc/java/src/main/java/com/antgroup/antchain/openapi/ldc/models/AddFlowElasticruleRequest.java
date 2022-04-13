// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddFlowElasticruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // MSGBROKER 需要填写。
    // 弹性规则消息类型事件码。
    // 如果包含所有eventCode，可以用英文星号"*"表示。
    @NameInMap("event_codes")
    public java.util.List<String> eventCodes;

    // 弹性规则方法名称，RPC类型需要填写。
    // 如果包含所有方法，则填写英文星号"*"
    @NameInMap("methods")
    public java.util.List<String> methods;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 弹性规则类型，包括：APP、RPC、MSGBROKER，ANTQ
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // 适用的弹性场景名称
    @NameInMap("scene_name")
    @Validation(required = true)
    public String sceneName;

    // 弹性规则服务名称。
    // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
    // APP：对应应用名，例如：cif。
    // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 弹性规则状态，有效值：VALID（线上生效）、PRESS（仅压测生效）、INVALID（无效状态）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // MSGBROKER 和 ANTQ 需要填写。
    // 弹性规则消息类型topic。
    // 如果包含所有topic，可以用英文星号"*"表示。
    @NameInMap("topic")
    public String topic;

    // 是否使用默认EID（默认 false）
    @NameInMap("use_default_eid")
    public Boolean useDefaultEid;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static AddFlowElasticruleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFlowElasticruleRequest self = new AddFlowElasticruleRequest();
        return TeaModel.build(map, self);
    }

    public AddFlowElasticruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddFlowElasticruleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddFlowElasticruleRequest setEventCodes(java.util.List<String> eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    public AddFlowElasticruleRequest setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    public AddFlowElasticruleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddFlowElasticruleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public AddFlowElasticruleRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public AddFlowElasticruleRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public AddFlowElasticruleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddFlowElasticruleRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public AddFlowElasticruleRequest setUseDefaultEid(Boolean useDefaultEid) {
        this.useDefaultEid = useDefaultEid;
        return this;
    }
    public Boolean getUseDefaultEid() {
        return this.useDefaultEid;
    }

    public AddFlowElasticruleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
