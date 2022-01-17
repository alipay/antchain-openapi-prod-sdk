// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class DeleteApimodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api_model_id
    @NameInMap("api_model_id")
    @Validation(required = true)
    public String apiModelId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static DeleteApimodelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApimodelRequest self = new DeleteApimodelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApimodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteApimodelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteApimodelRequest setApiModelId(String apiModelId) {
        this.apiModelId = apiModelId;
        return this;
    }
    public String getApiModelId() {
        return this.apiModelId;
    }

    public DeleteApimodelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteApimodelRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
