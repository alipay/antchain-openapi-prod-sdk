// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppportraitAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("name")
    public String name;

    // 应用分组名称
    @NameInMap("app_group_name")
    public String appGroupName;

    // 应用负责人
    @NameInMap("owner_display_name")
    public String ownerDisplayName;

    // 技术栈名称
    @NameInMap("buildpack_name")
    public String buildpackName;

    // 技术栈版本
    @NameInMap("buildpack_version")
    public String buildpackVersion;

    // TenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // TenantName
    @NameInMap("tenant_name")
    public String tenantName;

    public static ListAppportraitAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppportraitAppRequest self = new ListAppportraitAppRequest();
        return TeaModel.build(map, self);
    }

    public ListAppportraitAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppportraitAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAppportraitAppRequest setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }
    public String getAppGroupName() {
        return this.appGroupName;
    }

    public ListAppportraitAppRequest setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
        return this;
    }
    public String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    public ListAppportraitAppRequest setBuildpackName(String buildpackName) {
        this.buildpackName = buildpackName;
        return this;
    }
    public String getBuildpackName() {
        return this.buildpackName;
    }

    public ListAppportraitAppRequest setBuildpackVersion(String buildpackVersion) {
        this.buildpackVersion = buildpackVersion;
        return this;
    }
    public String getBuildpackVersion() {
        return this.buildpackVersion;
    }

    public ListAppportraitAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListAppportraitAppRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
