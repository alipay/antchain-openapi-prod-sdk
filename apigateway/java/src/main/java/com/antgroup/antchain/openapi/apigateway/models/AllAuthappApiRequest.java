// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AllAuthappApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权App标识
    @NameInMap("auth_app_info_id")
    @Validation(required = true)
    public String authAppInfoId;

    // param
    @NameInMap("param")
    public ApiInfoQueryVO param;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AllAuthappApiRequest build(java.util.Map<String, ?> map) throws Exception {
        AllAuthappApiRequest self = new AllAuthappApiRequest();
        return TeaModel.build(map, self);
    }

    public AllAuthappApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllAuthappApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllAuthappApiRequest setAuthAppInfoId(String authAppInfoId) {
        this.authAppInfoId = authAppInfoId;
        return this;
    }
    public String getAuthAppInfoId() {
        return this.authAppInfoId;
    }

    public AllAuthappApiRequest setParam(ApiInfoQueryVO param) {
        this.param = param;
        return this;
    }
    public ApiInfoQueryVO getParam() {
        return this.param;
    }

    public AllAuthappApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AllAuthappApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
