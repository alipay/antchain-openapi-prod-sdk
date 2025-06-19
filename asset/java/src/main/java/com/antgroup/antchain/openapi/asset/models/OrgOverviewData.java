// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class OrgOverviewData extends TeaModel {
    // 预算总金额
    @NameInMap("total_budget_amt")
    @Validation(required = true)
    public String totalBudgetAmt;

    // 花呗预算金额
    @NameInMap("huabei_budget_amt")
    @Validation(required = true)
    public String huabeiBudgetAmt;

    // 借呗预算金额
    @NameInMap("jiebei_budget_amt")
    @Validation(required = true)
    public String jiebeiBudgetAmt;

    // 小微预算金额
    @NameInMap("xiaowei_budget_amt")
    @Validation(required = true)
    public String xiaoweiBudgetAmt;

    // 服务费预算金额
    @NameInMap("service_budget_amt")
    @Validation(required = true)
    public String serviceBudgetAmt;

    // 总回款金额
    @NameInMap("total_repayment_amt")
    @Validation(required = true)
    public String totalRepaymentAmt;

    // 花呗回款金额
    @NameInMap("huabei_repayment_amt")
    @Validation(required = true)
    public String huabeiRepaymentAmt;

    // 借呗回款金额
    @NameInMap("jiebei_repayment_amt")
    @Validation(required = true)
    public String jiebeiRepaymentAmt;

    // 小微回款金额
    @NameInMap("xiaowei_repayment_amt")
    @Validation(required = true)
    public String xiaoweiRepaymentAmt;

    // 总交易金额
    @NameInMap("total_trade_amt")
    @Validation(required = true)
    public String totalTradeAmt;

    // 花呗交易金额
    @NameInMap("huabei_trade_amt")
    @Validation(required = true)
    public String huabeiTradeAmt;

    // 借呗交易金额
    @NameInMap("jiebei_trade_amt")
    @Validation(required = true)
    public String jiebeiTradeAmt;

    // 小微交易金额
    @NameInMap("xiaowei_trade_amt")
    @Validation(required = true)
    public String xiaoweiTradeAmt;

    // 内部补贴金额
    @NameInMap("internal_subsidy_amt")
    @Validation(required = true)
    public String internalSubsidyAmt;

    // 净回款额
    @NameInMap("total_net_repayment_amt")
    @Validation(required = true)
    public String totalNetRepaymentAmt;

    // 活动roi
    @NameInMap("activity_roi")
    @Validation(required = true)
    public String activityRoi;

    public static OrgOverviewData build(java.util.Map<String, ?> map) throws Exception {
        OrgOverviewData self = new OrgOverviewData();
        return TeaModel.build(map, self);
    }

    public OrgOverviewData setTotalBudgetAmt(String totalBudgetAmt) {
        this.totalBudgetAmt = totalBudgetAmt;
        return this;
    }
    public String getTotalBudgetAmt() {
        return this.totalBudgetAmt;
    }

    public OrgOverviewData setHuabeiBudgetAmt(String huabeiBudgetAmt) {
        this.huabeiBudgetAmt = huabeiBudgetAmt;
        return this;
    }
    public String getHuabeiBudgetAmt() {
        return this.huabeiBudgetAmt;
    }

    public OrgOverviewData setJiebeiBudgetAmt(String jiebeiBudgetAmt) {
        this.jiebeiBudgetAmt = jiebeiBudgetAmt;
        return this;
    }
    public String getJiebeiBudgetAmt() {
        return this.jiebeiBudgetAmt;
    }

    public OrgOverviewData setXiaoweiBudgetAmt(String xiaoweiBudgetAmt) {
        this.xiaoweiBudgetAmt = xiaoweiBudgetAmt;
        return this;
    }
    public String getXiaoweiBudgetAmt() {
        return this.xiaoweiBudgetAmt;
    }

    public OrgOverviewData setServiceBudgetAmt(String serviceBudgetAmt) {
        this.serviceBudgetAmt = serviceBudgetAmt;
        return this;
    }
    public String getServiceBudgetAmt() {
        return this.serviceBudgetAmt;
    }

    public OrgOverviewData setTotalRepaymentAmt(String totalRepaymentAmt) {
        this.totalRepaymentAmt = totalRepaymentAmt;
        return this;
    }
    public String getTotalRepaymentAmt() {
        return this.totalRepaymentAmt;
    }

    public OrgOverviewData setHuabeiRepaymentAmt(String huabeiRepaymentAmt) {
        this.huabeiRepaymentAmt = huabeiRepaymentAmt;
        return this;
    }
    public String getHuabeiRepaymentAmt() {
        return this.huabeiRepaymentAmt;
    }

    public OrgOverviewData setJiebeiRepaymentAmt(String jiebeiRepaymentAmt) {
        this.jiebeiRepaymentAmt = jiebeiRepaymentAmt;
        return this;
    }
    public String getJiebeiRepaymentAmt() {
        return this.jiebeiRepaymentAmt;
    }

    public OrgOverviewData setXiaoweiRepaymentAmt(String xiaoweiRepaymentAmt) {
        this.xiaoweiRepaymentAmt = xiaoweiRepaymentAmt;
        return this;
    }
    public String getXiaoweiRepaymentAmt() {
        return this.xiaoweiRepaymentAmt;
    }

    public OrgOverviewData setTotalTradeAmt(String totalTradeAmt) {
        this.totalTradeAmt = totalTradeAmt;
        return this;
    }
    public String getTotalTradeAmt() {
        return this.totalTradeAmt;
    }

    public OrgOverviewData setHuabeiTradeAmt(String huabeiTradeAmt) {
        this.huabeiTradeAmt = huabeiTradeAmt;
        return this;
    }
    public String getHuabeiTradeAmt() {
        return this.huabeiTradeAmt;
    }

    public OrgOverviewData setJiebeiTradeAmt(String jiebeiTradeAmt) {
        this.jiebeiTradeAmt = jiebeiTradeAmt;
        return this;
    }
    public String getJiebeiTradeAmt() {
        return this.jiebeiTradeAmt;
    }

    public OrgOverviewData setXiaoweiTradeAmt(String xiaoweiTradeAmt) {
        this.xiaoweiTradeAmt = xiaoweiTradeAmt;
        return this;
    }
    public String getXiaoweiTradeAmt() {
        return this.xiaoweiTradeAmt;
    }

    public OrgOverviewData setInternalSubsidyAmt(String internalSubsidyAmt) {
        this.internalSubsidyAmt = internalSubsidyAmt;
        return this;
    }
    public String getInternalSubsidyAmt() {
        return this.internalSubsidyAmt;
    }

    public OrgOverviewData setTotalNetRepaymentAmt(String totalNetRepaymentAmt) {
        this.totalNetRepaymentAmt = totalNetRepaymentAmt;
        return this;
    }
    public String getTotalNetRepaymentAmt() {
        return this.totalNetRepaymentAmt;
    }

    public OrgOverviewData setActivityRoi(String activityRoi) {
        this.activityRoi = activityRoi;
        return this;
    }
    public String getActivityRoi() {
        return this.activityRoi;
    }

}
