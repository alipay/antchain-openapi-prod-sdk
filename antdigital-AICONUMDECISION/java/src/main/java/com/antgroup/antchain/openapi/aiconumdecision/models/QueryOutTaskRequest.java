// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class QueryOutTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求流水
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务空间编码（接入时分配）
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    public static QueryOutTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutTaskRequest self = new QueryOutTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOutTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryOutTaskRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

}
