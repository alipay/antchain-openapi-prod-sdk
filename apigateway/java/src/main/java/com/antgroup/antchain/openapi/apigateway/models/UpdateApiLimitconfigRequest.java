// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateApiLimitconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识
    @NameInMap("api_id")
    @Validation(required = true)
    public String apiId;

    // 限流配置
    @NameInMap("limit_config")
    public LimitConfigVO limitConfig;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UpdateApiLimitconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiLimitconfigRequest self = new UpdateApiLimitconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiLimitconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApiLimitconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateApiLimitconfigRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public UpdateApiLimitconfigRequest setLimitConfig(LimitConfigVO limitConfig) {
        this.limitConfig = limitConfig;
        return this;
    }
    public LimitConfigVO getLimitConfig() {
        return this.limitConfig;
    }

    public UpdateApiLimitconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateApiLimitconfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
