// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubbridgeEcrepayTrialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 申请流水
    @NameInMap("apply_no")
    @Validation(required = true)
    public String applyNo;

    // 借据号
    @NameInMap("loan_acct_no")
    @Validation(required = true)
    public String loanAcctNo;

    // 借款人证件类型
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 借款人证件号码
    @NameInMap("id_no")
    @Validation(required = true)
    public String idNo;

    // 本次还款总金额(含本金、利息、复利、罚息),不送默认全额还款
    @NameInMap("repay_amount")
    public String repayAmount;

    public static CountDubbridgeEcrepayTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDubbridgeEcrepayTrialRequest self = new CountDubbridgeEcrepayTrialRequest();
        return TeaModel.build(map, self);
    }

    public CountDubbridgeEcrepayTrialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountDubbridgeEcrepayTrialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountDubbridgeEcrepayTrialRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public CountDubbridgeEcrepayTrialRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public CountDubbridgeEcrepayTrialRequest setLoanAcctNo(String loanAcctNo) {
        this.loanAcctNo = loanAcctNo;
        return this;
    }
    public String getLoanAcctNo() {
        return this.loanAcctNo;
    }

    public CountDubbridgeEcrepayTrialRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public CountDubbridgeEcrepayTrialRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public CountDubbridgeEcrepayTrialRequest setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public String getRepayAmount() {
        return this.repayAmount;
    }

}
