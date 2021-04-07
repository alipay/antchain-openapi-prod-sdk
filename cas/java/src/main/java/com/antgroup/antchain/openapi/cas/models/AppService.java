// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppService extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // buildpack_full_version
    @NameInMap("buildpack_full_version")
    public String buildpackFullVersion;

    // buildpack_id
    @NameInMap("buildpack_id")
    public String buildpackId;

    // cell_ids
    @NameInMap("cell_ids")
    public java.util.List<String> cellIds;

    // description
    @NameInMap("description")
    public String description;

    // extend_properties
    @NameInMap("extend_properties")
    public String extendProperties;

    // id
    @NameInMap("id")
    public String id;

    // is_default
    @NameInMap("is_default")
    public Boolean isDefault;

    // is_service
    @NameInMap("is_service")
    public Boolean isService;

    // last_deploy_status
    @NameInMap("last_deploy_status")
    public String lastDeployStatus;

    // last_deploy_version
    @NameInMap("last_deploy_version")
    public String lastDeployVersion;

    // last_ops_order_id
    @NameInMap("last_ops_order_id")
    public String lastOpsOrderId;

    // name
    @NameInMap("name")
    public String name;

    // owner_id
    @NameInMap("owner_id")
    public String ownerId;

    // techstack_id
    @NameInMap("techstack_id")
    public Long techstackId;

    // techstack_identity
    @NameInMap("techstack_identity")
    public String techstackIdentity;

    // techstack_name
    @NameInMap("techstack_name")
    public String techstackName;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AppService build(java.util.Map<String, ?> map) throws Exception {
        AppService self = new AppService();
        return TeaModel.build(map, self);
    }

    public AppService setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppService setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppService setBuildpackFullVersion(String buildpackFullVersion) {
        this.buildpackFullVersion = buildpackFullVersion;
        return this;
    }
    public String getBuildpackFullVersion() {
        return this.buildpackFullVersion;
    }

    public AppService setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public AppService setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public AppService setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppService setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public AppService setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppService setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public AppService setIsService(Boolean isService) {
        this.isService = isService;
        return this;
    }
    public Boolean getIsService() {
        return this.isService;
    }

    public AppService setLastDeployStatus(String lastDeployStatus) {
        this.lastDeployStatus = lastDeployStatus;
        return this;
    }
    public String getLastDeployStatus() {
        return this.lastDeployStatus;
    }

    public AppService setLastDeployVersion(String lastDeployVersion) {
        this.lastDeployVersion = lastDeployVersion;
        return this;
    }
    public String getLastDeployVersion() {
        return this.lastDeployVersion;
    }

    public AppService setLastOpsOrderId(String lastOpsOrderId) {
        this.lastOpsOrderId = lastOpsOrderId;
        return this;
    }
    public String getLastOpsOrderId() {
        return this.lastOpsOrderId;
    }

    public AppService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppService setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AppService setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public AppService setTechstackIdentity(String techstackIdentity) {
        this.techstackIdentity = techstackIdentity;
        return this;
    }
    public String getTechstackIdentity() {
        return this.techstackIdentity;
    }

    public AppService setTechstackName(String techstackName) {
        this.techstackName = techstackName;
        return this;
    }
    public String getTechstackName() {
        return this.techstackName;
    }

    public AppService setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AppService setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public AppService setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
