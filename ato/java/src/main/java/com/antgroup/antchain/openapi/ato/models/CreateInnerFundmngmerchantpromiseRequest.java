// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerFundmngmerchantpromiseRequest extends TeaModel {
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

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单所属商户的社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 订单所属融资方的社会统一信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 融资模式
    // SUPPLY_CHAIN_FINANCE
    // (供应链金融)
    @NameInMap("merchant_pay_type")
    @Validation(required = true)
    public String merchantPayType;

    // 商户代偿开始天数
    @NameInMap("merchant_compensate_start_day")
    @Validation(required = true)
    public Long merchantCompensateStartDay;

    // 商户起始还款期数
    @NameInMap("pay_start_term_index")
    @Validation(required = true)
    public Long payStartTermIndex;

    // 分账支付宝账号uid
    @NameInMap("divide_alipay_user_id")
    @Validation(required = true)
    public String divideAlipayUserId;

    // 分账支付宝登录账号
    @NameInMap("divide_alipay_login_id")
    @Validation(required = true)
    public String divideAlipayLoginId;

    // 代偿支付宝账号uid
    @NameInMap("compensate_alipay_user_id")
    @Validation(required = true)
    public String compensateAlipayUserId;

    // 代偿支付宝登录账号
    @NameInMap("compensate_alipay_login_id")
    @Validation(required = true)
    public String compensateAlipayLoginId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static CreateInnerFundmngmerchantpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerFundmngmerchantpromiseRequest self = new CreateInnerFundmngmerchantpromiseRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerFundmngmerchantpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerFundmngmerchantpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setMerchantPayType(String merchantPayType) {
        this.merchantPayType = merchantPayType;
        return this;
    }
    public String getMerchantPayType() {
        return this.merchantPayType;
    }

    public CreateInnerFundmngmerchantpromiseRequest setMerchantCompensateStartDay(Long merchantCompensateStartDay) {
        this.merchantCompensateStartDay = merchantCompensateStartDay;
        return this;
    }
    public Long getMerchantCompensateStartDay() {
        return this.merchantCompensateStartDay;
    }

    public CreateInnerFundmngmerchantpromiseRequest setPayStartTermIndex(Long payStartTermIndex) {
        this.payStartTermIndex = payStartTermIndex;
        return this;
    }
    public Long getPayStartTermIndex() {
        return this.payStartTermIndex;
    }

    public CreateInnerFundmngmerchantpromiseRequest setDivideAlipayUserId(String divideAlipayUserId) {
        this.divideAlipayUserId = divideAlipayUserId;
        return this;
    }
    public String getDivideAlipayUserId() {
        return this.divideAlipayUserId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setDivideAlipayLoginId(String divideAlipayLoginId) {
        this.divideAlipayLoginId = divideAlipayLoginId;
        return this;
    }
    public String getDivideAlipayLoginId() {
        return this.divideAlipayLoginId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setCompensateAlipayUserId(String compensateAlipayUserId) {
        this.compensateAlipayUserId = compensateAlipayUserId;
        return this;
    }
    public String getCompensateAlipayUserId() {
        return this.compensateAlipayUserId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setCompensateAlipayLoginId(String compensateAlipayLoginId) {
        this.compensateAlipayLoginId = compensateAlipayLoginId;
        return this;
    }
    public String getCompensateAlipayLoginId() {
        return this.compensateAlipayLoginId;
    }

    public CreateInnerFundmngmerchantpromiseRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
