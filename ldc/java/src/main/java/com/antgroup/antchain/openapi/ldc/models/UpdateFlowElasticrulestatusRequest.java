// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFlowElasticrulestatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 命名空间
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

    // VALID("线上生效"), PRESS("仅压测生效"),  INVALID("无效状态");
    @NameInMap("new_status")
    @Validation(required = true)
    public String newStatus;

    public static UpdateFlowElasticrulestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowElasticrulestatusRequest self = new UpdateFlowElasticrulestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowElasticrulestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFlowElasticrulestatusRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateFlowElasticrulestatusRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateFlowElasticrulestatusRequest setElasticRuleIds(java.util.List<Long> elasticRuleIds) {
        this.elasticRuleIds = elasticRuleIds;
        return this;
    }
    public java.util.List<Long> getElasticRuleIds() {
        return this.elasticRuleIds;
    }

    public UpdateFlowElasticrulestatusRequest setNewStatus(String newStatus) {
        this.newStatus = newStatus;
        return this;
    }
    public String getNewStatus() {
        return this.newStatus;
    }

}
