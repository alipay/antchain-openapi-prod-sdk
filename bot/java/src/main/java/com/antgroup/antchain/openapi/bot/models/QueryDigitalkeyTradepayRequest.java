// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDigitalkeyTradepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单支付时传入的商户订单号
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 签约绑定的用户支付宝ID
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    public static QueryDigitalkeyTradepayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalkeyTradepayRequest self = new QueryDigitalkeyTradepayRequest();
        return TeaModel.build(map, self);
    }

    public QueryDigitalkeyTradepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDigitalkeyTradepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDigitalkeyTradepayRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryDigitalkeyTradepayRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
