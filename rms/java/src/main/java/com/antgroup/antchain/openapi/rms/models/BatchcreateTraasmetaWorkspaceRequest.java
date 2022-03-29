// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspaces
    @NameInMap("workspaces")
    @Validation(required = true)
    public java.util.List<TraasWorkspaceDto> workspaces;

    public static BatchcreateTraasmetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaWorkspaceRequest self = new BatchcreateTraasmetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaWorkspaceRequest setWorkspaces(java.util.List<TraasWorkspaceDto> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<TraasWorkspaceDto> getWorkspaces() {
        return this.workspaces;
    }

}
