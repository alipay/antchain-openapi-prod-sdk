// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class MountStrategyApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 绑定的API ID列表
    @NameInMap("api_id_list")
    public java.util.List<String> apiIdList;

    // strategy_id
    @NameInMap("strategy_id")
    public String strategyId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static MountStrategyApiRequest build(java.util.Map<String, ?> map) throws Exception {
        MountStrategyApiRequest self = new MountStrategyApiRequest();
        return TeaModel.build(map, self);
    }

    public MountStrategyApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MountStrategyApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MountStrategyApiRequest setApiIdList(java.util.List<String> apiIdList) {
        this.apiIdList = apiIdList;
        return this;
    }
    public java.util.List<String> getApiIdList() {
        return this.apiIdList;
    }

    public MountStrategyApiRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public MountStrategyApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MountStrategyApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
