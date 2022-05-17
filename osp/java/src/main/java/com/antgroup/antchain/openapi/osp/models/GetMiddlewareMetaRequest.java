// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class GetMiddlewareMetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 工作空间
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static GetMiddlewareMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareMetaRequest self = new GetMiddlewareMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareMetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMiddlewareMetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetMiddlewareMetaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMiddlewareMetaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
