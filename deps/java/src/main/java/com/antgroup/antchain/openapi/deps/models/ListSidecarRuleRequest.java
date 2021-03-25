// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarRuleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 分页查询
    @NameInMap("pagination_query")
    public PaginationQuery paginationQuery;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    // sidecar名称
    @NameInMap("sidecar_name")
    public String sidecarName;

    // 规则状态
    @NameInMap("status")
    public String status;

    public static ListSidecarRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarRuleRequest self = new ListSidecarRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListSidecarRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSidecarRuleRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ListSidecarRuleRequest setPaginationQuery(PaginationQuery paginationQuery) {
        this.paginationQuery = paginationQuery;
        return this;
    }
    public PaginationQuery getPaginationQuery() {
        return this.paginationQuery;
    }

    public ListSidecarRuleRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSidecarRuleRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public ListSidecarRuleRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public ListSidecarRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
