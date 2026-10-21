// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class OneCreateTestForBenchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static OneCreateTestForBenchRequest build(java.util.Map<String, ?> map) throws Exception {
        OneCreateTestForBenchRequest self = new OneCreateTestForBenchRequest();
        return TeaModel.build(map, self);
    }

    public OneCreateTestForBenchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
