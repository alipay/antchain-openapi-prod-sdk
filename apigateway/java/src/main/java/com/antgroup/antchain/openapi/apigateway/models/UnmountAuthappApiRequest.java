// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UnmountAuthappApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api标识列表
    @NameInMap("api_info_id_list")
    @Validation(required = true)
    public java.util.List<String> apiInfoIdList;

    // 授权APP标识
    @NameInMap("auth_app_info_id")
    @Validation(required = true)
    public String authAppInfoId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UnmountAuthappApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountAuthappApiRequest self = new UnmountAuthappApiRequest();
        return TeaModel.build(map, self);
    }

    public UnmountAuthappApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnmountAuthappApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnmountAuthappApiRequest setApiInfoIdList(java.util.List<String> apiInfoIdList) {
        this.apiInfoIdList = apiInfoIdList;
        return this;
    }
    public java.util.List<String> getApiInfoIdList() {
        return this.apiInfoIdList;
    }

    public UnmountAuthappApiRequest setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public UnmountAuthappApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UnmountAuthappApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
