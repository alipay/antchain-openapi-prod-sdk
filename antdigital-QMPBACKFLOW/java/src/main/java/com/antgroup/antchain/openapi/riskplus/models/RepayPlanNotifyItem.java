// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayPlanNotifyItem extends TeaModel {
    // 当前期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("loan_term")
    @Validation(required = true)
    public Long loanTerm;

    // 应还日，yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("expect_repay_date")
    @Validation(required = true)
    public String expectRepayDate;

    // 应还总额(元)
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("expect_repay_amount")
    @Validation(required = true)
    public Long expectRepayAmount;

    // 应还本金(元)
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("expect_repay_principal")
    @Validation(required = true)
    public Long expectRepayPrincipal;

    // 应还利息(元)
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("expect_repay_interest")
    @Validation(required = true)
    public Long expectRepayInterest;

    // 应还担保费(元)
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("expect_repay_guarantee")
    public Long expectRepayGuarantee;

    // 起息日，格式 YYYY-MM-DD
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("interest_start_date")
    public String interestStartDate;

    // 实还总额(元)，如未还则传0
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("repay_amount")
    public Long repayAmount;

    // 已还本金(元)，如未还则传0
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("repaid_principal")
    public Long repaidPrincipal;

    // 已还利息(元)，如未还则传0
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("repaid_interest")
    public Long repaidInterest;

    // 应还罚息(元)，
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("expect_repay_muclt")
    public Long expectRepayMuclt;

    // 已还罚息(元)，如未还则传0
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("repaid_penalty")
    public Long repaidPenalty;

    // 状态标志 
    // 0-正常未到期 
    // 1-正常已还清 
    // 2-逾期
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("schedule_status")
    public String scheduleStatus;

    public static RepayPlanNotifyItem build(java.util.Map<String, ?> map) throws Exception {
        RepayPlanNotifyItem self = new RepayPlanNotifyItem();
        return TeaModel.build(map, self);
    }

    public RepayPlanNotifyItem setLoanTerm(Long loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }
    public Long getLoanTerm() {
        return this.loanTerm;
    }

    public RepayPlanNotifyItem setExpectRepayDate(String expectRepayDate) {
        this.expectRepayDate = expectRepayDate;
        return this;
    }
    public String getExpectRepayDate() {
        return this.expectRepayDate;
    }

    public RepayPlanNotifyItem setExpectRepayAmount(Long expectRepayAmount) {
        this.expectRepayAmount = expectRepayAmount;
        return this;
    }
    public Long getExpectRepayAmount() {
        return this.expectRepayAmount;
    }

    public RepayPlanNotifyItem setExpectRepayPrincipal(Long expectRepayPrincipal) {
        this.expectRepayPrincipal = expectRepayPrincipal;
        return this;
    }
    public Long getExpectRepayPrincipal() {
        return this.expectRepayPrincipal;
    }

    public RepayPlanNotifyItem setExpectRepayInterest(Long expectRepayInterest) {
        this.expectRepayInterest = expectRepayInterest;
        return this;
    }
    public Long getExpectRepayInterest() {
        return this.expectRepayInterest;
    }

    public RepayPlanNotifyItem setExpectRepayGuarantee(Long expectRepayGuarantee) {
        this.expectRepayGuarantee = expectRepayGuarantee;
        return this;
    }
    public Long getExpectRepayGuarantee() {
        return this.expectRepayGuarantee;
    }

    public RepayPlanNotifyItem setInterestStartDate(String interestStartDate) {
        this.interestStartDate = interestStartDate;
        return this;
    }
    public String getInterestStartDate() {
        return this.interestStartDate;
    }

    public RepayPlanNotifyItem setRepayAmount(Long repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public Long getRepayAmount() {
        return this.repayAmount;
    }

    public RepayPlanNotifyItem setRepaidPrincipal(Long repaidPrincipal) {
        this.repaidPrincipal = repaidPrincipal;
        return this;
    }
    public Long getRepaidPrincipal() {
        return this.repaidPrincipal;
    }

    public RepayPlanNotifyItem setRepaidInterest(Long repaidInterest) {
        this.repaidInterest = repaidInterest;
        return this;
    }
    public Long getRepaidInterest() {
        return this.repaidInterest;
    }

    public RepayPlanNotifyItem setExpectRepayMuclt(Long expectRepayMuclt) {
        this.expectRepayMuclt = expectRepayMuclt;
        return this;
    }
    public Long getExpectRepayMuclt() {
        return this.expectRepayMuclt;
    }

    public RepayPlanNotifyItem setRepaidPenalty(Long repaidPenalty) {
        this.repaidPenalty = repaidPenalty;
        return this;
    }
    public Long getRepaidPenalty() {
        return this.repaidPenalty;
    }

    public RepayPlanNotifyItem setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

}
