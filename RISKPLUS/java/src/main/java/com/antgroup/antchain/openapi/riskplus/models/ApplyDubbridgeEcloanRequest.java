// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeEcloanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 提款申请单
    @NameInMap("loan_apply_no")
    @Validation(required = true)
    public String loanApplyNo;

    // 合同编号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 提款金额
    @NameInMap("apply_loan_amt")
    @Validation(required = true)
    public String applyLoanAmt;

    // 币种
    @NameInMap("ccy")
    @Validation(required = true)
    public String ccy;

    // 支付方式
    @NameInMap("pay_mode")
    @Validation(required = true)
    public String payMode;

    // 还款方式
    @NameInMap("loan_repay_type")
    @Validation(required = true)
    public String loanRepayType;

    // 还款周期
    @NameInMap("repay_period")
    @Validation(required = true)
    public String repayPeriod;

    // 借据期限
    @NameInMap("loan_term")
    @Validation(required = true)
    public String loanTerm;

    // 期限单位
    @NameInMap("loan_term_unit")
    @Validation(required = true)
    public String loanTermUnit;

    public static ApplyDubbridgeEcloanRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeEcloanRequest self = new ApplyDubbridgeEcloanRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeEcloanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeEcloanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeEcloanRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public ApplyDubbridgeEcloanRequest setLoanApplyNo(String loanApplyNo) {
        this.loanApplyNo = loanApplyNo;
        return this;
    }
    public String getLoanApplyNo() {
        return this.loanApplyNo;
    }

    public ApplyDubbridgeEcloanRequest setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public ApplyDubbridgeEcloanRequest setApplyLoanAmt(String applyLoanAmt) {
        this.applyLoanAmt = applyLoanAmt;
        return this;
    }
    public String getApplyLoanAmt() {
        return this.applyLoanAmt;
    }

    public ApplyDubbridgeEcloanRequest setCcy(String ccy) {
        this.ccy = ccy;
        return this;
    }
    public String getCcy() {
        return this.ccy;
    }

    public ApplyDubbridgeEcloanRequest setPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }
    public String getPayMode() {
        return this.payMode;
    }

    public ApplyDubbridgeEcloanRequest setLoanRepayType(String loanRepayType) {
        this.loanRepayType = loanRepayType;
        return this;
    }
    public String getLoanRepayType() {
        return this.loanRepayType;
    }

    public ApplyDubbridgeEcloanRequest setRepayPeriod(String repayPeriod) {
        this.repayPeriod = repayPeriod;
        return this;
    }
    public String getRepayPeriod() {
        return this.repayPeriod;
    }

    public ApplyDubbridgeEcloanRequest setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }
    public String getLoanTerm() {
        return this.loanTerm;
    }

    public ApplyDubbridgeEcloanRequest setLoanTermUnit(String loanTermUnit) {
        this.loanTermUnit = loanTermUnit;
        return this;
    }
    public String getLoanTermUnit() {
        return this.loanTermUnit;
    }

}
