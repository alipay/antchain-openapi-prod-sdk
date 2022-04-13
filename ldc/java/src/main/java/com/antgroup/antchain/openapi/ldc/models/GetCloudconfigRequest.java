// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetCloudconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static GetCloudconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudconfigRequest self = new GetCloudconfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
