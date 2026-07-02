// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InitInnerFundmngmerchantpromiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 资方社会统一信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户起始还款期数
    @NameInMap("pay_start_term_index")
    @Validation(required = true)
    public Long payStartTermIndex;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static InitInnerFundmngmerchantpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        InitInnerFundmngmerchantpromiseRequest self = new InitInnerFundmngmerchantpromiseRequest();
        return TeaModel.build(map, self);
    }

    public InitInnerFundmngmerchantpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitInnerFundmngmerchantpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitInnerFundmngmerchantpromiseRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public InitInnerFundmngmerchantpromiseRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public InitInnerFundmngmerchantpromiseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InitInnerFundmngmerchantpromiseRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public InitInnerFundmngmerchantpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public InitInnerFundmngmerchantpromiseRequest setPayStartTermIndex(Long payStartTermIndex) {
        this.payStartTermIndex = payStartTermIndex;
        return this;
    }
    public Long getPayStartTermIndex() {
        return this.payStartTermIndex;
    }

    public InitInnerFundmngmerchantpromiseRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
