// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OpenWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 工作空间展示名称
    @NameInMap("workspace_display_name")
    public String workspaceDisplayName;

    public static OpenWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenWorkspaceRequest self = new OpenWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public OpenWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public OpenWorkspaceRequest setWorkspaceDisplayName(String workspaceDisplayName) {
        this.workspaceDisplayName = workspaceDisplayName;
        return this;
    }
    public String getWorkspaceDisplayName() {
        return this.workspaceDisplayName;
    }

}
