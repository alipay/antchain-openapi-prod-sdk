// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayInfo extends TeaModel {
    // true：逾期
    // false：未逾期
    @NameInMap("overdue_flag")
    @Validation(required = true)
    public Boolean overdueFlag;

    // 逾期天数
    @NameInMap("over_days")
    @Validation(required = true)
    public Long overDays;

    // 逾期金额在50元以上的客户的逾期天数
    @NameInMap("valuable_over_days")
    @Validation(required = true)
    public Long valuableOverDays;

    // 逾期期数
    @NameInMap("over_period_count")
    @Validation(required = true)
    public Long overPeriodCount;

    // 逾期本金
    @NameInMap("over_principal")
    @Validation(required = true)
    public Long overPrincipal;

    // 逾期利息
    @NameInMap("over_interest")
    @Validation(required = true)
    public Long overInterest;

    // 应还罚息
    @NameInMap("over_punish")
    @Validation(required = true)
    public Long overPunish;

    // 应还逾期总额
    @NameInMap("need_overdue_amount")
    @Validation(required = true)
    public Long needOverdueAmount;

    // 当前应还总额（包含逾期和当前期）
    @NameInMap("current_need_amount")
    @Validation(required = true)
    public Long currentNeedAmount;

    // 总剩余应还
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    public static RepayInfo build(java.util.Map<String, ?> map) throws Exception {
        RepayInfo self = new RepayInfo();
        return TeaModel.build(map, self);
    }

    public RepayInfo setOverdueFlag(Boolean overdueFlag) {
        this.overdueFlag = overdueFlag;
        return this;
    }
    public Boolean getOverdueFlag() {
        return this.overdueFlag;
    }

    public RepayInfo setOverDays(Long overDays) {
        this.overDays = overDays;
        return this;
    }
    public Long getOverDays() {
        return this.overDays;
    }

    public RepayInfo setValuableOverDays(Long valuableOverDays) {
        this.valuableOverDays = valuableOverDays;
        return this;
    }
    public Long getValuableOverDays() {
        return this.valuableOverDays;
    }

    public RepayInfo setOverPeriodCount(Long overPeriodCount) {
        this.overPeriodCount = overPeriodCount;
        return this;
    }
    public Long getOverPeriodCount() {
        return this.overPeriodCount;
    }

    public RepayInfo setOverPrincipal(Long overPrincipal) {
        this.overPrincipal = overPrincipal;
        return this;
    }
    public Long getOverPrincipal() {
        return this.overPrincipal;
    }

    public RepayInfo setOverInterest(Long overInterest) {
        this.overInterest = overInterest;
        return this;
    }
    public Long getOverInterest() {
        return this.overInterest;
    }

    public RepayInfo setOverPunish(Long overPunish) {
        this.overPunish = overPunish;
        return this;
    }
    public Long getOverPunish() {
        return this.overPunish;
    }

    public RepayInfo setNeedOverdueAmount(Long needOverdueAmount) {
        this.needOverdueAmount = needOverdueAmount;
        return this;
    }
    public Long getNeedOverdueAmount() {
        return this.needOverdueAmount;
    }

    public RepayInfo setCurrentNeedAmount(Long currentNeedAmount) {
        this.currentNeedAmount = currentNeedAmount;
        return this;
    }
    public Long getCurrentNeedAmount() {
        return this.currentNeedAmount;
    }

    public RepayInfo setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

}
