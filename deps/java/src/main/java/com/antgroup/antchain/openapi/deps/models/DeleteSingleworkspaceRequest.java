// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteSingleworkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // workspace id
    @NameInMap("workspace_id")
    @Validation(required = true)
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

    public DeleteSingleworkspaceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteSingleworkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
