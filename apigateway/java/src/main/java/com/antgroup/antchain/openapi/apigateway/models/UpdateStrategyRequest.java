// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public StrategyInfoVO param;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UpdateStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStrategyRequest self = new UpdateStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateStrategyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateStrategyRequest setParam(StrategyInfoVO param) {
        this.param = param;
        return this;
    }
    public StrategyInfoVO getParam() {
        return this.param;
    }

    public UpdateStrategyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateStrategyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
