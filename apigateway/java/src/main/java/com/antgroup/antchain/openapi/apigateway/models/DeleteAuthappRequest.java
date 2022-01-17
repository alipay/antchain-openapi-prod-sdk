// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class DeleteAuthappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权App信息标识
    @NameInMap("auth_app_info_id")
    @Validation(required = true)
    public String authAppInfoId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static DeleteAuthappRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthappRequest self = new DeleteAuthappRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAuthappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAuthappRequest setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public DeleteAuthappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteAuthappRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
