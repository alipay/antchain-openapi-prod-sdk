// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerFundmngdatadownloadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 任务类型
    // DATAPHIN_FUND_MNG_DOWNLOAD_USER_PROIMSE：融资订单用户履约信息
    // DATAPHIN_FUND_MNG_DOWNLOAD_FINANCE_ORDER：融资订单交易履约明细
    // DATAPHIN_FUND_MNG_DOWNLOAD_FINANCE:融资订单放款信息
    // 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 商户社会统一信用代码，多个逗号分隔
    @NameInMap("merchant_id")
    public String merchantId;

    // 融资类型
    // SUPPLY_CHAIN_FINANCE:供应链金融
    @NameInMap("fund_mode")
    public String fundMode;

    // 放款渠道（根据枚举返回对应的excel模版，不作为数据筛选项）
    // ALIPAY；
    // BANK；
    @NameInMap("loan_channel")
    public String loanChannel;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 租户角色
    // 
    //       ROLE_MERCHANT(0, "商户"),
    //       ROLE_FINANCIER(1, "资金方"),
    //       ROLE_MIX(2, "商户资金方"),
    //       DATA_PROVIDER(3, "数据提供者"),
    //       ROLE_GUARANTOR(4, "担保方"),
    @NameInMap("tenant_role")
    public Long tenantRole;

    // 资方社会统一信用代码，多个逗号分隔
    @NameInMap("fund_id")
    public String fundId;

    public static SubmitInnerFundmngdatadownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerFundmngdatadownloadRequest self = new SubmitInnerFundmngdatadownloadRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerFundmngdatadownloadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerFundmngdatadownloadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerFundmngdatadownloadRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public SubmitInnerFundmngdatadownloadRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitInnerFundmngdatadownloadRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SubmitInnerFundmngdatadownloadRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SubmitInnerFundmngdatadownloadRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SubmitInnerFundmngdatadownloadRequest setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

    public SubmitInnerFundmngdatadownloadRequest setLoanChannel(String loanChannel) {
        this.loanChannel = loanChannel;
        return this;
    }
    public String getLoanChannel() {
        return this.loanChannel;
    }

    public SubmitInnerFundmngdatadownloadRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SubmitInnerFundmngdatadownloadRequest setTenantRole(Long tenantRole) {
        this.tenantRole = tenantRole;
        return this;
    }
    public Long getTenantRole() {
        return this.tenantRole;
    }

    public SubmitInnerFundmngdatadownloadRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
