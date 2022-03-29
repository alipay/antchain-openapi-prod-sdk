// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaWorkspacegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_groups
    @NameInMap("workspace_groups")
    @Validation(required = true)
    public java.util.List<TraasWorkspaceGroupDto> workspaceGroups;

    public static BatchcreateTraasmetaWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaWorkspacegroupRequest self = new BatchcreateTraasmetaWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaWorkspacegroupRequest setWorkspaceGroups(java.util.List<TraasWorkspaceGroupDto> workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public java.util.List<TraasWorkspaceGroupDto> getWorkspaceGroups() {
        return this.workspaceGroups;
    }

}
