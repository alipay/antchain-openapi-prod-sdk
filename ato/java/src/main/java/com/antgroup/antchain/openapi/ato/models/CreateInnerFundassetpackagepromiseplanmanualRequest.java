// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerFundassetpackagepromiseplanmanualRequest extends TeaModel {
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

    // 用户填写的履约计划表格数据
    @NameInMap("create_promise_plan_params")
    @Validation(required = true)
    public java.util.List<AssetPackageCreatePromisePlanParams> createPromisePlanParams;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static CreateInnerFundassetpackagepromiseplanmanualRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerFundassetpackagepromiseplanmanualRequest self = new CreateInnerFundassetpackagepromiseplanmanualRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setCreatePromisePlanParams(java.util.List<AssetPackageCreatePromisePlanParams> createPromisePlanParams) {
        this.createPromisePlanParams = createPromisePlanParams;
        return this;
    }
    public java.util.List<AssetPackageCreatePromisePlanParams> getCreatePromisePlanParams() {
        return this.createPromisePlanParams;
    }

    public CreateInnerFundassetpackagepromiseplanmanualRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
