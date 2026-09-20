// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class NotifyPoiRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款单号
    @NameInMap("refund_no")
    @Validation(required = true)
    public String refundNo;

    // 关联交易单号（天枢内部）
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 活体部分退款金额（渠道报文）
    @NameInMap("pet_refund_amount")
    public String petRefundAmount;

    // 商城部分退款金额
    @NameInMap("mall_refund_amount")
    public String mallRefundAmount;

    // 退款状态：SUCCESS / FAILED（FAILED时金额恢复可用余额）
    @NameInMap("refund_status")
    @Validation(required = true)
    public String refundStatus;

    // 买家用户id（商城报文携带）
    @NameInMap("buyer_id")
    public String buyerId;

    // 商城订单号（模式4商品订单取消携带）
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    public static NotifyPoiRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPoiRefundRequest self = new NotifyPoiRefundRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPoiRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyPoiRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyPoiRefundRequest setRefundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }
    public String getRefundNo() {
        return this.refundNo;
    }

    public NotifyPoiRefundRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyPoiRefundRequest setPetRefundAmount(String petRefundAmount) {
        this.petRefundAmount = petRefundAmount;
        return this;
    }
    public String getPetRefundAmount() {
        return this.petRefundAmount;
    }

    public NotifyPoiRefundRequest setMallRefundAmount(String mallRefundAmount) {
        this.mallRefundAmount = mallRefundAmount;
        return this;
    }
    public String getMallRefundAmount() {
        return this.mallRefundAmount;
    }

    public NotifyPoiRefundRequest setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public NotifyPoiRefundRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public NotifyPoiRefundRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

}
