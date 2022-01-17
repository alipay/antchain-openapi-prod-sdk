// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class DeleteExternalauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部授权标识
    @NameInMap("external_auth_id")
    @Validation(required = true)
    public String externalAuthId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static DeleteExternalauthRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExternalauthRequest self = new DeleteExternalauthRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExternalauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteExternalauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteExternalauthRequest setExternalAuthId(String externalAuthId) {
        this.externalAuthId = externalAuthId;
        return this;
    }
    public String getExternalAuthId() {
        return this.externalAuthId;
    }

    public DeleteExternalauthRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteExternalauthRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
