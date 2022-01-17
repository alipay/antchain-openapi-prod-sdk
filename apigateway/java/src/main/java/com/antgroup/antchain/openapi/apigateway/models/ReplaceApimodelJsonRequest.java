// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ReplaceApimodelJsonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // ApiTestParamVO
    @NameInMap("param")
    public java.util.List<ApiTestParamVO> param;

    // json
    @NameInMap("json")
    public String json;

    public static ReplaceApimodelJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceApimodelJsonRequest self = new ReplaceApimodelJsonRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceApimodelJsonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceApimodelJsonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceApimodelJsonRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ReplaceApimodelJsonRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ReplaceApimodelJsonRequest setParam(java.util.List<ApiTestParamVO> param) {
        this.param = param;
        return this;
    }
    public java.util.List<ApiTestParamVO> getParam() {
        return this.param;
    }

    public ReplaceApimodelJsonRequest setJson(String json) {
        this.json = json;
        return this;
    }
    public String getJson() {
        return this.json;
    }

}
