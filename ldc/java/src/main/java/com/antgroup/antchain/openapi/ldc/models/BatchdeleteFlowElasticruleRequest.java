// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class BatchdeleteFlowElasticruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 弹性规则ID列表
    @NameInMap("elastic_rule_ids")
    @Validation(required = true)
    public java.util.List<Long> elasticRuleIds;

    public static BatchdeleteFlowElasticruleRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteFlowElasticruleRequest self = new BatchdeleteFlowElasticruleRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteFlowElasticruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteFlowElasticruleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public BatchdeleteFlowElasticruleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public BatchdeleteFlowElasticruleRequest setElasticRuleIds(java.util.List<Long> elasticRuleIds) {
        this.elasticRuleIds = elasticRuleIds;
        return this;
    }
    public java.util.List<Long> getElasticRuleIds() {
        return this.elasticRuleIds;
    }

}
