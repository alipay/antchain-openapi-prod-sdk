// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerFundassetpackagefinanceplanRequest extends TeaModel {
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

    // 资金方案版本号
    @NameInMap("finance_plan_version")
    @Validation(required = true)
    public Long financePlanVersion;

    // 用户输入内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 资金方案内容
    @NameInMap("asset_package_finance_plan")
    @Validation(required = true)
    public AssetPackageFinancePlan assetPackageFinancePlan;

    public static UpdateInnerFundassetpackagefinanceplanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerFundassetpackagefinanceplanRequest self = new UpdateInnerFundassetpackagefinanceplanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setFinancePlanVersion(Long financePlanVersion) {
        this.financePlanVersion = financePlanVersion;
        return this;
    }
    public Long getFinancePlanVersion() {
        return this.financePlanVersion;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public UpdateInnerFundassetpackagefinanceplanRequest setAssetPackageFinancePlan(AssetPackageFinancePlan assetPackageFinancePlan) {
        this.assetPackageFinancePlan = assetPackageFinancePlan;
        return this;
    }
    public AssetPackageFinancePlan getAssetPackageFinancePlan() {
        return this.assetPackageFinancePlan;
    }

}
