// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 规则类型：ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR
    @NameInMap("rule_type")
    @Validation(required = true)
    public String ruleType;

    public static QueryFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowRuleRequest self = new QueryFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowRuleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryFlowRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
