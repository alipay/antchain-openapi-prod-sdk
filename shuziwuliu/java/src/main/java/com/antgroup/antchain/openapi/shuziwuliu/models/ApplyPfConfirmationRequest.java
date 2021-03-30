// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyPfConfirmationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求号
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 客户号
    @NameInMap("client_no")
    @Validation(required = true)
    public String clientNo;

    // 融资主体did
    @NameInMap("financing_subject_did")
    @Validation(required = true)
    public String financingSubjectDid;

    // 借款人证件类型
    @NameInMap("borrower_card_type")
    @Validation(required = true)
    public String borrowerCardType;

    // 借款人证件号码
    // 
    // 
    @NameInMap("borrower_card_no")
    @Validation(required = true)
    public String borrowerCardNo;

    // 融资金额
    // 
    // 
    @NameInMap("financing_amount")
    @Validation(required = true)
    public String financingAmount;

    // 支用币种
    // 
    // 
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 贷款期限（月）
    @NameInMap("loan_term")
    @Validation(required = true)
    public String loanTerm;

    // 收款方开户行总行联行号
    // 
    // 
    @NameInMap("payee_bank_union_number")
    @Validation(required = true)
    public String payeeBankUnionNumber;

    // 收款方开户行名称
    // 
    // 
    @NameInMap("payee_bank_name")
    @Validation(required = true)
    public String payeeBankName;

    // 收款方户名
    // 
    // 
    @NameInMap("payee_name")
    @Validation(required = true)
    public String payeeName;

    // 收款方银行卡账号
    // 
    // 
    @NameInMap("payee_bank_no")
    @Validation(required = true)
    public String payeeBankNo;

    // 收款人证件类型
    // 
    // 
    @NameInMap("payee_card_type")
    public String payeeCardType;

    // 收款人证件号码
    // 
    // 
    @NameInMap("payee_card_no")
    public String payeeCardNo;

    // 贷款用途
    // 
    // 
    @NameInMap("purpose")
    @Validation(required = true)
    public String purpose;

    // 附言
    @NameInMap("postscript")
    public String postscript;

    public static ApplyPfConfirmationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPfConfirmationRequest self = new ApplyPfConfirmationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPfConfirmationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyPfConfirmationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyPfConfirmationRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public ApplyPfConfirmationRequest setClientNo(String clientNo) {
        this.clientNo = clientNo;
        return this;
    }
    public String getClientNo() {
        return this.clientNo;
    }

    public ApplyPfConfirmationRequest setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

    public ApplyPfConfirmationRequest setBorrowerCardType(String borrowerCardType) {
        this.borrowerCardType = borrowerCardType;
        return this;
    }
    public String getBorrowerCardType() {
        return this.borrowerCardType;
    }

    public ApplyPfConfirmationRequest setBorrowerCardNo(String borrowerCardNo) {
        this.borrowerCardNo = borrowerCardNo;
        return this;
    }
    public String getBorrowerCardNo() {
        return this.borrowerCardNo;
    }

    public ApplyPfConfirmationRequest setFinancingAmount(String financingAmount) {
        this.financingAmount = financingAmount;
        return this;
    }
    public String getFinancingAmount() {
        return this.financingAmount;
    }

    public ApplyPfConfirmationRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ApplyPfConfirmationRequest setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }
    public String getLoanTerm() {
        return this.loanTerm;
    }

    public ApplyPfConfirmationRequest setPayeeBankUnionNumber(String payeeBankUnionNumber) {
        this.payeeBankUnionNumber = payeeBankUnionNumber;
        return this;
    }
    public String getPayeeBankUnionNumber() {
        return this.payeeBankUnionNumber;
    }

    public ApplyPfConfirmationRequest setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
        return this;
    }
    public String getPayeeBankName() {
        return this.payeeBankName;
    }

    public ApplyPfConfirmationRequest setPayeeName(String payeeName) {
        this.payeeName = payeeName;
        return this;
    }
    public String getPayeeName() {
        return this.payeeName;
    }

    public ApplyPfConfirmationRequest setPayeeBankNo(String payeeBankNo) {
        this.payeeBankNo = payeeBankNo;
        return this;
    }
    public String getPayeeBankNo() {
        return this.payeeBankNo;
    }

    public ApplyPfConfirmationRequest setPayeeCardType(String payeeCardType) {
        this.payeeCardType = payeeCardType;
        return this;
    }
    public String getPayeeCardType() {
        return this.payeeCardType;
    }

    public ApplyPfConfirmationRequest setPayeeCardNo(String payeeCardNo) {
        this.payeeCardNo = payeeCardNo;
        return this;
    }
    public String getPayeeCardNo() {
        return this.payeeCardNo;
    }

    public ApplyPfConfirmationRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public ApplyPfConfirmationRequest setPostscript(String postscript) {
        this.postscript = postscript;
        return this;
    }
    public String getPostscript() {
        return this.postscript;
    }

}
