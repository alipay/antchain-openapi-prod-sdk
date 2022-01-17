// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CreateGwconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public SystemConfigVO param;

    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // 	
    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static CreateGwconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGwconfigRequest self = new CreateGwconfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateGwconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateGwconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateGwconfigRequest setParam(SystemConfigVO param) {
        this.param = param;
        return this;
    }
    public SystemConfigVO getParam() {
        return this.param;
    }

    public CreateGwconfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateGwconfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
