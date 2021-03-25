// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // appIds
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    public static QueryBuildpackFindbyappsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappsRequest self = new QueryBuildpackFindbyappsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackFindbyappsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBuildpackFindbyappsRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryBuildpackFindbyappsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
