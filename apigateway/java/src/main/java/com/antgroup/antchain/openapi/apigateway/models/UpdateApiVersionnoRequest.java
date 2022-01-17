// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateApiVersionnoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // API标识
    @NameInMap("api_id")
    public String apiId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 版本号
    @NameInMap("version_no")
    public String versionNo;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // api_type
    @NameInMap("api_type")
    public String apiType;

    public static UpdateApiVersionnoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiVersionnoRequest self = new UpdateApiVersionnoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiVersionnoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateApiVersionnoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateApiVersionnoRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public UpdateApiVersionnoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateApiVersionnoRequest setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public UpdateApiVersionnoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateApiVersionnoRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

}
