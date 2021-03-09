// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StartComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    // workspace_id，后续版本会变成必填
    @NameInMap("workspace_id")
    public String workspaceId;

    public static StartComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartComputerRequest self = new StartComputerRequest();
        return TeaModel.build(map, self);
    }

    public StartComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartComputerRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public StartComputerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
