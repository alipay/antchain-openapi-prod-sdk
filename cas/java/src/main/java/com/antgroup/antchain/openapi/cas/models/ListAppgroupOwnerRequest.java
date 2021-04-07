// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppgroupOwnerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户查询
    @NameInMap("query")
    @Validation(required = true)
    public UserQuery query;

    // 占位
    @NameInMap("tenant_id")
    public String tenantId;

    public static ListAppgroupOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppgroupOwnerRequest self = new ListAppgroupOwnerRequest();
        return TeaModel.build(map, self);
    }

    public ListAppgroupOwnerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAppgroupOwnerRequest setQuery(UserQuery query) {
        this.query = query;
        return this;
    }
    public UserQuery getQuery() {
        return this.query;
    }

    public ListAppgroupOwnerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
