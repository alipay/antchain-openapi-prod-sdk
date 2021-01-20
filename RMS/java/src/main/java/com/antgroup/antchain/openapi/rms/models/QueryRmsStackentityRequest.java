// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsStackentityRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static QueryRmsStackentityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsStackentityRequest self = new QueryRmsStackentityRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsStackentityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
