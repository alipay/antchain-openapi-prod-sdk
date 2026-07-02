// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundassetpackageallocatedetailRequest extends TeaModel {
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

    // 账期
    @NameInMap("period_num")
    @Validation(required = true)
    public Long periodNum;

    // 生成方式，
    // AI：智能体；
    // MANUL：人工
    @NameInMap("generate_method")
    public String generateMethod;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryInnerFundassetpackageallocatedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundassetpackageallocatedetailRequest self = new QueryInnerFundassetpackageallocatedetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundassetpackageallocatedetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setGenerateMethod(String generateMethod) {
        this.generateMethod = generateMethod;
        return this;
    }
    public String getGenerateMethod() {
        return this.generateMethod;
    }

    public QueryInnerFundassetpackageallocatedetailRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
