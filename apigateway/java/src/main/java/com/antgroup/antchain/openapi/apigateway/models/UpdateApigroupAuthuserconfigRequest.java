// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateApigroupAuthuserconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api_auth_user_config
    @NameInMap("param")
    public ApiGroupAuthUserConfigVO param;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UpdateApigroupAuthuserconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApigroupAuthuserconfigRequest self = new UpdateApigroupAuthuserconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApigroupAuthuserconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApigroupAuthuserconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateApigroupAuthuserconfigRequest setParam(ApiGroupAuthUserConfigVO param) {
        this.param = param;
        return this;
    }
    public ApiGroupAuthUserConfigVO getParam() {
        return this.param;
    }

    public UpdateApigroupAuthuserconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateApigroupAuthuserconfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
