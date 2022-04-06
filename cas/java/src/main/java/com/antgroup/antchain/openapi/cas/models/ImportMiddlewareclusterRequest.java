// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportMiddlewareclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // cluster_id，OSP上的ID
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    public static ImportMiddlewareclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMiddlewareclusterRequest self = new ImportMiddlewareclusterRequest();
        return TeaModel.build(map, self);
    }

    public ImportMiddlewareclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportMiddlewareclusterRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ImportMiddlewareclusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
