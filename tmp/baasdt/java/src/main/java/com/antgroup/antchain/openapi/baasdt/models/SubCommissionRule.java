// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SubCommissionRule extends TeaModel {
    // deduct_token
    @NameInMap("deduct_token")
    @Validation(required = true)
    public String deductToken;

    // deduct_ratio
    @NameInMap("deduct_ratio")
    @Validation(required = true)
    public String deductRatio;

    // account_id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static SubCommissionRule build(java.util.Map<String, ?> map) throws Exception {
        SubCommissionRule self = new SubCommissionRule();
        return TeaModel.build(map, self);
    }

    public SubCommissionRule setDeductToken(String deductToken) {
        this.deductToken = deductToken;
        return this;
    }
    public String getDeductToken() {
        return this.deductToken;
    }

    public SubCommissionRule setDeductRatio(String deductRatio) {
        this.deductRatio = deductRatio;
        return this;
    }
    public String getDeductRatio() {
        return this.deductRatio;
    }

    public SubCommissionRule setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
