// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class App extends TeaModel {
    // 应用所属分组 id
    @NameInMap("app_group_id")
    public String appGroupId;

    // 应用分组名称
    @NameInMap("app_group_name")
    public String appGroupName;

    // 技术栈名称
    @NameInMap("buildpack_name")
    public String buildpackName;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // 允许访问公网
    @NameInMap("default_route")
    public Boolean defaultRoute;

    // 应用发布模式，发布包，发布镜像，混合发布。
    // 默认为空 - 表示包发布模式
    @NameInMap("deploy_type")
    public String deployType;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // 域内应用全局唯一名称
    @NameInMap("global_name")
    public String globalName;

    // 应用 id
    @NameInMap("id")
    public String id;

    // 应用名称
    @NameInMap("name")
    public String name;

    // 应用负责人显示名称
    @NameInMap("owner_display_name")
    public String ownerDisplayName;

    // 应用负责人登录名称
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 技术栈id
    @NameInMap("stack_id")
    public String stackId;

    // 应用状态
    @NameInMap("status")
    public String status;

    // 应用额外信息（应用标签）
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    // 应用负责人id
    @NameInMap("owner_id")
    public String ownerId;

    public static App build(java.util.Map<String, ?> map) throws Exception {
        App self = new App();
        return TeaModel.build(map, self);
    }

    public App setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public String getAppGroupId() {
        return this.appGroupId;
    }

    public App setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public App setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public App setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public App setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public App setDefaultRoute(Boolean defaultRoute) {
        this.defaultRoute = defaultRoute;
        return this;
    }
    public Boolean getDefaultRoute() {
        return this.defaultRoute;
    }

    public App setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public App setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public App setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public App setGlobalName(String globalName) {
        this.globalName = globalName;
        return this;
    }
    public String getGlobalName() {
        return this.globalName;
    }

    public App setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public App setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public App setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
        return this;
    }
    public String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    public App setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public App setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public App setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public App setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public App setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
