// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetCurrentidRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static GetCurrentidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentidRequest self = new GetCurrentidRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
