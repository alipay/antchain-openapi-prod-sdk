// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteFlowElasticsceneRequest extends TeaModel {
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

    // 弹性规则场景 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static DeleteFlowElasticsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowElasticsceneRequest self = new DeleteFlowElasticsceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowElasticsceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteFlowElasticsceneRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteFlowElasticsceneRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeleteFlowElasticsceneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
