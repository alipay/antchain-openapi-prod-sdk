// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractCourtdeductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 客户自定义案件id
    @NameInMap("case_id")
    @Validation(required = true)
    public String caseId;

    // 案件名称
    @NameInMap("case_name")
    @Validation(required = true)
    public String caseName;

    // 收款方人姓名
    @NameInMap("payee_name")
    @Validation(required = true)
    public String payeeName;

    // 收款方人银行账户
    @NameInMap("payee_account")
    @Validation(required = true)
    public String payeeAccount;

    // 收款方银行类型
    @NameInMap("payee_bank_type")
    @Validation(required = true)
    public String payeeBankType;

    // 付款方人姓名
    @NameInMap("payer_name")
    @Validation(required = true)
    public String payerName;

    // 付款方银行账户
    @NameInMap("payer_account")
    @Validation(required = true)
    public String payerAccount;

    // 付款方银行类型，例如：icbc（工行）
    @NameInMap("payer_bank_type")
    @Validation(required = true)
    public String payerBankType;

    // 扣款计划详情列表
    @NameInMap("payment_detail_list")
    @Validation(required = true)
    public java.util.List<PaymentDetail> paymentDetailList;

    public static CreateContractCourtdeductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractCourtdeductRequest self = new CreateContractCourtdeductRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractCourtdeductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractCourtdeductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractCourtdeductRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateContractCourtdeductRequest setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public CreateContractCourtdeductRequest setCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }
    public String getCaseName() {
        return this.caseName;
    }

    public CreateContractCourtdeductRequest setPayeeName(String payeeName) {
        this.payeeName = payeeName;
        return this;
    }
    public String getPayeeName() {
        return this.payeeName;
    }

    public CreateContractCourtdeductRequest setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
        return this;
    }
    public String getPayeeAccount() {
        return this.payeeAccount;
    }

    public CreateContractCourtdeductRequest setPayeeBankType(String payeeBankType) {
        this.payeeBankType = payeeBankType;
        return this;
    }
    public String getPayeeBankType() {
        return this.payeeBankType;
    }

    public CreateContractCourtdeductRequest setPayerName(String payerName) {
        this.payerName = payerName;
        return this;
    }
    public String getPayerName() {
        return this.payerName;
    }

    public CreateContractCourtdeductRequest setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount;
        return this;
    }
    public String getPayerAccount() {
        return this.payerAccount;
    }

    public CreateContractCourtdeductRequest setPayerBankType(String payerBankType) {
        this.payerBankType = payerBankType;
        return this;
    }
    public String getPayerBankType() {
        return this.payerBankType;
    }

    public CreateContractCourtdeductRequest setPaymentDetailList(java.util.List<PaymentDetail> paymentDetailList) {
        this.paymentDetailList = paymentDetailList;
        return this;
    }
    public java.util.List<PaymentDetail> getPaymentDetailList() {
        return this.paymentDetailList;
    }

}
