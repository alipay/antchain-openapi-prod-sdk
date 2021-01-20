// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class WorkspaceGroupView extends TeaModel {
    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // table id
    @NameInMap("id")
    public String id;

    // 标识
    @NameInMap("identity")
    public String identity;

    // 环境状态
    @NameInMap("status")
    public String status;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 工作空间列表
    @NameInMap("workspaces")
    public java.util.List<WorkspaceView> workspaces;

    public static WorkspaceGroupView build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceGroupView self = new WorkspaceGroupView();
        return TeaModel.build(map, self);
    }

    public WorkspaceGroupView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public WorkspaceGroupView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceGroupView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public WorkspaceGroupView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WorkspaceGroupView setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public WorkspaceGroupView setWorkspaces(java.util.List<WorkspaceView> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceView> getWorkspaces() {
        return this.workspaces;
    }

}
