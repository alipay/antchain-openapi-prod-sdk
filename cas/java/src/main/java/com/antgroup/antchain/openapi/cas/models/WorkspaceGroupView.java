// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceGroupView extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // displayName
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // tenantId
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // properties
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // workspaces
    @NameInMap("workspaces")
    @Validation(required = true)
    public java.util.List<WorkspaceView> workspaces;

    public static WorkspaceGroupView build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceGroupView self = new WorkspaceGroupView();
        return TeaModel.build(map, self);
    }

    public WorkspaceGroupView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceGroupView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceGroupView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public WorkspaceGroupView setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public WorkspaceGroupView setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public WorkspaceGroupView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WorkspaceGroupView setWorkspaces(java.util.List<WorkspaceView> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceView> getWorkspaces() {
        return this.workspaces;
    }

}
