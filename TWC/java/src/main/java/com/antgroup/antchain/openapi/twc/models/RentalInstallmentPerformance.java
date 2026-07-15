// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RentalInstallmentPerformance extends TeaModel {
    // 被申请人还款期数
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("repayment_period")
    @Validation(required = true)
    public Long repaymentPeriod;

    // 被申请人第几期租金支付方式
    /**
     * <strong>example:</strong>
     * <p>支付宝</p>
     */
    @NameInMap("rent_payment_type")
    @Validation(required = true)
    public String rentPaymentType;

    // 被申请人第几期还款时间
    /**
     * <strong>example:</strong>
     * <p>2021-05-07</p>
     */
    @NameInMap("applied_repayment_time")
    @Validation(required = true)
    public String appliedRepaymentTime;

    // 被申请人第几期还款金额
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("applied_repayment_amount")
    @Validation(required = true)
    public String appliedRepaymentAmount;

    public static RentalInstallmentPerformance build(java.util.Map<String, ?> map) throws Exception {
        RentalInstallmentPerformance self = new RentalInstallmentPerformance();
        return TeaModel.build(map, self);
    }

    public RentalInstallmentPerformance setRepaymentPeriod(Long repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
        return this;
    }
    public Long getRepaymentPeriod() {
        return this.repaymentPeriod;
    }

    public RentalInstallmentPerformance setRentPaymentType(String rentPaymentType) {
        this.rentPaymentType = rentPaymentType;
        return this;
    }
    public String getRentPaymentType() {
        return this.rentPaymentType;
    }

    public RentalInstallmentPerformance setAppliedRepaymentTime(String appliedRepaymentTime) {
        this.appliedRepaymentTime = appliedRepaymentTime;
        return this;
    }
    public String getAppliedRepaymentTime() {
        return this.appliedRepaymentTime;
    }

    public RentalInstallmentPerformance setAppliedRepaymentAmount(String appliedRepaymentAmount) {
        this.appliedRepaymentAmount = appliedRepaymentAmount;
        return this;
    }
    public String getAppliedRepaymentAmount() {
        return this.appliedRepaymentAmount;
    }

}
