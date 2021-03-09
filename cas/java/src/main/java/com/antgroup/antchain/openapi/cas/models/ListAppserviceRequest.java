// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppserviceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 动态查询
    @NameInMap("dynamic_query")
    public DynamicQuery dynamicQuery;

    // 应用服务查询
    @NameInMap("query")
    public AppServiceQuery query;

    // 工作空间id，用于鉴权
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static ListAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppserviceRequest self = new ListAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public ListAppserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppserviceRequest setDynamicQuery(DynamicQuery dynamicQuery) {
        this.dynamicQuery = dynamicQuery;
        return this;
    }
    public DynamicQuery getDynamicQuery() {
        return this.dynamicQuery;
    }

    public ListAppserviceRequest setQuery(AppServiceQuery query) {
        this.query = query;
        return this;
    }
    public AppServiceQuery getQuery() {
        return this.query;
    }

    public ListAppserviceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
