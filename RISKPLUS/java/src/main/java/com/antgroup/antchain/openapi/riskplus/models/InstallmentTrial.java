// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class InstallmentTrial extends TeaModel {
    // 总期数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("total_period")
    @Validation(required = true)
    public String totalPeriod;

    // 分期应还总金额
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 总利息（分期产生的利息/手续费）
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("total_fee")
    @Validation(required = true)
    public Long totalFee;

    // 期费率，精确到小数点后四位0.1250，表示年利率为12.5%
    /**
     * <strong>example:</strong>
     * <p>0.1250</p>
     */
    @NameInMap("fee_rate")
    @Validation(required = true)
    public Long feeRate;

    // 年利率，精确到小数点后四位0.1250，表示年利率为12.5%
    /**
     * <strong>example:</strong>
     * <p>0.1250</p>
     */
    @NameInMap("year_rate")
    @Validation(required = true)
    public Long yearRate;

    // 月供列表
    @NameInMap("term_detail_list")
    @Validation(required = true)
    public java.util.List<TermDetail> termDetailList;

    // 是否最优标识
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("optimal")
    public Boolean optimal;

    // 总罚息
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("total_penalty")
    public Long totalPenalty;

    // 总担保费
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("total_guarantee_fee")
    public Long totalGuaranteeFee;

    // 总违约金
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("total_liquidated_damages")
    public Long totalLiquidatedDamages;

    // 总服务费
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("total_server_fee")
    public Long totalServerFee;

    // 费率折扣，0.95：九五折；0：免息；1/null：不打折
    /**
     * <strong>example:</strong>
     * <p>0.95</p>
     */
    @NameInMap("discount")
    public Long discount;

    // 总减免金额
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("total_deduct_amount")
    public Long totalDeductAmount;

    public static InstallmentTrial build(java.util.Map<String, ?> map) throws Exception {
        InstallmentTrial self = new InstallmentTrial();
        return TeaModel.build(map, self);
    }

    public InstallmentTrial setTotalPeriod(String totalPeriod) {
        this.totalPeriod = totalPeriod;
        return this;
    }
    public String getTotalPeriod() {
        return this.totalPeriod;
    }

    public InstallmentTrial setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public InstallmentTrial setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
        return this;
    }
    public Long getTotalFee() {
        return this.totalFee;
    }

    public InstallmentTrial setFeeRate(Long feeRate) {
        this.feeRate = feeRate;
        return this;
    }
    public Long getFeeRate() {
        return this.feeRate;
    }

    public InstallmentTrial setYearRate(Long yearRate) {
        this.yearRate = yearRate;
        return this;
    }
    public Long getYearRate() {
        return this.yearRate;
    }

    public InstallmentTrial setTermDetailList(java.util.List<TermDetail> termDetailList) {
        this.termDetailList = termDetailList;
        return this;
    }
    public java.util.List<TermDetail> getTermDetailList() {
        return this.termDetailList;
    }

    public InstallmentTrial setOptimal(Boolean optimal) {
        this.optimal = optimal;
        return this;
    }
    public Boolean getOptimal() {
        return this.optimal;
    }

    public InstallmentTrial setTotalPenalty(Long totalPenalty) {
        this.totalPenalty = totalPenalty;
        return this;
    }
    public Long getTotalPenalty() {
        return this.totalPenalty;
    }

    public InstallmentTrial setTotalGuaranteeFee(Long totalGuaranteeFee) {
        this.totalGuaranteeFee = totalGuaranteeFee;
        return this;
    }
    public Long getTotalGuaranteeFee() {
        return this.totalGuaranteeFee;
    }

    public InstallmentTrial setTotalLiquidatedDamages(Long totalLiquidatedDamages) {
        this.totalLiquidatedDamages = totalLiquidatedDamages;
        return this;
    }
    public Long getTotalLiquidatedDamages() {
        return this.totalLiquidatedDamages;
    }

    public InstallmentTrial setTotalServerFee(Long totalServerFee) {
        this.totalServerFee = totalServerFee;
        return this;
    }
    public Long getTotalServerFee() {
        return this.totalServerFee;
    }

    public InstallmentTrial setDiscount(Long discount) {
        this.discount = discount;
        return this;
    }
    public Long getDiscount() {
        return this.discount;
    }

    public InstallmentTrial setTotalDeductAmount(Long totalDeductAmount) {
        this.totalDeductAmount = totalDeductAmount;
        return this;
    }
    public Long getTotalDeductAmount() {
        return this.totalDeductAmount;
    }

}
