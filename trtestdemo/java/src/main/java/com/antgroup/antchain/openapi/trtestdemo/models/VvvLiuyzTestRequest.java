// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trtestdemo.models;

import com.aliyun.tea.*;

public class VvvLiuyzTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static VvvLiuyzTestRequest build(java.util.Map<String, ?> map) throws Exception {
        VvvLiuyzTestRequest self = new VvvLiuyzTestRequest();
        return TeaModel.build(map, self);
    }

    public VvvLiuyzTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
