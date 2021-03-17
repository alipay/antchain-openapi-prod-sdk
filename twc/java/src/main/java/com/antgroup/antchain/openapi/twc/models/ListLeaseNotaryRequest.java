// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ListLeaseNotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户订单号，需要同twc.notary.lease.order.create接口的传参一致
    @NameInMap("merchant_order_no")
    public String merchantOrderNo;

    // 接口订单号，需要同twc.notary.lease.order.create接口的传参一致
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 支付渠道，默认支持Alipay|ThirdParty|CreditCard|BankTransfer|WeChatPay|Other，需要同twc.notary.lease.order.create接口的传参一致
    @NameInMap("payment_channel")
    public String paymentChannel;

    public static ListLeaseNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLeaseNotaryRequest self = new ListLeaseNotaryRequest();
        return TeaModel.build(map, self);
    }

    public ListLeaseNotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListLeaseNotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListLeaseNotaryRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public ListLeaseNotaryRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ListLeaseNotaryRequest setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
        return this;
    }
    public String getPaymentChannel() {
        return this.paymentChannel;
    }

}
