// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trtestdemo.models;

import com.aliyun.tea.*;

public class AAARequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AAARequest build(java.util.Map<String, ?> map) throws Exception {
        AAARequest self = new AAARequest();
        return TeaModel.build(map, self);
    }

    public AAARequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
