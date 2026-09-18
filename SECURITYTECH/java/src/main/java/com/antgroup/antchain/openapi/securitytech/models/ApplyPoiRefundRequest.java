// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ApplyPoiRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款单号，由发起方生成保证唯一（幂等键）
    @NameInMap("refund_no")
    @Validation(required = true)
    public String refundNo;

    // 被退款的支付订单号（内部反查trade_no）
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 活体部分退款金额（元，两位小数）；与mall_refund_amount至少一项必填且>0
    @NameInMap("pet_refund_amount")
    public String petRefundAmount;

    // 商城部分退款金额（元，两位小数），即退回的预充值余额
    @NameInMap("mall_refund_amount")
    public String mallRefundAmount;

    // 退款原因
    @NameInMap("refund_reason")
    public String refundReason;

    public static ApplyPoiRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPoiRefundRequest self = new ApplyPoiRefundRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPoiRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyPoiRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyPoiRefundRequest setRefundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }
    public String getRefundNo() {
        return this.refundNo;
    }

    public ApplyPoiRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ApplyPoiRefundRequest setPetRefundAmount(String petRefundAmount) {
        this.petRefundAmount = petRefundAmount;
        return this;
    }
    public String getPetRefundAmount() {
        return this.petRefundAmount;
    }

    public ApplyPoiRefundRequest setMallRefundAmount(String mallRefundAmount) {
        this.mallRefundAmount = mallRefundAmount;
        return this;
    }
    public String getMallRefundAmount() {
        return this.mallRefundAmount;
    }

    public ApplyPoiRefundRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

}
