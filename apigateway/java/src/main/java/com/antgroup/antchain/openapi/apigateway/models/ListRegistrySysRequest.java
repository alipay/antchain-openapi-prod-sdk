// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ListRegistrySysRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // param
    @NameInMap("param")
    public SystemClusterQueryVO param;

    // registry_id
    @NameInMap("registry_id")
    public String registryId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static ListRegistrySysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegistrySysRequest self = new ListRegistrySysRequest();
        return TeaModel.build(map, self);
    }

    public ListRegistrySysRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRegistrySysRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListRegistrySysRequest setParam(SystemClusterQueryVO param) {
        this.param = param;
        return this;
    }
    public SystemClusterQueryVO getParam() {
        return this.param;
    }

    public ListRegistrySysRequest setRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }
    public String getRegistryId() {
        return this.registryId;
    }

    public ListRegistrySysRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListRegistrySysRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
