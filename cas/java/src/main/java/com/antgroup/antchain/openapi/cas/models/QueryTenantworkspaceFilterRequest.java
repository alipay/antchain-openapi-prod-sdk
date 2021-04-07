// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryTenantworkspaceFilterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // statuses
    @NameInMap("statuses")
    public String statuses;

    public static QueryTenantworkspaceFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantworkspaceFilterRequest self = new QueryTenantworkspaceFilterRequest();
        return TeaModel.build(map, self);
    }

    public QueryTenantworkspaceFilterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTenantworkspaceFilterRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

}
