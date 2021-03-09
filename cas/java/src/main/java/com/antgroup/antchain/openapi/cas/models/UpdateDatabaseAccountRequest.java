// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateDatabaseAccountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // description
    @NameInMap("description")
    public String description;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static UpdateDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatabaseAccountRequest self = new UpdateDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatabaseAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDatabaseAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatabaseAccountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
