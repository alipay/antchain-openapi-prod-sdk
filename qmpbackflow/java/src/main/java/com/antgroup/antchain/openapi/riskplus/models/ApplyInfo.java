// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyInfo extends TeaModel {
    // 授信编号
    @NameInMap("apply_no")
    public String applyNo;

    // 资金方编号
    @NameInMap("fund_code")
    public String fundCode;

    // 资金方名称
    @NameInMap("fund_name")
    public String fundName;

    // 贷款利率
    @NameInMap("rate_value")
    public Long rateValue;

    // 贷款日利率
    @NameInMap("rate_value_day")
    public Long rateValueDay;

    // 年天数
    @NameInMap("days_num_year")
    public Long daysNumYear;

    // 总授信额度
    @NameInMap("total_amount")
    public Long totalAmount;

    // 可用额度
    @NameInMap("balance_amount")
    public Long balanceAmount;

    public static ApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        ApplyInfo self = new ApplyInfo();
        return TeaModel.build(map, self);
    }

    public ApplyInfo setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public ApplyInfo setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public ApplyInfo setFundName(String fundName) {
        this.fundName = fundName;
        return this;
    }
    public String getFundName() {
        return this.fundName;
    }

    public ApplyInfo setRateValue(Long rateValue) {
        this.rateValue = rateValue;
        return this;
    }
    public Long getRateValue() {
        return this.rateValue;
    }

    public ApplyInfo setRateValueDay(Long rateValueDay) {
        this.rateValueDay = rateValueDay;
        return this;
    }
    public Long getRateValueDay() {
        return this.rateValueDay;
    }

    public ApplyInfo setDaysNumYear(Long daysNumYear) {
        this.daysNumYear = daysNumYear;
        return this;
    }
    public Long getDaysNumYear() {
        return this.daysNumYear;
    }

    public ApplyInfo setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public ApplyInfo setBalanceAmount(Long balanceAmount) {
        this.balanceAmount = balanceAmount;
        return this;
    }
    public Long getBalanceAmount() {
        return this.balanceAmount;
    }

}
