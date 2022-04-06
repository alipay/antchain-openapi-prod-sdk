// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RemoveMiddlewareclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // cluster_id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    public static RemoveMiddlewareclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMiddlewareclusterRequest self = new RemoveMiddlewareclusterRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMiddlewareclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveMiddlewareclusterRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RemoveMiddlewareclusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
