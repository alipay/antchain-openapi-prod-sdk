// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class BenchCreateTestForRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 3000
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static BenchCreateTestForRequest build(java.util.Map<String, ?> map) throws Exception {
        BenchCreateTestForRequest self = new BenchCreateTestForRequest();
        return TeaModel.build(map, self);
    }

    public BenchCreateTestForRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BenchCreateTestForRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
