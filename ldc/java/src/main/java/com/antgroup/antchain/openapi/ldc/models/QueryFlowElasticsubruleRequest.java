// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowElasticsubruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 弹性规则ID
    @NameInMap("elastic_rule_id")
    @Validation(required = true)
    public Long elasticRuleId;

    public static QueryFlowElasticsubruleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowElasticsubruleRequest self = new QueryFlowElasticsubruleRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowElasticsubruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowElasticsubruleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public QueryFlowElasticsubruleRequest setElasticRuleId(Long elasticRuleId) {
        this.elasticRuleId = elasticRuleId;
        return this;
    }
    public Long getElasticRuleId() {
        return this.elasticRuleId;
    }

}
