// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppList extends TeaModel {
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

    // 应用描述
    @NameInMap("description")
    public String description;

    // 技术栈名称
    @NameInMap("buildpack_name")
    public String buildpackName;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    public static AppPortraitAppList build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppList self = new AppPortraitAppList();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppList setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppPortraitAppList setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppPortraitAppList setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public AppPortraitAppList setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public String getAppGroupId() {
        return this.appGroupId;
    }

    public AppPortraitAppList setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
        return this;
    }
    public String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    public AppPortraitAppList setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppPortraitAppList setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public AppPortraitAppList setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

}
