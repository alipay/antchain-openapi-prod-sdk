// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListApplicationPackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间id，用于做鉴权
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 动态查询
    @NameInMap("dynamic_query")
    public DynamicQuery dynamicQuery;

    // 应用查询
    @NameInMap("query")
    public AppQuery query;

    public static ListApplicationPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationPackageRequest self = new ListApplicationPackageRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationPackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListApplicationPackageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListApplicationPackageRequest setDynamicQuery(DynamicQuery dynamicQuery) {
        this.dynamicQuery = dynamicQuery;
        return this;
    }
    public DynamicQuery getDynamicQuery() {
        return this.dynamicQuery;
    }

    public ListApplicationPackageRequest setQuery(AppQuery query) {
        this.query = query;
        return this;
    }
    public AppQuery getQuery() {
        return this.query;
    }

}
