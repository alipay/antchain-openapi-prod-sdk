// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudAcmTenantProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryAntcloudAcmTenantProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudAcmTenantProjectRequest self = new QueryAntcloudAcmTenantProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudAcmTenantProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudAcmTenantProjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
