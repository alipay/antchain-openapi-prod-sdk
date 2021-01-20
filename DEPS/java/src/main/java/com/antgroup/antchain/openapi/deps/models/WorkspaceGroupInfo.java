// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class WorkspaceGroupInfo extends TeaModel {
    // 创建时间。
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // 工作空间组显示名称。
    @NameInMap("display_name")
    public String displayName;

    // 域名后缀。
    @NameInMap("domain_suffix")
    public String domainSuffix;

    // 工作空间组id。
    @NameInMap("id")
    public String id;

    // 主工作空间id。
    @NameInMap("master_workspace_id")
    public String masterWorkspaceId;

    // 主工作空间名称。
    @NameInMap("master_workspace_identity")
    public String masterWorkspaceIdentity;

    // 修改时间。
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modifiedTime;

    // 工作空间组唯一标识。
    @NameInMap("name")
    public String name;

    // 发布模式。
    @NameInMap("release_mode")
    public String releaseMode;

    // the belonging tenant name.
    @NameInMap("tenant_name")
    public String tenantName;

    // 包含工作空间列表。
    @NameInMap("workspaces")
    public java.util.List<Workspace> workspaces;

    // workspace name
    @NameInMap("identity")
    public String identity;

    public static WorkspaceGroupInfo build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceGroupInfo self = new WorkspaceGroupInfo();
        return TeaModel.build(map, self);
    }

    public WorkspaceGroupInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public WorkspaceGroupInfo setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public WorkspaceGroupInfo setDomainSuffix(String domainSuffix) {
        this.domainSuffix = domainSuffix;
        return this;
    }
    public String getDomainSuffix() {
        return this.domainSuffix;
    }

    public WorkspaceGroupInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceGroupInfo setMasterWorkspaceId(String masterWorkspaceId) {
        this.masterWorkspaceId = masterWorkspaceId;
        return this;
    }
    public String getMasterWorkspaceId() {
        return this.masterWorkspaceId;
    }

    public WorkspaceGroupInfo setMasterWorkspaceIdentity(String masterWorkspaceIdentity) {
        this.masterWorkspaceIdentity = masterWorkspaceIdentity;
        return this;
    }
    public String getMasterWorkspaceIdentity() {
        return this.masterWorkspaceIdentity;
    }

    public WorkspaceGroupInfo setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public WorkspaceGroupInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceGroupInfo setReleaseMode(String releaseMode) {
        this.releaseMode = releaseMode;
        return this;
    }
    public String getReleaseMode() {
        return this.releaseMode;
    }

    public WorkspaceGroupInfo setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public WorkspaceGroupInfo setWorkspaces(java.util.List<Workspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Workspace> getWorkspaces() {
        return this.workspaces;
    }

    public WorkspaceGroupInfo setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
