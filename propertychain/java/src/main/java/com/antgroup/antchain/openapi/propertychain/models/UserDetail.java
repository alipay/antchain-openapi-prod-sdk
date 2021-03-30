// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UserDetail extends TeaModel {
    // 融资编号
    @NameInMap("financing_no")
    @Validation(required = true)
    public String financingNo;

    // 分润金额，乘过分润比例，到记账日的累计值
    @NameInMap("divided_amount")
    @Validation(required = true)
    public Long dividedAmount;

    // 分润比例，保留两位小数
    @NameInMap("divided_rate")
    @Validation(required = true)
    public String dividedRate;

    // 罚息金额
    @NameInMap("penalty_amount")
    @Validation(required = true)
    public Long penaltyAmount;

    // 角色编码
    @NameInMap("role_code")
    @Validation(required = true)
    public String roleCode;

    // 记账日期 yyyy-mm-dd
    @NameInMap("account_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountDate;

    // 当日还款金额
    @NameInMap("payment")
    @Validation(required = true)
    public Long payment;

    // 其他利润(操作费还款日时写到各方记录)
    @NameInMap("other_profit")
    @Validation(required = true)
    public Long otherProfit;

    public static UserDetail build(java.util.Map<String, ?> map) throws Exception {
        UserDetail self = new UserDetail();
        return TeaModel.build(map, self);
    }

    public UserDetail setFinancingNo(String financingNo) {
        this.financingNo = financingNo;
        return this;
    }
    public String getFinancingNo() {
        return this.financingNo;
    }

    public UserDetail setDividedAmount(Long dividedAmount) {
        this.dividedAmount = dividedAmount;
        return this;
    }
    public Long getDividedAmount() {
        return this.dividedAmount;
    }

    public UserDetail setDividedRate(String dividedRate) {
        this.dividedRate = dividedRate;
        return this;
    }
    public String getDividedRate() {
        return this.dividedRate;
    }

    public UserDetail setPenaltyAmount(Long penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
        return this;
    }
    public Long getPenaltyAmount() {
        return this.penaltyAmount;
    }

    public UserDetail setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public UserDetail setAccountDate(String accountDate) {
        this.accountDate = accountDate;
        return this;
    }
    public String getAccountDate() {
        return this.accountDate;
    }

    public UserDetail setPayment(Long payment) {
        this.payment = payment;
        return this;
    }
    public Long getPayment() {
        return this.payment;
    }

    public UserDetail setOtherProfit(Long otherProfit) {
        this.otherProfit = otherProfit;
        return this;
    }
    public Long getOtherProfit() {
        return this.otherProfit;
    }

}
