// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class RefuseBlockchainBotDigitalkeyWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单支付时传入的商户订单号,不能和 trade_no同时为空。
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
    @NameInMap("refund_amount")
    @Validation(required = true)
    public Long refundAmount;

    // 标识一次退款请求，同一笔交易多次退款需要保证唯一。
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    public static RefuseBlockchainBotDigitalkeyWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseBlockchainBotDigitalkeyWithholdRequest self = new RefuseBlockchainBotDigitalkeyWithholdRequest();
        return TeaModel.build(map, self);
    }

    public RefuseBlockchainBotDigitalkeyWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefuseBlockchainBotDigitalkeyWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefuseBlockchainBotDigitalkeyWithholdRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public RefuseBlockchainBotDigitalkeyWithholdRequest setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public RefuseBlockchainBotDigitalkeyWithholdRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

}
