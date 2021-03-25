// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappvRequest extends TeaModel {
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

    public static QueryBuildpackFindbyappvRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappvRequest self = new QueryBuildpackFindbyappvRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappvRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindbyappvRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackFindbyappvRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryBuildpackFindbyappvRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
