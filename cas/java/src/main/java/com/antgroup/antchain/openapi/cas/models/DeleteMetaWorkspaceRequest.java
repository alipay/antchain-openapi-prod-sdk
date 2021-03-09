// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteMetaWorkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static DeleteMetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaWorkspaceRequest self = new DeleteMetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteMetaWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
