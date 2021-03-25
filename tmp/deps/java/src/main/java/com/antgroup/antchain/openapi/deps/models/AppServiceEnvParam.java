// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppServiceEnvParam extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // app_service_id
    @NameInMap("app_service_id")
    public String appServiceId;

    // baseline_buildpack_id
    @NameInMap("baseline_buildpack_id")
    public String baselineBuildpackId;

    // creation_time
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // default_value
    @NameInMap("default_value")
    public String defaultValue;

    // description
    @NameInMap("description")
    public String description;

    // id
    @NameInMap("id")
    public String id;

    // key
    @NameInMap("key")
    public String key;

    // modification_time
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // original_default_value
    @NameInMap("original_default_value")
    public String originalDefaultValue;

    // original_description
    @NameInMap("original_description")
    public String originalDescription;

    // original_readonly
    @NameInMap("original_readonly")
    public String originalReadonly;

    // original_required
    @NameInMap("original_required")
    public Boolean originalRequired;

    // readonly
    @NameInMap("readonly")
    public Boolean readonly;

    // required
    @NameInMap("required")
    public Boolean required;

    // status
    @NameInMap("status")
    public String status;

    // value
    @NameInMap("value")
    public String value;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AppServiceEnvParam build(java.util.Map<String, ?> map) throws Exception {
        AppServiceEnvParam self = new AppServiceEnvParam();
        return TeaModel.build(map, self);
    }

    public AppServiceEnvParam setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppServiceEnvParam setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public AppServiceEnvParam setBaselineBuildpackId(String baselineBuildpackId) {
        this.baselineBuildpackId = baselineBuildpackId;
        return this;
    }
    public String getBaselineBuildpackId() {
        return this.baselineBuildpackId;
    }

    public AppServiceEnvParam setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public AppServiceEnvParam setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public AppServiceEnvParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppServiceEnvParam setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppServiceEnvParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AppServiceEnvParam setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public AppServiceEnvParam setOriginalDefaultValue(String originalDefaultValue) {
        this.originalDefaultValue = originalDefaultValue;
        return this;
    }
    public String getOriginalDefaultValue() {
        return this.originalDefaultValue;
    }

    public AppServiceEnvParam setOriginalDescription(String originalDescription) {
        this.originalDescription = originalDescription;
        return this;
    }
    public String getOriginalDescription() {
        return this.originalDescription;
    }

    public AppServiceEnvParam setOriginalReadonly(String originalReadonly) {
        this.originalReadonly = originalReadonly;
        return this;
    }
    public String getOriginalReadonly() {
        return this.originalReadonly;
    }

    public AppServiceEnvParam setOriginalRequired(Boolean originalRequired) {
        this.originalRequired = originalRequired;
        return this;
    }
    public Boolean getOriginalRequired() {
        return this.originalRequired;
    }

    public AppServiceEnvParam setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public AppServiceEnvParam setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public AppServiceEnvParam setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppServiceEnvParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AppServiceEnvParam setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
