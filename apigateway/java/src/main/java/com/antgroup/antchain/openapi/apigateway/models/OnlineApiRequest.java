// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class OnlineApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识
    @NameInMap("api_id_list")
    @Validation(required = true)
    public java.util.List<String> apiIdList;

    // 上线描述
    @NameInMap("online_desc")
    public String onlineDesc;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // api_type
    @NameInMap("api_type")
    public String apiType;

    public static OnlineApiRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineApiRequest self = new OnlineApiRequest();
        return TeaModel.build(map, self);
    }

    public OnlineApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OnlineApiRequest setApiIdList(java.util.List<String> apiIdList) {
        this.apiIdList = apiIdList;
        return this;
    }
    public java.util.List<String> getApiIdList() {
        return this.apiIdList;
    }

    public OnlineApiRequest setOnlineDesc(String onlineDesc) {
        this.onlineDesc = onlineDesc;
        return this;
    }
    public String getOnlineDesc() {
        return this.onlineDesc;
    }

    public OnlineApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OnlineApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OnlineApiRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

}
