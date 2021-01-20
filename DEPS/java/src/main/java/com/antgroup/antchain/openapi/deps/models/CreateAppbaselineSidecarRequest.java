// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateAppbaselineSidecarRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // sidecar类型
    @NameInMap("category")
    public String category;

    // 应用基线适用条件，网商仅能指定workspaceGroups属性，并且只能指定一个workspaceGroup
    @NameInMap("conditions")
    public java.util.List<SidecarCondition> conditions;

    // 是否开启sidecar
    @NameInMap("enable")
    public Boolean enable;

    // sidecar版本号
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    public static CreateAppbaselineSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppbaselineSidecarRequest self = new CreateAppbaselineSidecarRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppbaselineSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppbaselineSidecarRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppbaselineSidecarRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateAppbaselineSidecarRequest setConditions(java.util.List<SidecarCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<SidecarCondition> getConditions() {
        return this.conditions;
    }

    public CreateAppbaselineSidecarRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateAppbaselineSidecarRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

}
