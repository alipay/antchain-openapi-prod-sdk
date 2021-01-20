// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListAppbaselineSidecarRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // sidecar类型
    @NameInMap("category")
    public String category;

    // 过滤条件，网商仅能指定workspaceGroups属性
    @NameInMap("condition")
    public SidecarCondition condition;

    // sidecar版本号
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    public static ListAppbaselineSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppbaselineSidecarRequest self = new ListAppbaselineSidecarRequest();
        return TeaModel.build(map, self);
    }

    public ListAppbaselineSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppbaselineSidecarRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppbaselineSidecarRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListAppbaselineSidecarRequest setCondition(SidecarCondition condition) {
        this.condition = condition;
        return this;
    }
    public SidecarCondition getCondition() {
        return this.condition;
    }

    public ListAppbaselineSidecarRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

}
