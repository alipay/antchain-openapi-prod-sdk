// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StopComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    // 后续版本必填
    @NameInMap("workspace_id")
    public String workspaceId;

    public static StopComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopComputerRequest self = new StopComputerRequest();
        return TeaModel.build(map, self);
    }

    public StopComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopComputerRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public StopComputerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
