// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateAppGroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用依赖拓扑图
    @NameInMap("app_scheme")
    public java.util.List<AppDepend> appScheme;

    // 应用分组描述
    @NameInMap("description")
    public String description;

    // 应用分组名称，支持中文
    @NameInMap("name")
    public String name;

    // 父应用分组 id
    @NameInMap("parent_id")
    public String parentId;

    public static UpdateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppGroupRequest self = new UpdateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppGroupRequest setAppScheme(java.util.List<AppDepend> appScheme) {
        this.appScheme = appScheme;
        return this;
    }
    public java.util.List<AppDepend> getAppScheme() {
        return this.appScheme;
    }

    public UpdateAppGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAppGroupRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
