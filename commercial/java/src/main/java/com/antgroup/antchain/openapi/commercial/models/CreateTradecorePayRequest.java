// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CreateTradecorePayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单编号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 交易渠道编号
    @NameInMap("channel_no")
    @Validation(required = true)
    public String channelNo;

    public static CreateTradecorePayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTradecorePayRequest self = new CreateTradecorePayRequest();
        return TeaModel.build(map, self);
    }

    public CreateTradecorePayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTradecorePayRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CreateTradecorePayRequest setChannelNo(String channelNo) {
        this.channelNo = channelNo;
        return this;
    }
    public String getChannelNo() {
        return this.channelNo;
    }

}
