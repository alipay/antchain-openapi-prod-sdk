// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddFlowElasticsubruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 消息eventCode, MSGBROKER必填
    @NameInMap("event_code")
    public String eventCode;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 父规则ID
    @NameInMap("parent_id")
    @Validation(required = true)
    public Long parentId;

    // 规则值, RPC必填
    @NameInMap("rpc_method")
    public String rpcMethod;

    // 所属规则类型，可选值：RPC, MSGBROKER, ANTQ, APP
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // VALID("线上生效"), PRESS("仅压测生效"), INVALID("无效状态");
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 消息topic, MSGBROKER和ANTQ必填
    @NameInMap("topic")
    public String topic;

    // 是否使用默认eid, RPC必填
    @NameInMap("use_default_eid")
    public Boolean useDefaultEid;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static AddFlowElasticsubruleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFlowElasticsubruleRequest self = new AddFlowElasticsubruleRequest();
        return TeaModel.build(map, self);
    }

    public AddFlowElasticsubruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddFlowElasticsubruleRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public AddFlowElasticsubruleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddFlowElasticsubruleRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public AddFlowElasticsubruleRequest setRpcMethod(String rpcMethod) {
        this.rpcMethod = rpcMethod;
        return this;
    }
    public String getRpcMethod() {
        return this.rpcMethod;
    }

    public AddFlowElasticsubruleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public AddFlowElasticsubruleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddFlowElasticsubruleRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public AddFlowElasticsubruleRequest setUseDefaultEid(Boolean useDefaultEid) {
        this.useDefaultEid = useDefaultEid;
        return this;
    }
    public Boolean getUseDefaultEid() {
        return this.useDefaultEid;
    }

    public AddFlowElasticsubruleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
