// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncInnerFundmngloanresultsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方的租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 商户的租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户的社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 资方的社会统一信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 同步类型
    // AGREE_RETRY（同意重试）
    // AGREE （同意）
    // REJECT（拒绝）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 融资模式
    // 供应链金融：
    // SUPPLY_CHAIN_FINANCE
    // 自定义还款：
    // DEFAULT
    @NameInMap("fund_mode")
    @Validation(required = true)
    public String fundMode;

    // 融资放款结果，FinanceLoanResults
    @NameInMap("finance_loan_results")
    public String financeLoanResults;

    // 商户履约承诺MerchantPromiseInfo
    @NameInMap("merchant_promise_info")
    public String merchantPromiseInfo;

    // 推广id
    @NameInMap("promotion_id")
    public String promotionId;

    // 商户起始还款期数
    @NameInMap("pay_start_term_index")
    public Long payStartTermIndex;

    // 分账支付宝账号uid
    @NameInMap("divide_alipay_user_id")
    public String divideAlipayUserId;

    // 分账支付宝登录账号
    @NameInMap("divide_alipay_login_id")
    public String divideAlipayLoginId;

    // 代偿支付宝账号uid
    @NameInMap("compensate_alipay_user_id")
    public String compensateAlipayUserId;

    // 代偿支付宝登录账号
    @NameInMap("compensate_alipay_login_id")
    public String compensateAlipayLoginId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static SyncInnerFundmngloanresultsRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerFundmngloanresultsRequest self = new SyncInnerFundmngloanresultsRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerFundmngloanresultsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerFundmngloanresultsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerFundmngloanresultsRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public SyncInnerFundmngloanresultsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncInnerFundmngloanresultsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncInnerFundmngloanresultsRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncInnerFundmngloanresultsRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SyncInnerFundmngloanresultsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SyncInnerFundmngloanresultsRequest setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

    public SyncInnerFundmngloanresultsRequest setFinanceLoanResults(String financeLoanResults) {
        this.financeLoanResults = financeLoanResults;
        return this;
    }
    public String getFinanceLoanResults() {
        return this.financeLoanResults;
    }

    public SyncInnerFundmngloanresultsRequest setMerchantPromiseInfo(String merchantPromiseInfo) {
        this.merchantPromiseInfo = merchantPromiseInfo;
        return this;
    }
    public String getMerchantPromiseInfo() {
        return this.merchantPromiseInfo;
    }

    public SyncInnerFundmngloanresultsRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public SyncInnerFundmngloanresultsRequest setPayStartTermIndex(Long payStartTermIndex) {
        this.payStartTermIndex = payStartTermIndex;
        return this;
    }
    public Long getPayStartTermIndex() {
        return this.payStartTermIndex;
    }

    public SyncInnerFundmngloanresultsRequest setDivideAlipayUserId(String divideAlipayUserId) {
        this.divideAlipayUserId = divideAlipayUserId;
        return this;
    }
    public String getDivideAlipayUserId() {
        return this.divideAlipayUserId;
    }

    public SyncInnerFundmngloanresultsRequest setDivideAlipayLoginId(String divideAlipayLoginId) {
        this.divideAlipayLoginId = divideAlipayLoginId;
        return this;
    }
    public String getDivideAlipayLoginId() {
        return this.divideAlipayLoginId;
    }

    public SyncInnerFundmngloanresultsRequest setCompensateAlipayUserId(String compensateAlipayUserId) {
        this.compensateAlipayUserId = compensateAlipayUserId;
        return this;
    }
    public String getCompensateAlipayUserId() {
        return this.compensateAlipayUserId;
    }

    public SyncInnerFundmngloanresultsRequest setCompensateAlipayLoginId(String compensateAlipayLoginId) {
        this.compensateAlipayLoginId = compensateAlipayLoginId;
        return this;
    }
    public String getCompensateAlipayLoginId() {
        return this.compensateAlipayLoginId;
    }

    public SyncInnerFundmngloanresultsRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
