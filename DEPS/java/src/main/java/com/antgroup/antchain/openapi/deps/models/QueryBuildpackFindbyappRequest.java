// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appId
    @NameInMap("app_id")
    public String appId;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    public static QueryBuildpackFindbyappRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappRequest self = new QueryBuildpackFindbyappRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindbyappRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackFindbyappRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryBuildpackFindbyappRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
