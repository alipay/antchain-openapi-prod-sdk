// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraceWorkspacesettingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间配置
    @NameInMap("trace_workspace_settings")
    @Validation(required = true)
    public java.util.List<TraceWorkspaceSetting> traceWorkspaceSettings;

    // 工作空间，用来鉴权
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static UpdateTraceWorkspacesettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraceWorkspacesettingRequest self = new UpdateTraceWorkspacesettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTraceWorkspacesettingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTraceWorkspacesettingRequest setTraceWorkspaceSettings(java.util.List<TraceWorkspaceSetting> traceWorkspaceSettings) {
        this.traceWorkspaceSettings = traceWorkspaceSettings;
        return this;
    }
    public java.util.List<TraceWorkspaceSetting> getTraceWorkspaceSettings() {
        return this.traceWorkspaceSettings;
    }

    public UpdateTraceWorkspacesettingRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
