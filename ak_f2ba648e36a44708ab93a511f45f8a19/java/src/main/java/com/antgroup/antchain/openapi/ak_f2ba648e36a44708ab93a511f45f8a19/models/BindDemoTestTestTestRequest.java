// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f2ba648e36a44708ab93a511f45f8a19.models;

import com.aliyun.tea.*;

public class BindDemoTestTestTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("test")
    @Validation(required = true)
    public String test;

    public static BindDemoTestTestTestRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoTestTestTestRequest self = new BindDemoTestTestTestRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoTestTestTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoTestTestTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindDemoTestTestTestRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
