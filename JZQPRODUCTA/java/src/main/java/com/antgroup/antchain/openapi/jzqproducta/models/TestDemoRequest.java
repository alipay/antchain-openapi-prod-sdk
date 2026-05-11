// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproducta.models;

import com.aliyun.tea.*;

public class TestDemoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1
    @NameInMap("demo")
    @Validation(required = true)
    public String demo;

    public static TestDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        TestDemoRequest self = new TestDemoRequest();
        return TeaModel.build(map, self);
    }

    public TestDemoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TestDemoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TestDemoRequest setDemo(String demo) {
        this.demo = demo;
        return this;
    }
    public String getDemo() {
        return this.demo;
    }

}
