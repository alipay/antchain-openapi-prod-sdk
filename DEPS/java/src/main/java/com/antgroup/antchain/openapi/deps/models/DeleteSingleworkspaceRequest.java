// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteSingleworkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static DeleteSingleworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSingleworkspaceRequest self = new DeleteSingleworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSingleworkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSingleworkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
