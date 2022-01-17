// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class OfflineApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识
    @NameInMap("api_id_list")
    @Validation(required = true)
    public java.util.List<String> apiIdList;

    // 下线描述
    @NameInMap("offline_desc")
    public String offlineDesc;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // api_type
    @NameInMap("api_type")
    public String apiType;

    public static OfflineApiRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineApiRequest self = new OfflineApiRequest();
        return TeaModel.build(map, self);
    }

    public OfflineApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OfflineApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OfflineApiRequest setApiIdList(java.util.List<String> apiIdList) {
        this.apiIdList = apiIdList;
        return this;
    }
    public java.util.List<String> getApiIdList() {
        return this.apiIdList;
    }

    public OfflineApiRequest setOfflineDesc(String offlineDesc) {
        this.offlineDesc = offlineDesc;
        return this;
    }
    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public OfflineApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OfflineApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public OfflineApiRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

}
