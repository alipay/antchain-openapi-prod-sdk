// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class MountApiAuthappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识
    @NameInMap("api_id")
    @Validation(required = true)
    public String apiId;

    // 授权App标识列表
    @NameInMap("auth_app_info_id_list")
    @Validation(required = true)
    public java.util.List<String> authAppInfoIdList;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static MountApiAuthappRequest build(java.util.Map<String, ?> map) throws Exception {
        MountApiAuthappRequest self = new MountApiAuthappRequest();
        return TeaModel.build(map, self);
    }

    public MountApiAuthappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MountApiAuthappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MountApiAuthappRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public MountApiAuthappRequest setAuthAppInfoIdList(java.util.List<String> authAppInfoIdList) {
        this.authAppInfoIdList = authAppInfoIdList;
        return this;
    }
    public java.util.List<String> getAuthAppInfoIdList() {
        return this.authAppInfoIdList;
    }

    public MountApiAuthappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MountApiAuthappRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
