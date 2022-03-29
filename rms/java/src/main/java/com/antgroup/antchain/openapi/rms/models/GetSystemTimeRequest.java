// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetSystemTimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetSystemTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSystemTimeRequest self = new GetSystemTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetSystemTimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
