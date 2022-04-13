// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteFlowElasticruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 弹性规则 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static DeleteFlowElasticruleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowElasticruleRequest self = new DeleteFlowElasticruleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowElasticruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteFlowElasticruleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteFlowElasticruleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeleteFlowElasticruleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
