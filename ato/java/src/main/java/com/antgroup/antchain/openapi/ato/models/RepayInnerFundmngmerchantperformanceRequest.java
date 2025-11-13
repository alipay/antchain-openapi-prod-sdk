// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RepayInnerFundmngmerchantperformanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 融资单的资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户履约期数顺序序号，从1开始
    @NameInMap("term_index")
    @Validation(required = true)
    public Long termIndex;

    // 还款金额（分）
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 支付描述
    @NameInMap("payment_description")
    @Validation(required = true)
    public String paymentDescription;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static RepayInnerFundmngmerchantperformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayInnerFundmngmerchantperformanceRequest self = new RepayInnerFundmngmerchantperformanceRequest();
        return TeaModel.build(map, self);
    }

    public RepayInnerFundmngmerchantperformanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RepayInnerFundmngmerchantperformanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RepayInnerFundmngmerchantperformanceRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public RepayInnerFundmngmerchantperformanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RepayInnerFundmngmerchantperformanceRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public RepayInnerFundmngmerchantperformanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public RepayInnerFundmngmerchantperformanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RepayInnerFundmngmerchantperformanceRequest setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

    public RepayInnerFundmngmerchantperformanceRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RepayInnerFundmngmerchantperformanceRequest setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
        return this;
    }
    public String getPaymentDescription() {
        return this.paymentDescription;
    }

    public RepayInnerFundmngmerchantperformanceRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
