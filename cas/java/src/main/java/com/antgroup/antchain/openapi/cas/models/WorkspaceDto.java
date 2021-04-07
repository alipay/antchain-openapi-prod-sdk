// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceDto extends TeaModel {
    // displayName
    @NameInMap("display_name")
    public String displayName;

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

    // projectId
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // type
    @NameInMap("type")
    public String type;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // workspaceRegionDto
    @NameInMap("workspace_region_dto")
    public WorkspaceRegionDto workspaceRegionDto;

    public static WorkspaceDto build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceDto self = new WorkspaceDto();
        return TeaModel.build(map, self);
    }

    public WorkspaceDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public WorkspaceDto setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceDto setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public WorkspaceDto setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public WorkspaceDto setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WorkspaceDto setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WorkspaceDto setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public WorkspaceDto setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public WorkspaceDto setWorkspaceRegionDto(WorkspaceRegionDto workspaceRegionDto) {
        this.workspaceRegionDto = workspaceRegionDto;
        return this;
    }
    public WorkspaceRegionDto getWorkspaceRegionDto() {
        return this.workspaceRegionDto;
    }

}
