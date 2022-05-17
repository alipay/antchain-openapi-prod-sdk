// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppGet extends TeaModel {
    // 应用id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 应用名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用分组名称
    @NameInMap("app_group_name")
    public String appGroupName;

    // 应用所属分组id
    @NameInMap("app_group_id")
    public String appGroupId;

    // 应用负责人
    @NameInMap("owner_display_name")
    public String ownerDisplayName;

    // description
    @NameInMap("description")
    public String description;

    // 技术栈名称
    @NameInMap("buildpack_name")
    public String buildpackName;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // workspace下应用所关联的应用服务列表
    @NameInMap("appservices")
    public java.util.List<String> appservices;

    public static AppPortraitAppGet build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppGet self = new AppPortraitAppGet();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppGet setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppPortraitAppGet setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppPortraitAppGet setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public AppPortraitAppGet setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public String getAppGroupId() {
        return this.appGroupId;
    }

    public AppPortraitAppGet setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
        return this;
    }
    public String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    public AppPortraitAppGet setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppPortraitAppGet setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public AppPortraitAppGet setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public AppPortraitAppGet setAppservices(java.util.List<String> appservices) {
        this.appservices = appservices;
        return this;
    }
    public java.util.List<String> getAppservices() {
        return this.appservices;
    }

}
