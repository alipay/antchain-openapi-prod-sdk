// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListApplicationManifestRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app_id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // DynamicQuery
    @NameInMap("query")
    @Validation(required = true)
    public DynamicQuery query;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static ListApplicationManifestRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationManifestRequest self = new ListApplicationManifestRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationManifestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListApplicationManifestRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListApplicationManifestRequest setQuery(DynamicQuery query) {
        this.query = query;
        return this;
    }
    public DynamicQuery getQuery() {
        return this.query;
    }

    public ListApplicationManifestRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
