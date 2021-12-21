// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class AccountData extends TeaModel {
    // 账号id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 账号名称
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 账号平台（支付宝，淘宝，微信，抖音等）
    @NameInMap("account_platform")
    @Validation(required = true)
    public String accountPlatform;

    public static AccountData build(java.util.Map<String, ?> map) throws Exception {
        AccountData self = new AccountData();
        return TeaModel.build(map, self);
    }

    public AccountData setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AccountData setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AccountData setAccountPlatform(String accountPlatform) {
        this.accountPlatform = accountPlatform;
        return this;
    }
    public String getAccountPlatform() {
        return this.accountPlatform;
    }

}
