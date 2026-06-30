// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RefundDubbridgeAlipayTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求编号
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 导流平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 退款金额
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 退款原因
    @NameInMap("refund_reason")
    public String refundReason;

    public static RefundDubbridgeAlipayTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundDubbridgeAlipayTradeRequest self = new RefundDubbridgeAlipayTradeRequest();
        return TeaModel.build(map, self);
    }

    public RefundDubbridgeAlipayTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefundDubbridgeAlipayTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefundDubbridgeAlipayTradeRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public RefundDubbridgeAlipayTradeRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public RefundDubbridgeAlipayTradeRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public RefundDubbridgeAlipayTradeRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public RefundDubbridgeAlipayTradeRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundDubbridgeAlipayTradeRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

}
