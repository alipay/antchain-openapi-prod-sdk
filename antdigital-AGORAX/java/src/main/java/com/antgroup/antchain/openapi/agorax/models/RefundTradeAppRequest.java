// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class RefundTradeAppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 原支付业务订单号
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 退款业务号，当前调用方内唯一，作为退款幂等键
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 本次退款金额，单位：元，大于 0，最多两位小数
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 退款原因
    @NameInMap("refund_reason")
    @Validation(required = true)
    public String refundReason;

    // 订单创建时登记的中国大陆 11 位手机号
    @NameInMap("registered_mobile")
    public String registeredMobile;

    public static RefundTradeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundTradeAppRequest self = new RefundTradeAppRequest();
        return TeaModel.build(map, self);
    }

    public RefundTradeAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefundTradeAppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefundTradeAppRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public RefundTradeAppRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public RefundTradeAppRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundTradeAppRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public RefundTradeAppRequest setRegisteredMobile(String registeredMobile) {
        this.registeredMobile = registeredMobile;
        return this;
    }
    public String getRegisteredMobile() {
        return this.registeredMobile;
    }

}
