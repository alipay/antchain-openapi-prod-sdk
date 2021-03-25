// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppServiceBuildpackRelation extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // app_service_id
    @NameInMap("app_service_id")
    public String appServiceId;

    // buildpack_arch
    @NameInMap("buildpack_arch")
    public String buildpackArch;

    // buildpack_full_version
    @NameInMap("buildpack_full_version")
    public String buildpackFullVersion;

    // buildpack_id
    @NameInMap("buildpack_id")
    public String buildpackId;

    // creation_time
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // extra_info
    @NameInMap("extra_info")
    public String extraInfo;

    // id
    @NameInMap("id")
    public String id;

    // modification_time
    @NameInMap("modification_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modificationTime;

    // techstack_id
    @NameInMap("techstack_id")
    public Long techstackId;

    // techstack_identity
    @NameInMap("techstack_identity")
    public String techstackIdentity;

    // techstack_name
    @NameInMap("techstack_name")
    public String techstackName;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static AppServiceBuildpackRelation build(java.util.Map<String, ?> map) throws Exception {
        AppServiceBuildpackRelation self = new AppServiceBuildpackRelation();
        return TeaModel.build(map, self);
    }

    public AppServiceBuildpackRelation setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppServiceBuildpackRelation setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public AppServiceBuildpackRelation setBuildpackArch(String buildpackArch) {
        this.buildpackArch = buildpackArch;
        return this;
    }
    public String getBuildpackArch() {
        return this.buildpackArch;
    }

    public AppServiceBuildpackRelation setBuildpackFullVersion(String buildpackFullVersion) {
        this.buildpackFullVersion = buildpackFullVersion;
        return this;
    }
    public String getBuildpackFullVersion() {
        return this.buildpackFullVersion;
    }

    public AppServiceBuildpackRelation setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public AppServiceBuildpackRelation setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public AppServiceBuildpackRelation setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public AppServiceBuildpackRelation setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppServiceBuildpackRelation setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public AppServiceBuildpackRelation setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

    public AppServiceBuildpackRelation setTechstackIdentity(String techstackIdentity) {
        this.techstackIdentity = techstackIdentity;
        return this;
    }
    public String getTechstackIdentity() {
        return this.techstackIdentity;
    }

    public AppServiceBuildpackRelation setTechstackName(String techstackName) {
        this.techstackName = techstackName;
        return this;
    }
    public String getTechstackName() {
        return this.techstackName;
    }

    public AppServiceBuildpackRelation setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
