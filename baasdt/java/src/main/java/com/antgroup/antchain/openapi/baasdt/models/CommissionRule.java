// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CommissionRule extends TeaModel {
    // 一级分账方的账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 手续费规则
    @NameInMap("commission_period")
    @Validation(required = true)
    public CommissionPeriod commissionPeriod;

    public static CommissionRule build(java.util.Map<String, ?> map) throws Exception {
        CommissionRule self = new CommissionRule();
        return TeaModel.build(map, self);
    }

    public CommissionRule setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CommissionRule setCommissionPeriod(CommissionPeriod commissionPeriod) {
        this.commissionPeriod = commissionPeriod;
        return this;
    }
    public CommissionPeriod getCommissionPeriod() {
        return this.commissionPeriod;
    }

}
