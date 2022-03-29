// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiLifecycleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // data
    @NameInMap("data")
    public String data;

    public static CallbackSpiLifecycleRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiLifecycleRequest self = new CallbackSpiLifecycleRequest();
        return TeaModel.build(map, self);
    }

    public CallbackSpiLifecycleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackSpiLifecycleRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
