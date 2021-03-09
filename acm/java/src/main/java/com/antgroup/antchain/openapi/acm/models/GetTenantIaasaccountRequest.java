// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetTenantIaasaccountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 租户唯一标识
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

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

}
