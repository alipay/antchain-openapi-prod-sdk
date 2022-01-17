// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class DeleteApimodelParamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型参数id
    @NameInMap("param_id")
    @Validation(required = true)
    public String paramId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 最外层的父类模型id
    @NameInMap("api_model_id")
    @Validation(required = true)
    public String apiModelId;

    public static DeleteApimodelParamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApimodelParamRequest self = new DeleteApimodelParamRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApimodelParamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteApimodelParamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteApimodelParamRequest setParamId(String paramId) {
        this.paramId = paramId;
        return this;
    }
    public String getParamId() {
        return this.paramId;
    }

    public DeleteApimodelParamRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteApimodelParamRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DeleteApimodelParamRequest setApiModelId(String apiModelId) {
        this.apiModelId = apiModelId;
        return this;
    }
    public String getApiModelId() {
        return this.apiModelId;
    }

}
