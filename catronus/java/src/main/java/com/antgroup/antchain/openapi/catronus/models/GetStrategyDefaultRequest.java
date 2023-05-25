// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetStrategyDefaultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetStrategyDefaultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStrategyDefaultRequest self = new GetStrategyDefaultRequest();
        return TeaModel.build(map, self);
    }

    public GetStrategyDefaultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
