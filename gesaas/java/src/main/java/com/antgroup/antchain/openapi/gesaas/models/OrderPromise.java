// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OrderPromise extends TeaModel {
    // 宽限期/天
    // 不传默认为0
    /**
     * <strong>example:</strong>
     * <p>1233</p>
     */
    @NameInMap("grace_period_days")
    public Long gracePeriodDays;

    // 罚息类型
    //  NONE : 没有罚息  PENALTY_FEE： 罚息（暂不支持）
    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("punishment_type")
    @Validation(required = true)
    public String punishmentType;

    // 租期
    // 租期最小值为1
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("pay_period")
    @Validation(required = true)
    public Long payPeriod;

    // 租赁公司支付宝UID
    /**
     * <strong>example:</strong>
     * <p>2088Id</p>
     */
    @NameInMap("lease_alipay_uid")
    @Validation(required = true)
    public String leaseAlipayUid;

    // 还款策略 
    // repayStrategyList长度 == payPeriod
    @NameInMap("repay_strategy_list")
    @Validation(required = true)
    public java.util.List<RepayStrategy> repayStrategyList;

    public static OrderPromise build(java.util.Map<String, ?> map) throws Exception {
        OrderPromise self = new OrderPromise();
        return TeaModel.build(map, self);
    }

    public OrderPromise setGracePeriodDays(Long gracePeriodDays) {
        this.gracePeriodDays = gracePeriodDays;
        return this;
    }
    public Long getGracePeriodDays() {
        return this.gracePeriodDays;
    }

    public OrderPromise setPunishmentType(String punishmentType) {
        this.punishmentType = punishmentType;
        return this;
    }
    public String getPunishmentType() {
        return this.punishmentType;
    }

    public OrderPromise setPayPeriod(Long payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }
    public Long getPayPeriod() {
        return this.payPeriod;
    }

    public OrderPromise setLeaseAlipayUid(String leaseAlipayUid) {
        this.leaseAlipayUid = leaseAlipayUid;
        return this;
    }
    public String getLeaseAlipayUid() {
        return this.leaseAlipayUid;
    }

    public OrderPromise setRepayStrategyList(java.util.List<RepayStrategy> repayStrategyList) {
        this.repayStrategyList = repayStrategyList;
        return this;
    }
    public java.util.List<RepayStrategy> getRepayStrategyList() {
        return this.repayStrategyList;
    }

}
