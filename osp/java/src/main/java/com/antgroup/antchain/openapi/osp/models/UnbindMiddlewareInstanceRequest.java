// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class UnbindMiddlewareInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 工作空间
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 工作空间，如果有多个则使用 "," 隔开
    @NameInMap("workspaces")
    @Validation(required = true)
    public String workspaces;

    public static UnbindMiddlewareInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindMiddlewareInstanceRequest self = new UnbindMiddlewareInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindMiddlewareInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindMiddlewareInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindMiddlewareInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UnbindMiddlewareInstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UnbindMiddlewareInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnbindMiddlewareInstanceRequest setWorkspaces(String workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public String getWorkspaces() {
        return this.workspaces;
    }

}
