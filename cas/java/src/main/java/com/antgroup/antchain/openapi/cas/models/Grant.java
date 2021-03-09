// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Grant extends TeaModel {
    // account
    @NameInMap("account")
    @Validation(required = true)
    public DatabaseAccount account;

    // privilege
    @NameInMap("privilege")
    @Validation(required = true)
    public String privilege;

    // schema
    @NameInMap("schema")
    @Validation(required = true)
    public DbSchema schema;

    public static Grant build(java.util.Map<String, ?> map) throws Exception {
        Grant self = new Grant();
        return TeaModel.build(map, self);
    }

    public Grant setAccount(DatabaseAccount account) {
        this.account = account;
        return this;
    }
    public DatabaseAccount getAccount() {
        return this.account;
    }

    public Grant setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

    public Grant setSchema(DbSchema schema) {
        this.schema = schema;
        return this;
    }
    public DbSchema getSchema() {
        return this.schema;
    }

}
