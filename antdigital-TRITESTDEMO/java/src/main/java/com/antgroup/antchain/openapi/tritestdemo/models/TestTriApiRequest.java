// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class TestTriApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    public static TestTriApiRequest build(java.util.Map<String, ?> map) throws Exception {
        TestTriApiRequest self = new TestTriApiRequest();
        return TeaModel.build(map, self);
    }

    public TestTriApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TestTriApiRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
