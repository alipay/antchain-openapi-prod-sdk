// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CheckGwconfigDeleteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // zone和网关标识
    @NameInMap("config_key")
    public String configKey;

    // param
    @NameInMap("param")
    public GateWayConfigVO param;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static CheckGwconfigDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGwconfigDeleteRequest self = new CheckGwconfigDeleteRequest();
        return TeaModel.build(map, self);
    }

    public CheckGwconfigDeleteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckGwconfigDeleteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckGwconfigDeleteRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public CheckGwconfigDeleteRequest setParam(GateWayConfigVO param) {
        this.param = param;
        return this;
    }
    public GateWayConfigVO getParam() {
        return this.param;
    }

    public CheckGwconfigDeleteRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckGwconfigDeleteRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
