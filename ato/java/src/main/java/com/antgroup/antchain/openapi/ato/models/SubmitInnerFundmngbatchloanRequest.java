// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerFundmngbatchloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 商家代偿开始天数
    @NameInMap("merchant_compensate_start_day")
    public Long merchantCompensateStartDay;

    // 分账支付宝账号uid
    @NameInMap("divide_alipay_user_id")
    @Validation(required = true)
    public String divideAlipayUserId;

    // 分账支付宝登录账号
    @NameInMap("divide_alipay_login_id")
    @Validation(required = true)
    public String divideAlipayLoginId;

    // 代偿支付宝账号uid
    @NameInMap("compensate_alipay_user_id")
    @Validation(required = true)
    public String compensateAlipayUserId;

    // 代偿支付宝登录账号
    @NameInMap("compensate_alipay_login_id")
    @Validation(required = true)
    public String compensateAlipayLoginId;

    // 融资模式
    // 供应链金融:SUPPLY_CHAIN_FINANCE;
    // 自定义还款:DEFAULT
    @NameInMap("fund_mode")
    @Validation(required = true)
    public String fundMode;

    // 批量放款文件
    @NameInMap("file_info")
    @Validation(required = true)
    public FileInfo fileInfo;

    // 页面调用traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 付费角色
    // MERCHANT ：商户
    // FINANCIER： 资方
    @NameInMap("paid_role")
    public String paidRole;

    // 付费方社会统一信用代码
    @NameInMap("paid_company_id")
    public String paidCompanyId;

    // 放款渠道
    // BANK :银行
    // ALIPAY : 支付宝
    @NameInMap("loan_channel")
    public String loanChannel;

    public static SubmitInnerFundmngbatchloanRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerFundmngbatchloanRequest self = new SubmitInnerFundmngbatchloanRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerFundmngbatchloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerFundmngbatchloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerFundmngbatchloanRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public SubmitInnerFundmngbatchloanRequest setMerchantCompensateStartDay(Long merchantCompensateStartDay) {
        this.merchantCompensateStartDay = merchantCompensateStartDay;
        return this;
    }
    public Long getMerchantCompensateStartDay() {
        return this.merchantCompensateStartDay;
    }

    public SubmitInnerFundmngbatchloanRequest setDivideAlipayUserId(String divideAlipayUserId) {
        this.divideAlipayUserId = divideAlipayUserId;
        return this;
    }
    public String getDivideAlipayUserId() {
        return this.divideAlipayUserId;
    }

    public SubmitInnerFundmngbatchloanRequest setDivideAlipayLoginId(String divideAlipayLoginId) {
        this.divideAlipayLoginId = divideAlipayLoginId;
        return this;
    }
    public String getDivideAlipayLoginId() {
        return this.divideAlipayLoginId;
    }

    public SubmitInnerFundmngbatchloanRequest setCompensateAlipayUserId(String compensateAlipayUserId) {
        this.compensateAlipayUserId = compensateAlipayUserId;
        return this;
    }
    public String getCompensateAlipayUserId() {
        return this.compensateAlipayUserId;
    }

    public SubmitInnerFundmngbatchloanRequest setCompensateAlipayLoginId(String compensateAlipayLoginId) {
        this.compensateAlipayLoginId = compensateAlipayLoginId;
        return this;
    }
    public String getCompensateAlipayLoginId() {
        return this.compensateAlipayLoginId;
    }

    public SubmitInnerFundmngbatchloanRequest setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

    public SubmitInnerFundmngbatchloanRequest setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

    public SubmitInnerFundmngbatchloanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SubmitInnerFundmngbatchloanRequest setPaidRole(String paidRole) {
        this.paidRole = paidRole;
        return this;
    }
    public String getPaidRole() {
        return this.paidRole;
    }

    public SubmitInnerFundmngbatchloanRequest setPaidCompanyId(String paidCompanyId) {
        this.paidCompanyId = paidCompanyId;
        return this;
    }
    public String getPaidCompanyId() {
        return this.paidCompanyId;
    }

    public SubmitInnerFundmngbatchloanRequest setLoanChannel(String loanChannel) {
        this.loanChannel = loanChannel;
        return this;
    }
    public String getLoanChannel() {
        return this.loanChannel;
    }

}
