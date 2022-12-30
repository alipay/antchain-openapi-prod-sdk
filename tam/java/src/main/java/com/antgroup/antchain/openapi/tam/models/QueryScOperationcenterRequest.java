// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryScOperationcenterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static QueryScOperationcenterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScOperationcenterRequest self = new QueryScOperationcenterRequest();
        return TeaModel.build(map, self);
    }

    public QueryScOperationcenterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryScOperationcenterRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
