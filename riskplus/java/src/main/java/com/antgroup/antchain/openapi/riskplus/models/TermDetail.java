// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class TermDetail extends TeaModel {
    // 期数
    @NameInMap("term")
    @Validation(required = true)
    public String term;

    // 期供金额
    @NameInMap("term_amount")
    @Validation(required = true)
    public Long termAmount;

    // 当期本金
    @NameInMap("term_principal")
    @Validation(required = true)
    public Long termPrincipal;

    // 当期利息（分期产生的利息/手续费）
    @NameInMap("term_fee")
    @Validation(required = true)
    public Long termFee;

    // 应还款日期
    @NameInMap("settle_date")
    @Validation(required = true)
    public String settleDate;

    // 罚息
    @NameInMap("penalty")
    public Long penalty;

    // 担保费
    @NameInMap("guarantee_fee")
    public Long guaranteeFee;

    // 违约金
    @NameInMap("liquidated_damages")
    public Long liquidatedDamages;

    // 服务费
    @NameInMap("server_fee")
    public Long serverFee;

    // 减免金额
    @NameInMap("deduct_amount")
    public Long deductAmount;

    public static TermDetail build(java.util.Map<String, ?> map) throws Exception {
        TermDetail self = new TermDetail();
        return TeaModel.build(map, self);
    }

    public TermDetail setTerm(String term) {
        this.term = term;
        return this;
    }
    public String getTerm() {
        return this.term;
    }

    public TermDetail setTermAmount(Long termAmount) {
        this.termAmount = termAmount;
        return this;
    }
    public Long getTermAmount() {
        return this.termAmount;
    }

    public TermDetail setTermPrincipal(Long termPrincipal) {
        this.termPrincipal = termPrincipal;
        return this;
    }
    public Long getTermPrincipal() {
        return this.termPrincipal;
    }

    public TermDetail setTermFee(Long termFee) {
        this.termFee = termFee;
        return this;
    }
    public Long getTermFee() {
        return this.termFee;
    }

    public TermDetail setSettleDate(String settleDate) {
        this.settleDate = settleDate;
        return this;
    }
    public String getSettleDate() {
        return this.settleDate;
    }

    public TermDetail setPenalty(Long penalty) {
        this.penalty = penalty;
        return this;
    }
    public Long getPenalty() {
        return this.penalty;
    }

    public TermDetail setGuaranteeFee(Long guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
        return this;
    }
    public Long getGuaranteeFee() {
        return this.guaranteeFee;
    }

    public TermDetail setLiquidatedDamages(Long liquidatedDamages) {
        this.liquidatedDamages = liquidatedDamages;
        return this;
    }
    public Long getLiquidatedDamages() {
        return this.liquidatedDamages;
    }

    public TermDetail setServerFee(Long serverFee) {
        this.serverFee = serverFee;
        return this;
    }
    public Long getServerFee() {
        return this.serverFee;
    }

    public TermDetail setDeductAmount(Long deductAmount) {
        this.deductAmount = deductAmount;
        return this;
    }
    public Long getDeductAmount() {
        return this.deductAmount;
    }

}
