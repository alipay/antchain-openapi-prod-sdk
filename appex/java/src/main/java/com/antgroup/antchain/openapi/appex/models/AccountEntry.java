// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class AccountEntry extends TeaModel {
    // mychain的账户名字
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // account_name的hash的hex string
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static AccountEntry build(java.util.Map<String, ?> map) throws Exception {
        AccountEntry self = new AccountEntry();
        return TeaModel.build(map, self);
    }

    public AccountEntry setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AccountEntry setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
