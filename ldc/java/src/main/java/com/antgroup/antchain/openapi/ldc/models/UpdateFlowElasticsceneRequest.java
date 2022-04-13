// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFlowElasticsceneRequest extends TeaModel {
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

    // 弹性场景 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 弹性场景名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 弹性场景状态，可选值（VALID，INVALID）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static UpdateFlowElasticsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowElasticsceneRequest self = new UpdateFlowElasticsceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowElasticsceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFlowElasticsceneRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateFlowElasticsceneRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateFlowElasticsceneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFlowElasticsceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFlowElasticsceneRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
