// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class MerchantBudget extends TeaModel {
    // 积分库代码
    @NameInMap("point_lib_code")
    @Validation(required = true)
    public String pointLibCode;

    // 预算库代码
    @NameInMap("budget_code")
    @Validation(required = true)
    public String budgetCode;

    // 预算库描述
    @NameInMap("budget_desc")
    @Validation(required = true)
    public String budgetDesc;

    // 预算库启用时间
    @NameInMap("budget_start_time")
    @Validation(required = true)
    public String budgetStartTime;

    // 预算库截止时间
    @NameInMap("budget_end_time")
    @Validation(required = true)
    public String budgetEndTime;

    public static MerchantBudget build(java.util.Map<String, ?> map) throws Exception {
        MerchantBudget self = new MerchantBudget();
        return TeaModel.build(map, self);
    }

    public MerchantBudget setPointLibCode(String pointLibCode) {
        this.pointLibCode = pointLibCode;
        return this;
    }
    public String getPointLibCode() {
        return this.pointLibCode;
    }

    public MerchantBudget setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
        return this;
    }
    public String getBudgetCode() {
        return this.budgetCode;
    }

    public MerchantBudget setBudgetDesc(String budgetDesc) {
        this.budgetDesc = budgetDesc;
        return this;
    }
    public String getBudgetDesc() {
        return this.budgetDesc;
    }

    public MerchantBudget setBudgetStartTime(String budgetStartTime) {
        this.budgetStartTime = budgetStartTime;
        return this;
    }
    public String getBudgetStartTime() {
        return this.budgetStartTime;
    }

    public MerchantBudget setBudgetEndTime(String budgetEndTime) {
        this.budgetEndTime = budgetEndTime;
        return this;
    }
    public String getBudgetEndTime() {
        return this.budgetEndTime;
    }

}
