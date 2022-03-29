// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTenantconfigTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // configKey对应值
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    public static QueryTenantconfigTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantconfigTokenRequest self = new QueryTenantconfigTokenRequest();
        return TeaModel.build(map, self);
    }

    public QueryTenantconfigTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTenantconfigTokenRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryTenantconfigTokenRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}
