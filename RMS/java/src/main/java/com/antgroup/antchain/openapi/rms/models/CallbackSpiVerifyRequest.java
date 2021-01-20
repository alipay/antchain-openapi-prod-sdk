// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiVerifyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // data
    @NameInMap("data")
    public String data;

    public static CallbackSpiVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiVerifyRequest self = new CallbackSpiVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CallbackSpiVerifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackSpiVerifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
