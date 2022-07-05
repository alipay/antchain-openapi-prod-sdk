// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayTrail extends TeaModel {
    // 期数
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 每期应还金额
    @NameInMap("need_amt")
    @Validation(required = true)
    public Long needAmt;

    // 每期已还金额
    @NameInMap("already_amt")
    @Validation(required = true)
    public Long alreadyAmt;

    // 每期应还本金
    @NameInMap("trans_principal")
    @Validation(required = true)
    public Long transPrincipal;

    // 每期应还利息
    @NameInMap("trans_interest")
    @Validation(required = true)
    public Long transInterest;

    // 每期还款费用
    @NameInMap("trans_fee")
    @Validation(required = true)
    public Long transFee;

    // 剩余本金
    @NameInMap("remain_principal")
    @Validation(required = true)
    public Long remainPrincipal;

    // 还款时间
    @NameInMap("repay_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String repayTime;

    // 计息开始时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 计息结束时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 试算编号
    @NameInMap("trial_no")
    @Validation(required = true)
    public String trialNo;

    public static RepayTrail build(java.util.Map<String, ?> map) throws Exception {
        RepayTrail self = new RepayTrail();
        return TeaModel.build(map, self);
    }

    public RepayTrail setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RepayTrail setNeedAmt(Long needAmt) {
        this.needAmt = needAmt;
        return this;
    }
    public Long getNeedAmt() {
        return this.needAmt;
    }

    public RepayTrail setAlreadyAmt(Long alreadyAmt) {
        this.alreadyAmt = alreadyAmt;
        return this;
    }
    public Long getAlreadyAmt() {
        return this.alreadyAmt;
    }

    public RepayTrail setTransPrincipal(Long transPrincipal) {
        this.transPrincipal = transPrincipal;
        return this;
    }
    public Long getTransPrincipal() {
        return this.transPrincipal;
    }

    public RepayTrail setTransInterest(Long transInterest) {
        this.transInterest = transInterest;
        return this;
    }
    public Long getTransInterest() {
        return this.transInterest;
    }

    public RepayTrail setTransFee(Long transFee) {
        this.transFee = transFee;
        return this;
    }
    public Long getTransFee() {
        return this.transFee;
    }

    public RepayTrail setRemainPrincipal(Long remainPrincipal) {
        this.remainPrincipal = remainPrincipal;
        return this;
    }
    public Long getRemainPrincipal() {
        return this.remainPrincipal;
    }

    public RepayTrail setRepayTime(String repayTime) {
        this.repayTime = repayTime;
        return this;
    }
    public String getRepayTime() {
        return this.repayTime;
    }

    public RepayTrail setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public RepayTrail setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public RepayTrail setTrialNo(String trialNo) {
        this.trialNo = trialNo;
        return this;
    }
    public String getTrialNo() {
        return this.trialNo;
    }

}
