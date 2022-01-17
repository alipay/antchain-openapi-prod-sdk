// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ListAppApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // App标识
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // param
    @NameInMap("param")
    public ApiInfoQueryVO param;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    public static ListAppApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppApiRequest self = new ListAppApiRequest();
        return TeaModel.build(map, self);
    }

    public ListAppApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAppApiRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppApiRequest setParam(ApiInfoQueryVO param) {
        this.param = param;
        return this;
    }
    public ApiInfoQueryVO getParam() {
        return this.param;
    }

    public ListAppApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListAppApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
