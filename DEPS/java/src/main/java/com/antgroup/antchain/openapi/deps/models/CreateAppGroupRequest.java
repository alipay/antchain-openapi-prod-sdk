// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用依赖规划
    @NameInMap("app_scheme")
    public java.util.List<AppDepend> appScheme;

    // 应用分组描述
    @NameInMap("description")
    public String description;

    // 应用分组名称，支持中文
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用分组负责人登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    // 父应用分组 id
    @NameInMap("parent_id")
    public String parentId;

    public static CreateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupRequest self = new CreateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppGroupRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateAppGroupRequest setAppScheme(java.util.List<AppDepend> appScheme) {
        this.appScheme = appScheme;
        return this;
    }
    public java.util.List<AppDepend> getAppScheme() {
        return this.appScheme;
    }

    public CreateAppGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppGroupRequest setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public CreateAppGroupRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
