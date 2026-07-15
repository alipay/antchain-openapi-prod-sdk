// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SubmitDigitalcontentOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 支付id
    @NameInMap("payment_id")
    public String paymentId;

    // 付款方式
    // ●AliPay，支付宝
    // ● WeChatPay，微信支付
    // ● Bank，银行卡支付
    // ● Other，其他
    @NameInMap("payment_type")
    public String paymentType;

    // 按次使用时需要为整数
    @NameInMap("usage")
    @Validation(required = true)
    public String usage;

    // 用作幂等，防重调用
    @NameInMap("client_token")
    @Validation(required = true)
    public String clientToken;

    public static SubmitDigitalcontentOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigitalcontentOrderRequest self = new SubmitDigitalcontentOrderRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDigitalcontentOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDigitalcontentOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitDigitalcontentOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubmitDigitalcontentOrderRequest setPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    public String getPaymentId() {
        return this.paymentId;
    }

    public SubmitDigitalcontentOrderRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public SubmitDigitalcontentOrderRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public SubmitDigitalcontentOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
