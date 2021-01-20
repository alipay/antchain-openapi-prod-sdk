// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackAppService extends TeaModel {
    // appId
    @NameInMap("app_id")
    public String appId;

    // appName
    @NameInMap("app_name")
    public String appName;

    // buildpackFullVersion
    @NameInMap("buildpack_full_version")
    public String buildpackFullVersion;

    // buildpackId
    @NameInMap("buildpack_id")
    public String buildpackId;

    // cellIds
    @NameInMap("cell_ids")
    public java.util.List<String> cellIds;

    // description
    @NameInMap("description")
    public String description;

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

    // techstackId
    @NameInMap("techstack_id")
    public Long techstackId;

    // techstackIdentity
    @NameInMap("techstack_identity")
    public String techstackIdentity;

    // techstackName
    @NameInMap("techstack_name")
    public String techstackName;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    public static BuildpackAppService build(java.util.Map<String, ?> map) throws Exception {
        BuildpackAppService self = new BuildpackAppService();
        return TeaModel.build(map, self);
    }

    public BuildpackAppService setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BuildpackAppService setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BuildpackAppService setBuildpackFullVersion(String buildpackFullVersion) {
        this.buildpackFullVersion = buildpackFullVersion;
        return this;
    }
    public String getBuildpackFullVersion() {
        return this.buildpackFullVersion;
    }

    public BuildpackAppService setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public BuildpackAppService setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public BuildpackAppService setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuildpackAppService setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public BuildpackAppService setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BuildpackAppService setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public BuildpackAppService setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }
    public Boolean getIsService() {
        return this.isService;
    }

    public BuildpackAppService setLastDeployStatus(String lastDeployStatus) {
        this.lastDeployStatus = lastDeployStatus;
        return this;
    }
    public String getLastDeployStatus() {
        return this.lastDeployStatus;
    }

    public BuildpackAppService setLastDeployVersion(String lastDeployVersion) {
        this.lastDeployVersion = lastDeployVersion;
        return this;
    }
    public String getLastDeployVersion() {
        return this.lastDeployVersion;
    }

    public BuildpackAppService setLastOpsOrderId(String lastOpsOrderId) {
        this.lastOpsOrderId = lastOpsOrderId;
        return this;
    }
    public String getLastOpsOrderId() {
        return this.lastOpsOrderId;
    }

    public BuildpackAppService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BuildpackAppService setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public BuildpackAppService setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public BuildpackAppService setTechstackIdentity(String techstackIdentity) {
        this.techstackIdentity = techstackIdentity;
        return this;
    }
    public String getTechstackIdentity() {
        return this.techstackIdentity;
    }

    public BuildpackAppService setTechstackName(String techstackName) {
        this.techstackName = techstackName;
        return this;
    }
    public String getTechstackName() {
        return this.techstackName;
    }

    public BuildpackAppService setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public BuildpackAppService setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public BuildpackAppService setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
