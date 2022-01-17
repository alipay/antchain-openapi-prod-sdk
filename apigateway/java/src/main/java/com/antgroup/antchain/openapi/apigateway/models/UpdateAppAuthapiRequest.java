// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class UpdateAppAuthapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // api标识列表
    @NameInMap("api_info_id_list")
    @Validation(required = true)
    public java.util.List<String> apiInfoIdList;

    // app标识
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 加密状态
    @NameInMap("encryption_status")
    @Validation(required = true)
    public String encryptionStatus;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static UpdateAppAuthapiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppAuthapiRequest self = new UpdateAppAuthapiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppAuthapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppAuthapiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAppAuthapiRequest setApiInfoIdList(java.util.List<String> apiInfoIdList) {
        this.apiInfoIdList = apiInfoIdList;
        return this;
    }
    public java.util.List<String> getApiInfoIdList() {
        return this.apiInfoIdList;
    }

    public UpdateAppAuthapiRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppAuthapiRequest setEncryptionStatus(String encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
        return this;
    }
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    public UpdateAppAuthapiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateAppAuthapiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
