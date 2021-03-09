// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DbSchemaGrant extends TeaModel {
    // privilege
    @NameInMap("privilege")
    @Validation(required = true)
    public String privilege;

    // account
    @NameInMap("account")
    public DatabaseAccount account;

    public static DbSchemaGrant build(java.util.Map<String, ?> map) throws Exception {
        DbSchemaGrant self = new DbSchemaGrant();
        return TeaModel.build(map, self);
    }

    public DbSchemaGrant setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

    public DbSchemaGrant setAccount(DatabaseAccount account) {
        this.account = account;
        return this;
    }
    public DatabaseAccount getAccount() {
        return this.account;
    }

}
