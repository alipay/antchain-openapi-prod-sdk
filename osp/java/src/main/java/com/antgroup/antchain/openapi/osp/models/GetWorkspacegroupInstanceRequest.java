// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class GetWorkspacegroupInstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 集群id
    @NameInMap("cluster_id")
    public String clusterId;

    // 是否需要原始的instanceId
    @NameInMap("need_real")
    public Boolean needReal;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static GetWorkspacegroupInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacegroupInstanceRequest self = new GetWorkspacegroupInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspacegroupInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetWorkspacegroupInstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetWorkspacegroupInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetWorkspacegroupInstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public GetWorkspacegroupInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetWorkspacegroupInstanceRequest setNeedReal(Boolean needReal) {
        this.needReal = needReal;
        return this;
    }
    public Boolean getNeedReal() {
        return this.needReal;
    }

    public GetWorkspacegroupInstanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
