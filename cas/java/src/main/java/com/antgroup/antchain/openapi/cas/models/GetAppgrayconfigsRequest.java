// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppgrayconfigsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetAppgrayconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppgrayconfigsRequest self = new GetAppgrayconfigsRequest();
        return TeaModel.build(map, self);
    }

    public GetAppgrayconfigsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
