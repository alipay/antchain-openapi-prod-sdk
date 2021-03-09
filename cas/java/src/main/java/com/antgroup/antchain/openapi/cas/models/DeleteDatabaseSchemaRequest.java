// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteDatabaseSchemaRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 欲删除的的 schema id
    @NameInMap("schema_sequence")
    @Validation(required = true)
    public String schemaSequence;

    public static DeleteDatabaseSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseSchemaRequest self = new DeleteDatabaseSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseSchemaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDatabaseSchemaRequest setSchemaSequence(String schemaSequence) {
        this.schemaSequence = schemaSequence;
        return this;
    }
    public String getSchemaSequence() {
        return this.schemaSequence;
    }

}
