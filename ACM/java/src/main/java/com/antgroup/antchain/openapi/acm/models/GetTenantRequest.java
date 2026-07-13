// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户唯一标识
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static GetTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTenantRequest self = new GetTenantRequest();
        return TeaModel.build(map, self);
    }

    public GetTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTenantRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
