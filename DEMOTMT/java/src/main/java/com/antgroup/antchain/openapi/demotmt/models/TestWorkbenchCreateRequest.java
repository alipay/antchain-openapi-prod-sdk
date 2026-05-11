// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demotmt.models;

import com.aliyun.tea.*;

public class TestWorkbenchCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时
    @NameInMap("timeout")
    public String timeout;

    public static TestWorkbenchCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        TestWorkbenchCreateRequest self = new TestWorkbenchCreateRequest();
        return TeaModel.build(map, self);
    }

    public TestWorkbenchCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TestWorkbenchCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TestWorkbenchCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
