// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RebootDatabaseRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static RebootDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootDatabaseRequest self = new RebootDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public RebootDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RebootDatabaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
