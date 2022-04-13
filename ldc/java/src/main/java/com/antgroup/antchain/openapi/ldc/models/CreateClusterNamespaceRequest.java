// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateClusterNamespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // namespace labels
    @NameInMap("labels")
    @Validation(required = true)
    public java.util.List<Label> labels;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // tenant id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // tenant name
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // workspace group id
    @NameInMap("workspace_group_id")
    @Validation(required = true)
    public String workspaceGroupId;

    // workspace group name
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    // cluster name to create namespace in
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    public static CreateClusterNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNamespaceRequest self = new CreateClusterNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterNamespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateClusterNamespaceRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateClusterNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterNamespaceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateClusterNamespaceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateClusterNamespaceRequest setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public CreateClusterNamespaceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public CreateClusterNamespaceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}
