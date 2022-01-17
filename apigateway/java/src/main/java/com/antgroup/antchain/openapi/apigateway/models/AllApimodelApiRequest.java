// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AllApimodelApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型id
    @NameInMap("api_model_id")
    @Validation(required = true)
    public String apiModelId;

    // param
    @NameInMap("param")
    public ApiInfoQueryVO param;

    // 	
    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AllApimodelApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AllApimodelApiRequest self = new AllApimodelApiRequest();
        return TeaModel.build(map, self);
    }

    public AllApimodelApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllApimodelApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllApimodelApiRequest setApiModelId(String apiModelId) {
        this.apiModelId = apiModelId;
        return this;
    }
    public String getApiModelId() {
        return this.apiModelId;
    }

    public AllApimodelApiRequest setParam(ApiInfoQueryVO param) {
        this.param = param;
        return this;
    }
    public ApiInfoQueryVO getParam() {
        return this.param;
    }

    public AllApimodelApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AllApimodelApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
