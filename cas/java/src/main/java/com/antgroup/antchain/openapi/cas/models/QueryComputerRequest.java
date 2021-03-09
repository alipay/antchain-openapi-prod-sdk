// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static QueryComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerRequest self = new QueryComputerRequest();
        return TeaModel.build(map, self);
    }

    public QueryComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComputerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryComputerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
