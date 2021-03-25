// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryWorkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 工作空间状态。输入示例：status.1=CREATED
    @NameInMap("status")
    public java.util.List<String> status;

    public static QueryWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceRequest self = new QueryWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWorkspaceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryWorkspaceRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

}
