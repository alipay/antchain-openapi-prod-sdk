// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AccountWholesaleParam extends TeaModel {
    // 批发数量
    @NameInMap("ep_amount")
    @Validation(required = true)
    public Long epAmount;

    // 用户账户
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    public static AccountWholesaleParam build(java.util.Map<String, ?> map) throws Exception {
        AccountWholesaleParam self = new AccountWholesaleParam();
        return TeaModel.build(map, self);
    }

    public AccountWholesaleParam setEpAmount(Long epAmount) {
        this.epAmount = epAmount;
        return this;
    }
    public Long getEpAmount() {
        return this.epAmount;
    }

    public AccountWholesaleParam setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
