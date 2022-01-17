// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UnmountCorsApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 绑定的API ID列表
    @NameInMap("api_id_list")
    public java.util.List<String> apiIdList;

    // cors标识
    @NameInMap("cors_id")
    public String corsId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UnmountCorsApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountCorsApiRequest self = new UnmountCorsApiRequest();
        return TeaModel.build(map, self);
    }

    public UnmountCorsApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnmountCorsApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnmountCorsApiRequest setApiIdList(java.util.List<String> apiIdList) {
        this.apiIdList = apiIdList;
        return this;
    }
    public java.util.List<String> getApiIdList() {
        return this.apiIdList;
    }

    public UnmountCorsApiRequest setCorsId(String corsId) {
        this.corsId = corsId;
        return this;
    }
    public String getCorsId() {
        return this.corsId;
    }

    public UnmountCorsApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UnmountCorsApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
