// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class WorkspaceGroup extends TeaModel {
    // 环境名称
    @NameInMap("id")
    public String id;

    // 环境显示名称
    @NameInMap("name")
    public String name;

    // 环境状态
    @NameInMap("status")
    public String status;

    // 租户名称
    @NameInMap("tenant")
    public String tenant;

    // 工作空间名称列表
    @NameInMap("workspaces")
    public java.util.List<String> workspaces;

    public static WorkspaceGroup build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceGroup self = new WorkspaceGroup();
        return TeaModel.build(map, self);
    }

    public WorkspaceGroup setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceGroup setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WorkspaceGroup setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public WorkspaceGroup setWorkspaces(java.util.List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<String> getWorkspaces() {
        return this.workspaces;
    }

}
