// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppServiceEntity extends TeaModel {
    // appId
    @NameInMap("app_id")
    public String appId;

    // appName
    @NameInMap("app_name")
    public String appName;

    // buildpackFullVersion
    @NameInMap("buildpack_full_version")
    public String buildpackFullVersion;

    // 构建包id
    @NameInMap("buildpack_id")
    public String buildpackId;

    // cellIds
    @NameInMap("cell_ids")
    public java.util.List<String> cellIds;

    // description
    @NameInMap("description")
    public String description;

    // 当前应用服务用到的 ecs 资源列表
    @NameInMap("ecs_list")
    public java.util.List<Computer> ecsList;

    // extendProperties
    @NameInMap("extend_properties")
    public String extendProperties;

    // id
    @NameInMap("id")
    public String id;

    // isDefault
    @NameInMap("is_default")
    public Boolean isDefault;

    // isService
    @NameInMap("is_service")
    public Boolean isService;

    // lastDeployStatus
    @NameInMap("last_deploy_status")
    public String lastDeployStatus;

    // lastDeployVersion
    @NameInMap("last_deploy_version")
    public String lastDeployVersion;

    // lastOpsOrderId
    @NameInMap("last_ops_order_id")
    public String lastOpsOrderId;

    // name
    @NameInMap("name")
    public String name;

    // ownerId
    @NameInMap("owner_id")
    public String ownerId;

    // 当前应用服务使用的 rds 资源列表
    @NameInMap("rds_list")
    public java.util.List<DepsDatabase> rdsList;

    // 当前应用服务使用的 slb 资源列表
    @NameInMap("slb_list")
    public java.util.List<SLBInfo> slbList;

    // techstackId
    @NameInMap("techstack_id")
    public Long techstackId;

    // techstackIdentity
    @NameInMap("techstack_identity")
    public String techstackIdentity;

    // techstackName
    @NameInMap("techstack_name")
    public String techstackName;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // 工作空间显示名称
    @NameInMap("workspace_display_name")
    public String workspaceDisplayName;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    // 工作空间名称
    @NameInMap("workspace_name")
    public String workspaceName;

    // 负责人登录名称
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 负责人显示名称
    @NameInMap("owner_display_name")
    public String ownerDisplayName;

    public static AppServiceEntity build(java.util.Map<String, ?> map) throws Exception {
        AppServiceEntity self = new AppServiceEntity();
        return TeaModel.build(map, self);
    }

    public AppServiceEntity setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppServiceEntity setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppServiceEntity setBuildpackFullVersion(String buildpackFullVersion) {
        this.buildpackFullVersion = buildpackFullVersion;
        return this;
    }
    public String getBuildpackFullVersion() {
        return this.buildpackFullVersion;
    }

    public AppServiceEntity setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public AppServiceEntity setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public AppServiceEntity setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppServiceEntity setEcsList(java.util.List<Computer> ecsList) {
        this.ecsList = ecsList;
        return this;
    }
    public java.util.List<Computer> getEcsList() {
        return this.ecsList;
    }

    public AppServiceEntity setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public AppServiceEntity setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppServiceEntity setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public AppServiceEntity setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }
    public Boolean getIsService() {
        return this.isService;
    }

    public AppServiceEntity setLastDeployStatus(String lastDeployStatus) {
        this.lastDeployStatus = lastDeployStatus;
        return this;
    }
    public String getLastDeployStatus() {
        return this.lastDeployStatus;
    }

    public AppServiceEntity setLastDeployVersion(String lastDeployVersion) {
        this.lastDeployVersion = lastDeployVersion;
        return this;
    }
    public String getLastDeployVersion() {
        return this.lastDeployVersion;
    }

    public AppServiceEntity setLastOpsOrderId(String lastOpsOrderId) {
        this.lastOpsOrderId = lastOpsOrderId;
        return this;
    }
    public String getLastOpsOrderId() {
        return this.lastOpsOrderId;
    }

    public AppServiceEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppServiceEntity setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AppServiceEntity setRdsList(java.util.List<DepsDatabase> rdsList) {
        this.rdsList = rdsList;
        return this;
    }
    public java.util.List<DepsDatabase> getRdsList() {
        return this.rdsList;
    }

    public AppServiceEntity setSlbList(java.util.List<SLBInfo> slbList) {
        this.slbList = slbList;
        return this;
    }
    public java.util.List<SLBInfo> getSlbList() {
        return this.slbList;
    }

    public AppServiceEntity setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public AppServiceEntity setTechstackIdentity(String techstackIdentity) {
        this.techstackIdentity = techstackIdentity;
        return this;
    }
    public String getTechstackIdentity() {
        return this.techstackIdentity;
    }

    public AppServiceEntity setTechstackName(String techstackName) {
        this.techstackName = techstackName;
        return this;
    }
    public String getTechstackName() {
        return this.techstackName;
    }

    public AppServiceEntity setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppServiceEntity setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public AppServiceEntity setWorkspaceDisplayName(String workspaceDisplayName) {
        this.workspaceDisplayName = workspaceDisplayName;
        return this;
    }
    public String getWorkspaceDisplayName() {
        return this.workspaceDisplayName;
    }

    public AppServiceEntity setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AppServiceEntity setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public AppServiceEntity setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public AppServiceEntity setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
        return this;
    }
    public String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

}
