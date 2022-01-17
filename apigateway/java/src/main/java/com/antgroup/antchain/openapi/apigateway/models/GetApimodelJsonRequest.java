// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GetApimodelJsonRequest extends TeaModel {
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

    // model_type
    @NameInMap("model_type")
    public String modelType;

    // 是否使用默认值
    @NameInMap("use_default")
    public Boolean useDefault;

    public static GetApimodelJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApimodelJsonRequest self = new GetApimodelJsonRequest();
        return TeaModel.build(map, self);
    }

    public GetApimodelJsonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApimodelJsonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetApimodelJsonRequest setApiModelId(String apiModelId) {
        this.apiModelId = apiModelId;
        return this;
    }
    public String getApiModelId() {
        return this.apiModelId;
    }

    public GetApimodelJsonRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetApimodelJsonRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetApimodelJsonRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public GetApimodelJsonRequest setUseDefault(Boolean useDefault) {
        this.useDefault = useDefault;
        return this;
    }
    public Boolean getUseDefault() {
        return this.useDefault;
    }

}
