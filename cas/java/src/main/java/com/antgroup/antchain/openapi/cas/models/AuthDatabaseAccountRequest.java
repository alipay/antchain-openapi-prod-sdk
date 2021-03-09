// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AuthDatabaseAccountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // schema_id
    @NameInMap("schema_id")
    @Validation(required = true)
    public String schemaId;

    // privilege
    @NameInMap("privilege")
    @Validation(required = true)
    public String privilege;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static AuthDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthDatabaseAccountRequest self = new AuthDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public AuthDatabaseAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthDatabaseAccountRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public AuthDatabaseAccountRequest setPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }
    public String getPrivilege() {
        return this.privilege;
    }

    public AuthDatabaseAccountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
