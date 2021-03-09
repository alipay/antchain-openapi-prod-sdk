// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AssignedApp extends TeaModel {
    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    public static AssignedApp build(java.util.Map<String, ?> map) throws Exception {
        AssignedApp self = new AssignedApp();
        return TeaModel.build(map, self);
    }

    public AssignedApp setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AssignedApp setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
