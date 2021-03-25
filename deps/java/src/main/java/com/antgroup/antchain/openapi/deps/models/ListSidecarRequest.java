// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 分页请求体
    @NameInMap("pagination_query")
    public PaginationQuery paginationQuery;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识符
    @NameInMap("scope_identity")
    public String scopeIdentity;

    public static ListSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarRequest self = new ListSidecarRequest();
        return TeaModel.build(map, self);
    }

    public ListSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSidecarRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ListSidecarRequest setPaginationQuery(PaginationQuery paginationQuery) {
        this.paginationQuery = paginationQuery;
        return this;
    }
    public PaginationQuery getPaginationQuery() {
        return this.paginationQuery;
    }

    public ListSidecarRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSidecarRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

}
