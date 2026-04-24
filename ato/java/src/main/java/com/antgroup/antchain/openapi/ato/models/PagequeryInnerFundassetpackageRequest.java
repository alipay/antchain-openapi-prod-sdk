// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFundassetpackageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产包id
    @NameInMap("asset_package_id")
    public String assetPackageId;

    // 商家公司名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 融资申请时间开始
    @NameInMap("finance_apply_time_start")
    public String financeApplyTimeStart;

    // 融资申请时间结束
    @NameInMap("finance_apply_time_end")
    public String financeApplyTimeEnd;

    // 放款状态
    @NameInMap("finance_apply_status")
    public String financeApplyStatus;

    // 分页信息
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // traceId
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    public static PagequeryInnerFundassetpackageRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFundassetpackageRequest self = new PagequeryInnerFundassetpackageRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFundassetpackageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryInnerFundassetpackageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryInnerFundassetpackageRequest setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public PagequeryInnerFundassetpackageRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public PagequeryInnerFundassetpackageRequest setFinanceApplyTimeStart(String financeApplyTimeStart) {
        this.financeApplyTimeStart = financeApplyTimeStart;
        return this;
    }
    public String getFinanceApplyTimeStart() {
        return this.financeApplyTimeStart;
    }

    public PagequeryInnerFundassetpackageRequest setFinanceApplyTimeEnd(String financeApplyTimeEnd) {
        this.financeApplyTimeEnd = financeApplyTimeEnd;
        return this;
    }
    public String getFinanceApplyTimeEnd() {
        return this.financeApplyTimeEnd;
    }

    public PagequeryInnerFundassetpackageRequest setFinanceApplyStatus(String financeApplyStatus) {
        this.financeApplyStatus = financeApplyStatus;
        return this;
    }
    public String getFinanceApplyStatus() {
        return this.financeApplyStatus;
    }

    public PagequeryInnerFundassetpackageRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public PagequeryInnerFundassetpackageRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public PagequeryInnerFundassetpackageRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

}
