// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteDatabaseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // database 序列号
    @NameInMap("database_sequences")
    @Validation(required = true)
    public java.util.List<String> databaseSequences;

    public static DeleteDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseRequest self = new DeleteDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDatabaseRequest setDatabaseSequences(java.util.List<String> databaseSequences) {
        this.databaseSequences = databaseSequences;
        return this;
    }
    public java.util.List<String> getDatabaseSequences() {
        return this.databaseSequences;
    }

}
