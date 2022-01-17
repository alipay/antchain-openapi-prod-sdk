// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AllApiAuthappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识
    @NameInMap("api_id")
    @Validation(required = true)
    public String apiId;

    // param
    @NameInMap("param")
    public AuthAppInfoQueryVO param;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AllApiAuthappRequest build(java.util.Map<String, ?> map) throws Exception {
        AllApiAuthappRequest self = new AllApiAuthappRequest();
        return TeaModel.build(map, self);
    }

    public AllApiAuthappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllApiAuthappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllApiAuthappRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public AllApiAuthappRequest setParam(AuthAppInfoQueryVO param) {
        this.param = param;
        return this;
    }
    public AuthAppInfoQueryVO getParam() {
        return this.param;
    }

    public AllApiAuthappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AllApiAuthappRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
