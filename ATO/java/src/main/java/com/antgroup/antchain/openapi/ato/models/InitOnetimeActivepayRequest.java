// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InitOnetimeActivepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 支付渠道
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 回跳地址
    @NameInMap("return_url")
    public String returnUrl;

    public static InitOnetimeActivepayRequest build(java.util.Map<String, ?> map) throws Exception {
        InitOnetimeActivepayRequest self = new InitOnetimeActivepayRequest();
        return TeaModel.build(map, self);
    }

    public InitOnetimeActivepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitOnetimeActivepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitOnetimeActivepayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InitOnetimeActivepayRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public InitOnetimeActivepayRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
