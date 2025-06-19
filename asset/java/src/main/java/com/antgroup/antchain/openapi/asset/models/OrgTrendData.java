// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class OrgTrendData extends TeaModel {
    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 还款金额
    @NameInMap("repayment_amt")
    @Validation(required = true)
    public String repaymentAmt;

    // 预算金额
    @NameInMap("budget_amt")
    @Validation(required = true)
    public String budgetAmt;

    // 交易金额
    @NameInMap("trade_amt")
    @Validation(required = true)
    public String tradeAmt;

    public static OrgTrendData build(java.util.Map<String, ?> map) throws Exception {
        OrgTrendData self = new OrgTrendData();
        return TeaModel.build(map, self);
    }

    public OrgTrendData setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public OrgTrendData setRepaymentAmt(String repaymentAmt) {
        this.repaymentAmt = repaymentAmt;
        return this;
    }
    public String getRepaymentAmt() {
        return this.repaymentAmt;
    }

    public OrgTrendData setBudgetAmt(String budgetAmt) {
        this.budgetAmt = budgetAmt;
        return this;
    }
    public String getBudgetAmt() {
        return this.budgetAmt;
    }

    public OrgTrendData setTradeAmt(String tradeAmt) {
        this.tradeAmt = tradeAmt;
        return this;
    }
    public String getTradeAmt() {
        return this.tradeAmt;
    }

}
