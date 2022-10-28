// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ServiceProvider extends TeaModel {
    // 账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 商家名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ServiceProvider build(java.util.Map<String, ?> map) throws Exception {
        ServiceProvider self = new ServiceProvider();
        return TeaModel.build(map, self);
    }

    public ServiceProvider setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ServiceProvider setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
