// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AllStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public StrategyInfoQueryVO param;

    // 	
    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    public static AllStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        AllStrategyRequest self = new AllStrategyRequest();
        return TeaModel.build(map, self);
    }

    public AllStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllStrategyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllStrategyRequest setParam(StrategyInfoQueryVO param) {
        this.param = param;
        return this;
    }
    public StrategyInfoQueryVO getParam() {
        return this.param;
    }

    public AllStrategyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AllStrategyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
