// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarVersionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 分页查询请求体
    @NameInMap("pagination_query")
    public PaginationQuery paginationQuery;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar版本号
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 版本状态
    @NameInMap("status")
    public Long status;

    public static ListSidecarVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarVersionRequest self = new ListSidecarVersionRequest();
        return TeaModel.build(map, self);
    }

    public ListSidecarVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSidecarVersionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ListSidecarVersionRequest setPaginationQuery(PaginationQuery paginationQuery) {
        this.paginationQuery = paginationQuery;
        return this;
    }
    public PaginationQuery getPaginationQuery() {
        return this.paginationQuery;
    }

    public ListSidecarVersionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSidecarVersionRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public ListSidecarVersionRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public ListSidecarVersionRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public ListSidecarVersionRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
