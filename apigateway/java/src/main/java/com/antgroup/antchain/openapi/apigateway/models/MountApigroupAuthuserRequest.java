// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class MountApigroupAuthuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api标识
    @NameInMap("api_group_id")
    @Validation(required = true)
    public String apiGroupId;

    // 授权状态
    @NameInMap("auth_status")
    @Validation(required = true)
    public String authStatus;

    // 授权用户Id列表
    @NameInMap("auth_user_id_list")
    @Validation(required = true)
    public java.util.List<String> authUserIdList;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static MountApigroupAuthuserRequest build(java.util.Map<String, ?> map) throws Exception {
        MountApigroupAuthuserRequest self = new MountApigroupAuthuserRequest();
        return TeaModel.build(map, self);
    }

    public MountApigroupAuthuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MountApigroupAuthuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MountApigroupAuthuserRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public MountApigroupAuthuserRequest setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public MountApigroupAuthuserRequest setAuthUserIdList(java.util.List<String> authUserIdList) {
        this.authUserIdList = authUserIdList;
        return this;
    }
    public java.util.List<String> getAuthUserIdList() {
        return this.authUserIdList;
    }

    public MountApigroupAuthuserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MountApigroupAuthuserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
