// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetTenantIaasaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户唯一标识
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 一方化调用参数，阿里云服务名
    @NameInMap("source_id")
    public String sourceId;

    public static GetTenantIaasaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTenantIaasaccountRequest self = new GetTenantIaasaccountRequest();
        return TeaModel.build(map, self);
    }

    public GetTenantIaasaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTenantIaasaccountRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetTenantIaasaccountRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

}
