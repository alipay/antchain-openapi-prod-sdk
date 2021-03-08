// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetAccessorCurrentRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static GetAccessorCurrentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessorCurrentRequest self = new GetAccessorCurrentRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessorCurrentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
