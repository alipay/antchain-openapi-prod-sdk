// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetConfigTenanttreeRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static GetConfigTenanttreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigTenanttreeRequest self = new GetConfigTenanttreeRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigTenanttreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
