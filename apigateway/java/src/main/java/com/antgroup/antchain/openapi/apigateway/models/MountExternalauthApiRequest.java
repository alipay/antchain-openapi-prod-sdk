// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class MountExternalauthApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api标识列表
    @NameInMap("api_info_id_list")
    @Validation(required = true)
    public java.util.List<String> apiInfoIdList;

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

    public static MountExternalauthApiRequest build(java.util.Map<String, ?> map) throws Exception {
        MountExternalauthApiRequest self = new MountExternalauthApiRequest();
        return TeaModel.build(map, self);
    }

    public MountExternalauthApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MountExternalauthApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MountExternalauthApiRequest setApiInfoIdList(java.util.List<String> apiInfoIdList) {
        this.apiInfoIdList = apiInfoIdList;
        return this;
    }
    public java.util.List<String> getApiInfoIdList() {
        return this.apiInfoIdList;
    }

    public MountExternalauthApiRequest setExternalAuthId(String externalAuthId) {
        this.externalAuthId = externalAuthId;
        return this;
    }
    public String getExternalAuthId() {
        return this.externalAuthId;
    }

    public MountExternalauthApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MountExternalauthApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
