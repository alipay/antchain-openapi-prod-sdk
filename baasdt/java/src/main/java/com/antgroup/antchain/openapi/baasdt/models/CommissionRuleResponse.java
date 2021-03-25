// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CommissionRuleResponse extends TeaModel {
    // 手续费到账方
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 手续费周期列表
    @NameInMap("commission_periods")
    @Validation(required = true)
    public java.util.List<CommissionPeriod> commissionPeriods;

    public static CommissionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CommissionRuleResponse self = new CommissionRuleResponse();
        return TeaModel.build(map, self);
    }

    public CommissionRuleResponse setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CommissionRuleResponse setCommissionPeriods(java.util.List<CommissionPeriod> commissionPeriods) {
        this.commissionPeriods = commissionPeriods;
        return this;
    }
    public java.util.List<CommissionPeriod> getCommissionPeriods() {
        return this.commissionPeriods;
    }

}
