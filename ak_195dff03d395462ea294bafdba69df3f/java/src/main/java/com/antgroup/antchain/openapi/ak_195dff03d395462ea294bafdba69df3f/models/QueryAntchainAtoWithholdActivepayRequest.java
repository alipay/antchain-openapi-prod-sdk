// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoWithholdActivepayRequest extends TeaModel {
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

    // 无用字段，无需关注
    @NameInMap("pay_channel")
    @Validation(maxLength = 64)
    public String payChannel;

    // 支付申请号，用于区分在一笔订单同一支付类型的多笔支付请求。
    // 当支付类型非MULTI_PAY或为空时必填
    @NameInMap("pay_apply_no")
    public Long payApplyNo;

    public static QueryAntchainAtoWithholdActivepayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoWithholdActivepayRequest self = new QueryAntchainAtoWithholdActivepayRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoWithholdActivepayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoWithholdActivepayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoWithholdActivepayRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAntchainAtoWithholdActivepayRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public QueryAntchainAtoWithholdActivepayRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryAntchainAtoWithholdActivepayRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public QueryAntchainAtoWithholdActivepayRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public QueryAntchainAtoWithholdActivepayRequest setPayApplyNo(Long payApplyNo) {
        this.payApplyNo = payApplyNo;
        return this;
    }
    public Long getPayApplyNo() {
        return this.payApplyNo;
    }

}
