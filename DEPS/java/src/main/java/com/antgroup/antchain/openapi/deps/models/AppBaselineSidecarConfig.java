// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppBaselineSidecarConfig extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // sidecar类型
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 应用基线适用条件，金融云环境仅能指定workspaceGroups属性，并且只能指定一个workspaceGroup
    @NameInMap("conditions")
    @Validation(required = true)
    public java.util.List<SidecarCondition> conditions;

    // 是否开启sidecar
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // sidecar版本号，金融云环境必填
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 应用基线id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static AppBaselineSidecarConfig build(java.util.Map<String, ?> map) throws Exception {
        AppBaselineSidecarConfig self = new AppBaselineSidecarConfig();
        return TeaModel.build(map, self);
    }

    public AppBaselineSidecarConfig setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppBaselineSidecarConfig setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public AppBaselineSidecarConfig setConditions(java.util.List<SidecarCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<SidecarCondition> getConditions() {
        return this.conditions;
    }

    public AppBaselineSidecarConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AppBaselineSidecarConfig setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public AppBaselineSidecarConfig setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
