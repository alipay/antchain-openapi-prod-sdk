// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class ReceiveTradecorePayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 支付宝回调参数，参数可能变化，返回字符串
    @NameInMap("notify_data")
    @Validation(required = true)
    public String notifyData;

    public static ReceiveTradecorePayRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveTradecorePayRequest self = new ReceiveTradecorePayRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveTradecorePayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveTradecorePayRequest setNotifyData(String notifyData) {
        this.notifyData = notifyData;
        return this;
    }
    public String getNotifyData() {
        return this.notifyData;
    }

}
