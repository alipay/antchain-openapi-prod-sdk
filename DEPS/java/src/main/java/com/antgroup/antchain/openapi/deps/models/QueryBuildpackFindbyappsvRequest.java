// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappsvRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // appIds
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    public static QueryBuildpackFindbyappsvRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappsvRequest self = new QueryBuildpackFindbyappsvRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappsvRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindbyappsvRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryBuildpackFindbyappsvRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
