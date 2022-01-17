// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class OnlineApiVersionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api_id
    @NameInMap("api_id")
    public String apiId;

    // online_desc
    @NameInMap("online_desc")
    public String onlineDesc;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // version_id
    @NameInMap("version_id")
    public String versionId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // api_type
    @NameInMap("api_type")
    public String apiType;

    public static OnlineApiVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineApiVersionRequest self = new OnlineApiVersionRequest();
        return TeaModel.build(map, self);
    }

    public OnlineApiVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineApiVersionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OnlineApiVersionRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public OnlineApiVersionRequest setOnlineDesc(String onlineDesc) {
        this.onlineDesc = onlineDesc;
        return this;
    }
    public String getOnlineDesc() {
        return this.onlineDesc;
    }

    public OnlineApiVersionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OnlineApiVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public OnlineApiVersionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OnlineApiVersionRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

}
