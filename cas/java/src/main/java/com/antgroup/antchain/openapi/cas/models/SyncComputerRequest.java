// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SyncComputerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // computer_id
    @NameInMap("computer_id")
    @Validation(required = true)
    public String computerId;

    public static SyncComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncComputerRequest self = new SyncComputerRequest();
        return TeaModel.build(map, self);
    }

    public SyncComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncComputerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SyncComputerRequest setComputerId(String computerId) {
        this.computerId = computerId;
        return this;
    }
    public String getComputerId() {
        return this.computerId;
    }

}
