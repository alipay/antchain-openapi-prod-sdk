// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyDubbridgeRepaymentplanLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支用申请编号
    @NameInMap("apply_id")
    @Validation(required = true)
    public String applyId;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    // 放款编号
    @NameInMap("capital_loan_no")
    @Validation(required = true)
    public String capitalLoanNo;

    // 借款总期数
    @NameInMap("total_term")
    @Validation(required = true)
    public Long totalTerm;

    // 借据总金额(元)
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 放款成功日期，yyyy_MM-dd HH:mm:ss
    @NameInMap("payment_time")
    @Validation(required = true)
    public String paymentTime;

    // 还款计划列表
    @NameInMap("repay_plans")
    @Validation(required = true)
    public java.util.List<RepayPlanNotifyItem> repayPlans;

    public static NotifyDubbridgeRepaymentplanLxRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyDubbridgeRepaymentplanLxRequest self = new NotifyDubbridgeRepaymentplanLxRequest();
        return TeaModel.build(map, self);
    }

    public NotifyDubbridgeRepaymentplanLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setCapitalLoanNo(String capitalLoanNo) {
        this.capitalLoanNo = capitalLoanNo;
        return this;
    }
    public String getCapitalLoanNo() {
        return this.capitalLoanNo;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setTotalTerm(Long totalTerm) {
        this.totalTerm = totalTerm;
        return this;
    }
    public Long getTotalTerm() {
        return this.totalTerm;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    public String getPaymentTime() {
        return this.paymentTime;
    }

    public NotifyDubbridgeRepaymentplanLxRequest setRepayPlans(java.util.List<RepayPlanNotifyItem> repayPlans) {
        this.repayPlans = repayPlans;
        return this;
    }
    public java.util.List<RepayPlanNotifyItem> getRepayPlans() {
        return this.repayPlans;
    }

}
