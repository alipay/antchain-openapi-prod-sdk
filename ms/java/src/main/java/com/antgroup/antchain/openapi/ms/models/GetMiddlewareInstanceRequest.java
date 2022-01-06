// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class GetMiddlewareInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户Id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 环境id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static GetMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareInstanceRequest self = new GetMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMiddlewareInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMiddlewareInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMiddlewareInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
