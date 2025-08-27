// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundmngfinanceorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 资产包id
    @NameInMap("asset_package_id")
    public String assetPackageId;

    // 合同id
    @NameInMap("sign_no")
    public String signNo;

    // 商家公司名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 商家社会统一信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 融资申请开始时间
    @NameInMap("finance_apply_time_start")
    public String financeApplyTimeStart;

    // 融资申请结束时间
    @NameInMap("finance_apply_time_end")
    public String financeApplyTimeEnd;

    // 放款状态
    @NameInMap("loan_status")
    public String loanStatus;

    // 资方公司名称
    @NameInMap("fund_name")
    public String fundName;

    // 是否查询资方放款申请失败订单
    @NameInMap("is_loan_apply_fail")
    public Boolean isLoanApplyFail;

    //  分页
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    public static PagequeryInnerFundmngfinanceorderRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundmngfinanceorderRequest self = new PagequeryInnerFundmngfinanceorderRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundmngfinanceorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerFundmngfinanceorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerFundmngfinanceorderRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public PagequeryInnerFundmngfinanceorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PagequeryInnerFundmngfinanceorderRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public PagequeryInnerFundmngfinanceorderRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public PagequeryInnerFundmngfinanceorderRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public PagequeryInnerFundmngfinanceorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public PagequeryInnerFundmngfinanceorderRequest setFinanceApplyTimeStart(String financeApplyTimeStart) {
        this.financeApplyTimeStart = financeApplyTimeStart;
        return this;
    }
    public String getFinanceApplyTimeStart() {
        return this.financeApplyTimeStart;
    }

    public PagequeryInnerFundmngfinanceorderRequest setFinanceApplyTimeEnd(String financeApplyTimeEnd) {
        this.financeApplyTimeEnd = financeApplyTimeEnd;
        return this;
    }
    public String getFinanceApplyTimeEnd() {
        return this.financeApplyTimeEnd;
    }

    public PagequeryInnerFundmngfinanceorderRequest setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
        return this;
    }
    public String getLoanStatus() {
        return this.loanStatus;
    }

    public PagequeryInnerFundmngfinanceorderRequest setFundName(String fundName) {
        this.fundName = fundName;
        return this;
    }
    public String getFundName() {
        return this.fundName;
    }

    public PagequeryInnerFundmngfinanceorderRequest setIsLoanApplyFail(Boolean isLoanApplyFail) {
        this.isLoanApplyFail = isLoanApplyFail;
        return this;
    }
    public Boolean getIsLoanApplyFail() {
        return this.isLoanApplyFail;
    }

    public PagequeryInnerFundmngfinanceorderRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

}
