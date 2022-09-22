// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DetailContainerserviceRevisiondiffRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 租户名
    @NameInMap("tenant_name")
    public String tenantName;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 应用服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 源版本号，不传取应用服务当前发布成功的版本
    @NameInMap("source_revision")
    public String sourceRevision;

    // 目标版本号，当前需要对比的版本号
    @NameInMap("target_revision")
    @Validation(required = true)
    public String targetRevision;

    // 是否只显示摘要信息
    @NameInMap("only_summary")
    public Boolean onlySummary;

    public static DetailContainerserviceRevisiondiffRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailContainerserviceRevisiondiffRequest self = new DetailContainerserviceRevisiondiffRequest();
        return TeaModel.build(map, self);
    }

    public DetailContainerserviceRevisiondiffRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailContainerserviceRevisiondiffRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DetailContainerserviceRevisiondiffRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public DetailContainerserviceRevisiondiffRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DetailContainerserviceRevisiondiffRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public DetailContainerserviceRevisiondiffRequest setSourceRevision(String sourceRevision) {
        this.sourceRevision = sourceRevision;
        return this;
    }
    public String getSourceRevision() {
        return this.sourceRevision;
    }

    public DetailContainerserviceRevisiondiffRequest setTargetRevision(String targetRevision) {
        this.targetRevision = targetRevision;
        return this;
    }
    public String getTargetRevision() {
        return this.targetRevision;
    }

    public DetailContainerserviceRevisiondiffRequest setOnlySummary(Boolean onlySummary) {
        this.onlySummary = onlySummary;
        return this;
    }
    public Boolean getOnlySummary() {
        return this.onlySummary;
    }

}
