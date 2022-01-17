// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CheckApimodelParamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 校检的模型id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 模型引用的id
    @NameInMap("ref_model_id")
    @Validation(required = true)
    public String refModelId;

    public static CheckApimodelParamRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckApimodelParamRequest self = new CheckApimodelParamRequest();
        return TeaModel.build(map, self);
    }

    public CheckApimodelParamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckApimodelParamRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckApimodelParamRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckApimodelParamRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CheckApimodelParamRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CheckApimodelParamRequest setRefModelId(String refModelId) {
        this.refModelId = refModelId;
        return this;
    }
    public String getRefModelId() {
        return this.refModelId;
    }

}
