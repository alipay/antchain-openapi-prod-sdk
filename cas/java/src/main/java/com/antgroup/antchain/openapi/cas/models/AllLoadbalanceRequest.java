// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllLoadbalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_ids
    @NameInMap("workspace_ids")
    @Validation(required = true)
    public java.util.List<String> workspaceIds;

    public static AllLoadbalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AllLoadbalanceRequest self = new AllLoadbalanceRequest();
        return TeaModel.build(map, self);
    }

    public AllLoadbalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllLoadbalanceRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}
