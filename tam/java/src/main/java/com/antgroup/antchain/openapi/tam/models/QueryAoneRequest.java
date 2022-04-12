// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class QueryAoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 项目id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static QueryAoneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAoneRequest self = new QueryAoneRequest();
        return TeaModel.build(map, self);
    }

    public QueryAoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAoneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
