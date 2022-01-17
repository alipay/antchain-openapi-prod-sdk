// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateApiCacheinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识
    @NameInMap("api_id")
    public String apiId;

    // param
    @NameInMap("param")
    public ApiCacheVO param;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    public static UpdateApiCacheinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiCacheinfoRequest self = new UpdateApiCacheinfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiCacheinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApiCacheinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateApiCacheinfoRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public UpdateApiCacheinfoRequest setParam(ApiCacheVO param) {
        this.param = param;
        return this;
    }
    public ApiCacheVO getParam() {
        return this.param;
    }

    public UpdateApiCacheinfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateApiCacheinfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
