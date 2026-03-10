// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeLoanLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用信审批申请编号
    @NameInMap("apply_id")
    @Validation(required = true)
    public String applyId;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    // 授信编号
    @NameInMap("credit_no")
    @Validation(required = true)
    public String creditNo;

    // 资产类型， 1：借钱（默认） 2：电商购物 3：乐花卡
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 借款金额，单位：元
    @NameInMap("loan_principal")
    @Validation(required = true)
    public Long loanPrincipal;

    // 借款期数，比如：1,2,3,6,9,12,15,18,24,36
    @NameInMap("loan_term")
    @Validation(required = true)
    public Long loanTerm;

    // 申请贷款用途， 借钱（透传）：日常消费；运动健身；电商购物；生活开销；学习进修；学艺术班；技能培训 电商购物（默认）：电商购物 乐花卡（默认）：个人综合消费
    @NameInMap("loan_use")
    @Validation(required = true)
    public String loanUse;

    // 银行卡绑定手机号
    @NameInMap("mobile_no")
    @Validation(required = true)
    public String mobileNo;

    // 借款人收款户名， 借钱业务：借款用户个人收款账户名 电商业务：打款到对公户，传对公户相关账号信息
    @NameInMap("debit_account_name")
    @Validation(required = true)
    public String debitAccountName;

    // 收款人银行卡开户行， 借钱业务：借款用户个人账户开户行名称 电商业务：打款到对公户，传对公户相关账号信息
    @NameInMap("debit_open_account_bank")
    @Validation(required = true)
    public String debitOpenAccountBank;

    // 收款人银行卡卡号， 借钱业务：借款用户个人账户卡号 电商业务：打款到对公户，传对公户相关账号信息
    @NameInMap("debit_account_no")
    @Validation(required = true)
    public String debitAccountNo;

    // 收款卡联行号， 借钱业务：非必传 电商业务：打款到对公户，传对公户相关账号信息
    @NameInMap("debit_cnaps")
    @Validation(required = true)
    public String debitCnaps;

    // 还款方式， 1-等额本息（默认） 2-等额本金 4-气球贷 10- 等本等息 13-先息后本
    @NameInMap("repay_type")
    @Validation(required = true)
    public String repayType;

    public static ApplyDubbridgeLoanLxRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeLoanLxRequest self = new ApplyDubbridgeLoanLxRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeLoanLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeLoanLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeLoanLxRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public ApplyDubbridgeLoanLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public ApplyDubbridgeLoanLxRequest setCreditNo(String creditNo) {
        this.creditNo = creditNo;
        return this;
    }
    public String getCreditNo() {
        return this.creditNo;
    }

    public ApplyDubbridgeLoanLxRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ApplyDubbridgeLoanLxRequest setLoanPrincipal(Long loanPrincipal) {
        this.loanPrincipal = loanPrincipal;
        return this;
    }
    public Long getLoanPrincipal() {
        return this.loanPrincipal;
    }

    public ApplyDubbridgeLoanLxRequest setLoanTerm(Long loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }
    public Long getLoanTerm() {
        return this.loanTerm;
    }

    public ApplyDubbridgeLoanLxRequest setLoanUse(String loanUse) {
        this.loanUse = loanUse;
        return this;
    }
    public String getLoanUse() {
        return this.loanUse;
    }

    public ApplyDubbridgeLoanLxRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public ApplyDubbridgeLoanLxRequest setDebitAccountName(String debitAccountName) {
        this.debitAccountName = debitAccountName;
        return this;
    }
    public String getDebitAccountName() {
        return this.debitAccountName;
    }

    public ApplyDubbridgeLoanLxRequest setDebitOpenAccountBank(String debitOpenAccountBank) {
        this.debitOpenAccountBank = debitOpenAccountBank;
        return this;
    }
    public String getDebitOpenAccountBank() {
        return this.debitOpenAccountBank;
    }

    public ApplyDubbridgeLoanLxRequest setDebitAccountNo(String debitAccountNo) {
        this.debitAccountNo = debitAccountNo;
        return this;
    }
    public String getDebitAccountNo() {
        return this.debitAccountNo;
    }

    public ApplyDubbridgeLoanLxRequest setDebitCnaps(String debitCnaps) {
        this.debitCnaps = debitCnaps;
        return this;
    }
    public String getDebitCnaps() {
        return this.debitCnaps;
    }

    public ApplyDubbridgeLoanLxRequest setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

}
