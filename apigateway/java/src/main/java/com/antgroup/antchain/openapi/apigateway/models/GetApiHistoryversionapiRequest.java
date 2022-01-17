// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GetApiHistoryversionapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api_id
    @NameInMap("api_id")
    @Validation(required = true)
    public String apiId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // version_id
    @NameInMap("version_id")
    @Validation(required = true)
    public String versionId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static GetApiHistoryversionapiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiHistoryversionapiRequest self = new GetApiHistoryversionapiRequest();
        return TeaModel.build(map, self);
    }

    public GetApiHistoryversionapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApiHistoryversionapiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetApiHistoryversionapiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public GetApiHistoryversionapiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetApiHistoryversionapiRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetApiHistoryversionapiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
