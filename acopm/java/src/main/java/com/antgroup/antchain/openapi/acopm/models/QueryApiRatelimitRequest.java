// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryApiRatelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // api名
    @NameInMap("api_name_list")
    @Validation(required = true)
    public java.util.List<String> apiNameList;

    public static QueryApiRatelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiRatelimitRequest self = new QueryApiRatelimitRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiRatelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiRatelimitRequest setApiNameList(java.util.List<String> apiNameList) {
        this.apiNameList = apiNameList;
        return this;
    }
    public java.util.List<String> getApiNameList() {
        return this.apiNameList;
    }

}
