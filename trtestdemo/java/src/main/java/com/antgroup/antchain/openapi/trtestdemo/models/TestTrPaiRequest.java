// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trtestdemo.models;

import com.aliyun.tea.*;

public class TestTrPaiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static TestTrPaiRequest build(java.util.Map<String, ?> map) throws Exception {
        TestTrPaiRequest self = new TestTrPaiRequest();
        return TeaModel.build(map, self);
    }

    public TestTrPaiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
