// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateRouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public RouterInfoVO param;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UpdateRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouterRequest self = new UpdateRouterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateRouterRequest setParam(RouterInfoVO param) {
        this.param = param;
        return this;
    }
    public RouterInfoVO getParam() {
        return this.param;
    }

    public UpdateRouterRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateRouterRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
