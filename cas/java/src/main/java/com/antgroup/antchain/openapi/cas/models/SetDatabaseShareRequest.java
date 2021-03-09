// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SetDatabaseShareRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace_ids
    @NameInMap("workspace_ids")
    @Validation(required = true)
    public java.util.List<String> workspaceIds;

    // ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    public static SetDatabaseShareRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDatabaseShareRequest self = new SetDatabaseShareRequest();
        return TeaModel.build(map, self);
    }

    public SetDatabaseShareRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDatabaseShareRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

    public SetDatabaseShareRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
