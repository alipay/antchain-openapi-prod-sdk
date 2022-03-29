// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTenantconfigSpiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 模块名称
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    public static QueryTenantconfigSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantconfigSpiRequest self = new QueryTenantconfigSpiRequest();
        return TeaModel.build(map, self);
    }

    public QueryTenantconfigSpiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTenantconfigSpiRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryTenantconfigSpiRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}
