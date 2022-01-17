// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CreateLdcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public LdcInfoVO param;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static CreateLdcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLdcRequest self = new CreateLdcRequest();
        return TeaModel.build(map, self);
    }

    public CreateLdcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLdcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLdcRequest setParam(LdcInfoVO param) {
        this.param = param;
        return this;
    }
    public LdcInfoVO getParam() {
        return this.param;
    }

    public CreateLdcRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateLdcRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
