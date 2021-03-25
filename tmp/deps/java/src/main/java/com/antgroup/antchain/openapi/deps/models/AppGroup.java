// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppGroup extends TeaModel {
    // 应用依赖规划
    @NameInMap("app_scheme")
    public java.util.List<AppDepend> appScheme;

    // 应用分组描述
    @NameInMap("description")
    public String description;

    // 应用分组ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 应用分组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用分组负责人登录名
    @NameInMap("owner_login_name")
    @Validation(required = true)
    public String ownerLoginName;

    // 父应用分组ID
    @NameInMap("parent_id")
    @Validation(required = true)
    public String parentId;

    // 应用分组层级，从1开始，1代表一级分组，2代表二级分组
    @NameInMap("layer")
    public Long layer;

    public static AppGroup build(java.util.Map<String, ?> map) throws Exception {
        AppGroup self = new AppGroup();
        return TeaModel.build(map, self);
    }

    public AppGroup setAppScheme(java.util.List<AppDepend> appScheme) {
        this.appScheme = appScheme;
        return this;
    }
    public java.util.List<AppDepend> getAppScheme() {
        return this.appScheme;
    }

    public AppGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AppGroup setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppGroup setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

    public AppGroup setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public AppGroup setLayer(Long layer) {
        this.layer = layer;
        return this;
    }
    public Long getLayer() {
        return this.layer;
    }

}
