// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerSecuritygroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static QueryComputerSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerSecuritygroupRequest self = new QueryComputerSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryComputerSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComputerSecuritygroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
