// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAgreementPreviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信：apply
    // 借款：loan
    // 绑卡：bind
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 资金方编号
    @NameInMap("fund_code")
    @Validation(required = true)
    public String fundCode;

    // 客户号
    @NameInMap("customer_no")
    @Validation(required = true)
    public String customerNo;

    // 借款金额
    @NameInMap("loan_amount")
    public Long loanAmount;

    // 分期期数
    @NameInMap("period")
    public Long period;

    // 银行编码
    @NameInMap("bank_code")
    public String bankCode;

    // 还款方式
    @NameInMap("repay_type")
    public String repayType;

    // 银行名称
    @NameInMap("bank_name")
    public String bankName;

    // 银行卡号
    @NameInMap("bank_card_no")
    public String bankCardNo;

    // 借据截至日期yyyy-MM-dd
    @NameInMap("receipt_end_date")
    public String receiptEndDate;

    // 借款用途
    @NameInMap("loan_way")
    public String loanWay;

    // lpr
    @NameInMap("lpr")
    public Long lpr;

    // LPR加点值
    @NameInMap("lpr_point")
    public Long lprPoint;

    // LPR发布日期
    @NameInMap("lpr_effect_date")
    public String lprEffectDate;

    public static QueryDubbridgeAgreementPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAgreementPreviewRequest self = new QueryDubbridgeAgreementPreviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAgreementPreviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeAgreementPreviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeAgreementPreviewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryDubbridgeAgreementPreviewRequest setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public QueryDubbridgeAgreementPreviewRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryDubbridgeAgreementPreviewRequest setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }
    public Long getLoanAmount() {
        return this.loanAmount;
    }

    public QueryDubbridgeAgreementPreviewRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public QueryDubbridgeAgreementPreviewRequest setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public QueryDubbridgeAgreementPreviewRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public QueryDubbridgeAgreementPreviewRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public QueryDubbridgeAgreementPreviewRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public QueryDubbridgeAgreementPreviewRequest setReceiptEndDate(String receiptEndDate) {
        this.receiptEndDate = receiptEndDate;
        return this;
    }
    public String getReceiptEndDate() {
        return this.receiptEndDate;
    }

    public QueryDubbridgeAgreementPreviewRequest setLoanWay(String loanWay) {
        this.loanWay = loanWay;
        return this;
    }
    public String getLoanWay() {
        return this.loanWay;
    }

    public QueryDubbridgeAgreementPreviewRequest setLpr(Long lpr) {
        this.lpr = lpr;
        return this;
    }
    public Long getLpr() {
        return this.lpr;
    }

    public QueryDubbridgeAgreementPreviewRequest setLprPoint(Long lprPoint) {
        this.lprPoint = lprPoint;
        return this;
    }
    public Long getLprPoint() {
        return this.lprPoint;
    }

    public QueryDubbridgeAgreementPreviewRequest setLprEffectDate(String lprEffectDate) {
        this.lprEffectDate = lprEffectDate;
        return this;
    }
    public String getLprEffectDate() {
        return this.lprEffectDate;
    }

}
