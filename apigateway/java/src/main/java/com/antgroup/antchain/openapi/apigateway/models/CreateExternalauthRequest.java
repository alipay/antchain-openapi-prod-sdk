// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CreateExternalauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public ExternalAuthInfoVO param;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static CreateExternalauthRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalauthRequest self = new CreateExternalauthRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateExternalauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateExternalauthRequest setParam(ExternalAuthInfoVO param) {
        this.param = param;
        return this;
    }
    public ExternalAuthInfoVO getParam() {
        return this.param;
    }

    public CreateExternalauthRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateExternalauthRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
