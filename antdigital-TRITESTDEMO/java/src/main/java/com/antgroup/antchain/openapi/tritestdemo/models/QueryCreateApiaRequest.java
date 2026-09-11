// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class QueryCreateApiaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 描述
    @NameInMap("aaa")
    public String aaa;

    public static QueryCreateApiaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreateApiaRequest self = new QueryCreateApiaRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreateApiaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreateApiaRequest setAaa(String aaa) {
        this.aaa = aaa;
        return this;
    }
    public String getAaa() {
        return this.aaa;
    }

}
