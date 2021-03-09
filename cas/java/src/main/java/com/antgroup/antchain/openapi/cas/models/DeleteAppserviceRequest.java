// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteAppserviceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 工作空间id，用于鉴权
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static DeleteAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppserviceRequest self = new DeleteAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppserviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteAppserviceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
