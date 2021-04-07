// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class TenantWorkspace extends TeaModel {
    // displayName
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // gmtCreate
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmtModified
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // networkType
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // tenantId
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // workspaceDcs
    @NameInMap("workspace_dcs")
    @Validation(required = true)
    public java.util.List<WorkspaceDc> workspaceDcs;

    // workspaceRegions
    @NameInMap("workspace_regions")
    @Validation(required = true)
    public java.util.List<WorkspaceRegion> workspaceRegions;

    public static TenantWorkspace build(java.util.Map<String, ?> map) throws Exception {
        TenantWorkspace self = new TenantWorkspace();
        return TeaModel.build(map, self);
    }

    public TenantWorkspace setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public TenantWorkspace setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TenantWorkspace setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TenantWorkspace setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TenantWorkspace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TenantWorkspace setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public TenantWorkspace setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public TenantWorkspace setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public TenantWorkspace setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TenantWorkspace setWorkspaceDcs(java.util.List<WorkspaceDc> workspaceDcs) {
        this.workspaceDcs = workspaceDcs;
        return this;
    }
    public java.util.List<WorkspaceDc> getWorkspaceDcs() {
        return this.workspaceDcs;
    }

    public TenantWorkspace setWorkspaceRegions(java.util.List<WorkspaceRegion> workspaceRegions) {
        this.workspaceRegions = workspaceRegions;
        return this;
    }
    public java.util.List<WorkspaceRegion> getWorkspaceRegions() {
        return this.workspaceRegions;
    }

}
