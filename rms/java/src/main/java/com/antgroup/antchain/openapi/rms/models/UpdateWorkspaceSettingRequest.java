// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceSettingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // workspace_setting_detail
    @NameInMap("workspace_setting_detail")
    @Validation(required = true)
    public WorkspaceSettingDetail workspaceSettingDetail;

    public static UpdateWorkspaceSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceSettingRequest self = new UpdateWorkspaceSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceSettingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateWorkspaceSettingRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateWorkspaceSettingRequest setWorkspaceSettingDetail(WorkspaceSettingDetail workspaceSettingDetail) {
        this.workspaceSettingDetail = workspaceSettingDetail;
        return this;
    }
    public WorkspaceSettingDetail getWorkspaceSettingDetail() {
        return this.workspaceSettingDetail;
    }

}
