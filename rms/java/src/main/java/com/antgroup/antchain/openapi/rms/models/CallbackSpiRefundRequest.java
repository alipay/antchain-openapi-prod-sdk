// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // data
    @NameInMap("data")
    public String data;

    public static CallbackSpiRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiRefundRequest self = new CallbackSpiRefundRequest();
        return TeaModel.build(map, self);
    }

    public CallbackSpiRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackSpiRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
