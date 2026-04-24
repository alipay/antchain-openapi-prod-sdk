// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundassetpackagepromiseplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 资产包id
    @NameInMap("asset_package_id")
    @Validation(required = true)
    public String assetPackageId;

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

    // PROMISE_PLAN 履约计划页面
    // ASSET_PACKAGE_DETAIL 资产包详情页面
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // trace_id
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 生成方式，
    // AI：智能体；
    // MANUL：人工。
    // source=ASSET_PACKAGE_DETAIL，禁止传该参数
    // source=PROMISE_PLAN，必传该参数
    @NameInMap("generate_method")
    public String generateMethod;

    public static QueryInnerFundassetpackagepromiseplanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundassetpackagepromiseplanRequest self = new QueryInnerFundassetpackagepromiseplanRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundassetpackagepromiseplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryInnerFundassetpackagepromiseplanRequest setGenerateMethod(String generateMethod) {
        this.generateMethod = generateMethod;
        return this;
    }
    public String getGenerateMethod() {
        return this.generateMethod;
    }

}
