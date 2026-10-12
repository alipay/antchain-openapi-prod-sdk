// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class ApplyRiskplusDubbridgePetrefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道编码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 流量平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 退款单号，渠道/商城侧唯一
    @NameInMap("refund_no")
    @Validation(required = true)
    public String refundNo;

    // 业务订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 关联交易单号
    @NameInMap("trade_no")
    public String tradeNo;

    // 活体部分退款金额，单位元，两位小数
    @NameInMap("pet_refund_amount")
    public String petRefundAmount;

    // 商城部分退款金额，单位元，两位小数
    @NameInMap("mall_refund_amount")
    public String mallRefundAmount;

    // 退款原因
    @NameInMap("refund_reason")
    public String refundReason;

    public static ApplyRiskplusDubbridgePetrefundRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRiskplusDubbridgePetrefundRequest self = new ApplyRiskplusDubbridgePetrefundRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRiskplusDubbridgePetrefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setRefundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }
    public String getRefundNo() {
        return this.refundNo;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setPetRefundAmount(String petRefundAmount) {
        this.petRefundAmount = petRefundAmount;
        return this;
    }
    public String getPetRefundAmount() {
        return this.petRefundAmount;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setMallRefundAmount(String mallRefundAmount) {
        this.mallRefundAmount = mallRefundAmount;
        return this;
    }
    public String getMallRefundAmount() {
        return this.mallRefundAmount;
    }

    public ApplyRiskplusDubbridgePetrefundRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

}
