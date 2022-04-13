// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExportFlowRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 参与规则生成的应用列表
    @NameInMap("apps")
    public java.util.List<String> apps;

    // 是否灰度（默认 false）
    @NameInMap("gray")
    public Boolean gray;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 规则类型，支持(ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR,TAO_BAO_RULE)
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 是否进行规则校验，默认 false
    @NameInMap("check")
    public Boolean check;

    public static ExportFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportFlowRuleRequest self = new ExportFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public ExportFlowRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportFlowRuleRequest setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public ExportFlowRuleRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public ExportFlowRuleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ExportFlowRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ExportFlowRuleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ExportFlowRuleRequest setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

}
