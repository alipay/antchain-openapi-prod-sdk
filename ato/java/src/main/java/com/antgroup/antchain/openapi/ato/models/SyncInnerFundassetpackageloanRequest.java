// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncInnerFundassetpackageloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 资方id
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 资产包id
    @NameInMap("asset_package_id")
    @Validation(required = true)
    public String assetPackageId;

    // AGREE_LOAN（同意放款） 
    // REJECT_LOAN（拒绝放款）
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 放款时间
    @NameInMap("loan_time")
    public String loanTime;

    // 放款总金额
    @NameInMap("loan_total_money")
    public Long loanTotalMoney;

    //   放款凭证
    @NameInMap("loan_credit")
    public FileInfo loanCredit;

    // 放款其他凭证
    @NameInMap("loan_other_credit")
    public java.util.List<FileInfo> loanOtherCredit;

    public static SyncInnerFundassetpackageloanRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerFundassetpackageloanRequest self = new SyncInnerFundassetpackageloanRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerFundassetpackageloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerFundassetpackageloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerFundassetpackageloanRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public SyncInnerFundassetpackageloanRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SyncInnerFundassetpackageloanRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncInnerFundassetpackageloanRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncInnerFundassetpackageloanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SyncInnerFundassetpackageloanRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public SyncInnerFundassetpackageloanRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SyncInnerFundassetpackageloanRequest setLoanTime(String loanTime) {
        this.loanTime = loanTime;
        return this;
    }
    public String getLoanTime() {
        return this.loanTime;
    }

    public SyncInnerFundassetpackageloanRequest setLoanTotalMoney(Long loanTotalMoney) {
        this.loanTotalMoney = loanTotalMoney;
        return this;
    }
    public Long getLoanTotalMoney() {
        return this.loanTotalMoney;
    }

    public SyncInnerFundassetpackageloanRequest setLoanCredit(FileInfo loanCredit) {
        this.loanCredit = loanCredit;
        return this;
    }
    public FileInfo getLoanCredit() {
        return this.loanCredit;
    }

    public SyncInnerFundassetpackageloanRequest setLoanOtherCredit(java.util.List<FileInfo> loanOtherCredit) {
        this.loanOtherCredit = loanOtherCredit;
        return this;
    }
    public java.util.List<FileInfo> getLoanOtherCredit() {
        return this.loanOtherCredit;
    }

}
