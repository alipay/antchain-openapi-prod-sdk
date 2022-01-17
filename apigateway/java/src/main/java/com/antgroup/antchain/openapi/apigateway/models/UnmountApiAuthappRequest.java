// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UnmountApiAuthappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api_id
    @NameInMap("api_id")
    @Validation(required = true)
    public String apiId;

    // auth_app_info_id_list
    @NameInMap("auth_app_info_id_list")
    @Validation(required = true)
    public java.util.List<String> authAppInfoIdList;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UnmountApiAuthappRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountApiAuthappRequest self = new UnmountApiAuthappRequest();
        return TeaModel.build(map, self);
    }

    public UnmountApiAuthappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnmountApiAuthappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnmountApiAuthappRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public UnmountApiAuthappRequest setAuthAppInfoIdList(java.util.List<String> authAppInfoIdList) {
        this.authAppInfoIdList = authAppInfoIdList;
        return this;
    }
    public java.util.List<String> getAuthAppInfoIdList() {
        return this.authAppInfoIdList;
    }

    public UnmountApiAuthappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UnmountApiAuthappRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
