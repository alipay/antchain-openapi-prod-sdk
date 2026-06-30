// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayInfos extends TeaModel {
    // 期次
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 实还总额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 实还本金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("principal")
    @Validation(required = true)
    public Long principal;

    // 实还利息
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("interest")
    @Validation(required = true)
    public Long interest;

    // 实还通道手续费
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("channel_amt")
    @Validation(required = true)
    public Long channelAmt;

    // 实还手续费
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("fee")
    @Validation(required = true)
    public Long fee;

    // 实收罚息
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("punish")
    @Validation(required = true)
    public Long punish;

    // 担保费
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("guarantee_fee")
    @Validation(required = true)
    public Long guaranteeFee;

    // 违约金
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("liquidated_damages")
    @Validation(required = true)
    public Long liquidatedDamages;

    public static RepayInfos build(java.util.Map<String, ?> map) throws Exception {
        RepayInfos self = new RepayInfos();
        return TeaModel.build(map, self);
    }

    public RepayInfos setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public RepayInfos setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RepayInfos setPrincipal(Long principal) {
        this.principal = principal;
        return this;
    }
    public Long getPrincipal() {
        return this.principal;
    }

    public RepayInfos setInterest(Long interest) {
        this.interest = interest;
        return this;
    }
    public Long getInterest() {
        return this.interest;
    }

    public RepayInfos setChannelAmt(Long channelAmt) {
        this.channelAmt = channelAmt;
        return this;
    }
    public Long getChannelAmt() {
        return this.channelAmt;
    }

    public RepayInfos setFee(Long fee) {
        this.fee = fee;
        return this;
    }
    public Long getFee() {
        return this.fee;
    }

    public RepayInfos setPunish(Long punish) {
        this.punish = punish;
        return this;
    }
    public Long getPunish() {
        return this.punish;
    }

    public RepayInfos setGuaranteeFee(Long guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
        return this;
    }
    public Long getGuaranteeFee() {
        return this.guaranteeFee;
    }

    public RepayInfos setLiquidatedDamages(Long liquidatedDamages) {
        this.liquidatedDamages = liquidatedDamages;
        return this;
    }
    public Long getLiquidatedDamages() {
        return this.liquidatedDamages;
    }

}
