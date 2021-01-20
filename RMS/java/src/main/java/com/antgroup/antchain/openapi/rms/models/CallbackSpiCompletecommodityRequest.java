// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiCompletecommodityRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 南天门的请求体都是做成json字符串放在data字段里
    @NameInMap("data")
    public String data;

    public static CallbackSpiCompletecommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiCompletecommodityRequest self = new CallbackSpiCompletecommodityRequest();
        return TeaModel.build(map, self);
    }

    public CallbackSpiCompletecommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackSpiCompletecommodityRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
