// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RenderInnerFundmngmerchantpromiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 商户履约计划excel文件
    @NameInMap("file_info")
    @Validation(required = true)
    public FileInfo fileInfo;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

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

    // 商户履约起始期数
    @NameInMap("pay_start_term_index")
    @Validation(required = true)
    public Long payStartTermIndex;

    // 融资模式 
    // 供应链金融: SUPPLY_CHAIN_FINANCE 
    // 自定义还款: DEFAULT
    @NameInMap("fund_mode")
    @Validation(required = true)
    public String fundMode;

    public static RenderInnerFundmngmerchantpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderInnerFundmngmerchantpromiseRequest self = new RenderInnerFundmngmerchantpromiseRequest();
        return TeaModel.build(map, self);
    }

    public RenderInnerFundmngmerchantpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RenderInnerFundmngmerchantpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RenderInnerFundmngmerchantpromiseRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public RenderInnerFundmngmerchantpromiseRequest setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

    public RenderInnerFundmngmerchantpromiseRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public RenderInnerFundmngmerchantpromiseRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public RenderInnerFundmngmerchantpromiseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RenderInnerFundmngmerchantpromiseRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public RenderInnerFundmngmerchantpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenderInnerFundmngmerchantpromiseRequest setPayStartTermIndex(Long payStartTermIndex) {
        this.payStartTermIndex = payStartTermIndex;
        return this;
    }
    public Long getPayStartTermIndex() {
        return this.payStartTermIndex;
    }

    public RenderInnerFundmngmerchantpromiseRequest setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

}
