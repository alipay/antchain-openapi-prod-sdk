// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryWithholdActivepayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 第几期,当支付类型为PERFORMANCE或为空必填
    @NameInMap("period_num")
    public Long periodNum;

    // 支付宝支付订单号，当传递此单号时，只会返回当前单据
    @NameInMap("trade_no")
    @Validation(maxLength = 64)
    public String tradeNo;

    // 支付类型
    @NameInMap("pay_type")
    @Validation(maxLength = 64, minLength = 1)
    public String payType;

    // 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
    @NameInMap("pay_channel")
    @Validation(maxLength = 64)
    public String payChannel;

    public static QueryWithholdActivepayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdActivepayRequest self = new QueryWithholdActivepayRequest();
        return TeaModel.build(map, self);
    }

    public QueryWithholdActivepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWithholdActivepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWithholdActivepayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryWithholdActivepayRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public QueryWithholdActivepayRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryWithholdActivepayRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public QueryWithholdActivepayRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

}
