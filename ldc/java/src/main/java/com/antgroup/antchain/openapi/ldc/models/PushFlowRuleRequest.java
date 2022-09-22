// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PushFlowRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 包含系统列表，目前功能不支持，禁止设置
    @NameInMap("apps")
    public java.util.List<String> apps;

    // 是否灰度（默认 false）
    @NameInMap("gray")
    public Boolean gray;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 推送中间件流量规则时，是否同时推送中间件中枢
    @NameInMap("push_all")
    public Boolean pushAll;

    // 规则类型,支持(ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR,TAO_BAO_RULE)
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // 规则文本
    @NameInMap("rule_value")
    @Validation(required = true)
    public String ruleValue;

    // 推送目标列表，域外支持 MIDDLEWARE（微服务/中间件）、ALB（统一接入） 两种
    @NameInMap("targets")
    public java.util.List<String> targets;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 是否覆盖其他应用的规则，默认 false
    @NameInMap("override")
    public Boolean override;

    public static PushFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PushFlowRuleRequest self = new PushFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public PushFlowRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushFlowRuleRequest setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public PushFlowRuleRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public PushFlowRuleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public PushFlowRuleRequest setPushAll(Boolean pushAll) {
        this.pushAll = pushAll;
        return this;
    }
    public Boolean getPushAll() {
        return this.pushAll;
    }

    public PushFlowRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public PushFlowRuleRequest setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
        return this;
    }
    public String getRuleValue() {
        return this.ruleValue;
    }

    public PushFlowRuleRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public PushFlowRuleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public PushFlowRuleRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

}
