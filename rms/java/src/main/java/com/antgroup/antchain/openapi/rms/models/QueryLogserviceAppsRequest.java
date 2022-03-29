// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryLogserviceAppsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 命名空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 租户名称
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    public static QueryLogserviceAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLogserviceAppsRequest self = new QueryLogserviceAppsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLogserviceAppsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLogserviceAppsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryLogserviceAppsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
