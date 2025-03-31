// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RepayFundPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // 融资单的资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String fundId;

    // 商户履约的期数
    @NameInMap("term_index")
    @Validation(required = true, minimum = 1)
    public Long termIndex;

    // 还款金额
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 支付描述
    @NameInMap("payment_description")
    @Validation(required = true, maxLength = 64)
    public String paymentDescription;

    public static RepayFundPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayFundPlanRequest self = new RepayFundPlanRequest();
        return TeaModel.build(map, self);
    }

    public RepayFundPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayFundPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayFundPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RepayFundPlanRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public RepayFundPlanRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public RepayFundPlanRequest setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

    public RepayFundPlanRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RepayFundPlanRequest setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
        return this;
    }
    public String getPaymentDescription() {
        return this.paymentDescription;
    }

}
