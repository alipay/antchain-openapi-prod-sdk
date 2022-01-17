// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AllApiflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public ApiflowMachineDefQueryVO param;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AllApiflowRequest build(java.util.Map<String, ?> map) throws Exception {
        AllApiflowRequest self = new AllApiflowRequest();
        return TeaModel.build(map, self);
    }

    public AllApiflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllApiflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllApiflowRequest setParam(ApiflowMachineDefQueryVO param) {
        this.param = param;
        return this;
    }
    public ApiflowMachineDefQueryVO getParam() {
        return this.param;
    }

    public AllApiflowRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AllApiflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
