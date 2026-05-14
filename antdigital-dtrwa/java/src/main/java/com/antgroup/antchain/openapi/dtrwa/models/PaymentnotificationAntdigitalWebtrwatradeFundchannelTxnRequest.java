// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtrwa.models;

import com.aliyun.tea.*;

public class PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 支付状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest build(java.util.Map<String, ?> map) throws Exception {
        PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest self = new PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest();
        return TeaModel.build(map, self);
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
