// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RefundAgoraxTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户编号
    @NameInMap("external_id")
    @Validation(required = true)
    public String externalId;

    // 退款金额（元）
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 商户订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 退款原因说明
    @NameInMap("refund_reason")
    public String refundReason;

    // 退款请求号，部分退款时必选
    @NameInMap("out_request_no")
    public String outRequestNo;

    // 退款包含的商品列表信息
    @NameInMap("refund_goods_detail")
    public java.util.List<RefundGoodsDetail> refundGoodsDetail;

    public static RefundAgoraxTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundAgoraxTradeRequest self = new RefundAgoraxTradeRequest();
        return TeaModel.build(map, self);
    }

    public RefundAgoraxTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefundAgoraxTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefundAgoraxTradeRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public RefundAgoraxTradeRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundAgoraxTradeRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public RefundAgoraxTradeRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public RefundAgoraxTradeRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public RefundAgoraxTradeRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public RefundAgoraxTradeRequest setRefundGoodsDetail(java.util.List<RefundGoodsDetail> refundGoodsDetail) {
        this.refundGoodsDetail = refundGoodsDetail;
        return this;
    }
    public java.util.List<RefundGoodsDetail> getRefundGoodsDetail() {
        return this.refundGoodsDetail;
    }

}
