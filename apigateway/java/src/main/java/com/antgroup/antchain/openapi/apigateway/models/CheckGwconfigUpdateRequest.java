// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CheckGwconfigUpdateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 	
    // zone和网关标识
    @NameInMap("config_key")
    public String configKey;

    // param
    @NameInMap("gateway_id_list")
    public java.util.List<String> gatewayIdList;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static CheckGwconfigUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGwconfigUpdateRequest self = new CheckGwconfigUpdateRequest();
        return TeaModel.build(map, self);
    }

    public CheckGwconfigUpdateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckGwconfigUpdateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckGwconfigUpdateRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public CheckGwconfigUpdateRequest setGatewayIdList(java.util.List<String> gatewayIdList) {
        this.gatewayIdList = gatewayIdList;
        return this;
    }
    public java.util.List<String> getGatewayIdList() {
        return this.gatewayIdList;
    }

    public CheckGwconfigUpdateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckGwconfigUpdateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
