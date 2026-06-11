// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundassetpackagerepaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户ID
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 资产包ID
    @NameInMap("asset_package_id")
    public String assetPackageId;

    // 商户名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 放款起始时间
    @NameInMap("loan_time_start")
    public String loanTimeStart;

    // 放款结束时间
    @NameInMap("loan_time_end")
    public String loanTimeEnd;

    // 还款状态
    @NameInMap("repayment_status")
    public String repaymentStatus;

    // 分页信息
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryInnerFundassetpackagerepaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundassetpackagerepaymentRequest self = new QueryInnerFundassetpackagerepaymentRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundassetpackagerepaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerFundassetpackagerepaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerFundassetpackagerepaymentRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public QueryInnerFundassetpackagerepaymentRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public QueryInnerFundassetpackagerepaymentRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QueryInnerFundassetpackagerepaymentRequest setLoanTimeStart(String loanTimeStart) {
        this.loanTimeStart = loanTimeStart;
        return this;
    }
    public String getLoanTimeStart() {
        return this.loanTimeStart;
    }

    public QueryInnerFundassetpackagerepaymentRequest setLoanTimeEnd(String loanTimeEnd) {
        this.loanTimeEnd = loanTimeEnd;
        return this;
    }
    public String getLoanTimeEnd() {
        return this.loanTimeEnd;
    }

    public QueryInnerFundassetpackagerepaymentRequest setRepaymentStatus(String repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
        return this;
    }
    public String getRepaymentStatus() {
        return this.repaymentStatus;
    }

    public QueryInnerFundassetpackagerepaymentRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public QueryInnerFundassetpackagerepaymentRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
