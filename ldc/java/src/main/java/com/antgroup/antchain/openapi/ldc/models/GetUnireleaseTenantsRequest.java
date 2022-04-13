// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetUnireleaseTenantsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 解决方案Json
    @NameInMap("solution")
    @Validation(required = true)
    public String solution;

    public static GetUnireleaseTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnireleaseTenantsRequest self = new GetUnireleaseTenantsRequest();
        return TeaModel.build(map, self);
    }

    public GetUnireleaseTenantsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUnireleaseTenantsRequest setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

}
