// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // database 序列号
    @NameInMap("database_sequence")
    @Validation(required = true)
    public String databaseSequence;

    // 账户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 账户密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static CreateDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccountRequest self = new CreateDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDatabaseAccountRequest setDatabaseSequence(String databaseSequence) {
        this.databaseSequence = databaseSequence;
        return this;
    }
    public String getDatabaseSequence() {
        return this.databaseSequence;
    }

    public CreateDatabaseAccountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDatabaseAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
