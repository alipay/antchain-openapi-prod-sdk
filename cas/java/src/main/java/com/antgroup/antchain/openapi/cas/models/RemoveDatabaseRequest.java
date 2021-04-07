// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RemoveDatabaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // database ids
    @NameInMap("database_sequences")
    @Validation(required = true)
    public java.util.List<String> databaseSequences;

    public static RemoveDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDatabaseRequest self = new RemoveDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveDatabaseRequest setDatabaseSequences(java.util.List<String> databaseSequences) {
        this.databaseSequences = databaseSequences;
        return this;
    }
    public java.util.List<String> getDatabaseSequences() {
        return this.databaseSequences;
    }

}
