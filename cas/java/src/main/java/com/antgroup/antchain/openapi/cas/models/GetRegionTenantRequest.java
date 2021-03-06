// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetRegionTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetRegionTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegionTenantRequest self = new GetRegionTenantRequest();
        return TeaModel.build(map, self);
    }

    public GetRegionTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
