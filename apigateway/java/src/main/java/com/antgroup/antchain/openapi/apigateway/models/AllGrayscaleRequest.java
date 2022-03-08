// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AllGrayscaleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public GrayscaleConfigQueryVO param;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    public static AllGrayscaleRequest build(java.util.Map<String, ?> map) throws Exception {
        AllGrayscaleRequest self = new AllGrayscaleRequest();
        return TeaModel.build(map, self);
    }

    public AllGrayscaleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllGrayscaleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllGrayscaleRequest setParam(GrayscaleConfigQueryVO param) {
        this.param = param;
        return this;
    }
    public GrayscaleConfigQueryVO getParam() {
        return this.param;
    }

    public AllGrayscaleRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AllGrayscaleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
