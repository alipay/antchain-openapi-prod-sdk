// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SetDatabaseAccountpasswordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // password
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static SetDatabaseAccountpasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDatabaseAccountpasswordRequest self = new SetDatabaseAccountpasswordRequest();
        return TeaModel.build(map, self);
    }

    public SetDatabaseAccountpasswordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetDatabaseAccountpasswordRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetDatabaseAccountpasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
