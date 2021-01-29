// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用所属分组，至于应用所属分组的级别需要后端根据分组名称计算出来
    @NameInMap("appgroup_name")
    @Validation(required = true)
    public String appgroupName;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // 应用名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 用户登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 技术栈 id
    @NameInMap("stack_id")
    @Validation(required = true)
    public String stackId;

    // 应用额外信息（应用标签）
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateAppRequest setAppgroupName(String appgroupName) {
        this.appgroupName = appgroupName;
        return this;
    }
    public String getAppgroupName() {
        return this.appgroupName;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppRequest setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public CreateAppRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateAppRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public CreateAppRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

}
