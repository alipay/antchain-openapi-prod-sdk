// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppMeta extends TeaModel {
    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public Long appId;

    public static AppMeta build(java.util.Map<String, ?> map) throws Exception {
        AppMeta self = new AppMeta();
        return TeaModel.build(map, self);
    }

    public AppMeta setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public AppMeta setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppMeta setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
