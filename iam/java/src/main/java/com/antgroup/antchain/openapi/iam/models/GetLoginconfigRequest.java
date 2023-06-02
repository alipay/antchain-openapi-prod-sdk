// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetLoginconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetLoginconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginconfigRequest self = new GetLoginconfigRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
