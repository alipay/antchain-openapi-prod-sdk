// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListSidecarInstanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 版本实例名称
    @NameInMap("instance_name")
    public String instanceName;

    // 分页查询
    @NameInMap("pagination_query")
    public PaginationQuery paginationQuery;

    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    // 版本实例状态
    @NameInMap("status")
    public Long status;

    public static ListSidecarInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSidecarInstanceRequest self = new ListSidecarInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListSidecarInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSidecarInstanceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ListSidecarInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListSidecarInstanceRequest setPaginationQuery(PaginationQuery paginationQuery) {
        this.paginationQuery = paginationQuery;
        return this;
    }
    public PaginationQuery getPaginationQuery() {
        return this.paginationQuery;
    }

    public ListSidecarInstanceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSidecarInstanceRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public ListSidecarInstanceRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
