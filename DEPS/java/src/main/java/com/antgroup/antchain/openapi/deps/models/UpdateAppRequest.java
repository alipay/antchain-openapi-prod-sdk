// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用所属分组，至于应用所属分组的级别需要后端根据分组名称计算出来
    @NameInMap("appgroup_name")
    public String appgroupName;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // 应用描述
    @NameInMap("description")
    public String description;

    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // 应用名称
    @NameInMap("name")
    public String name;

    // 应用额外信息（应用标签）
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppRequest setAppgroupName(String appgroupName) {
        this.appgroupName = appgroupName;
        return this;
    }
    public String getAppgroupName() {
        return this.appgroupName;
    }

    public UpdateAppRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public UpdateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAppRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
