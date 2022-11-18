// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5ea45460b65f4d169144dc74e621ec27.models;

import com.aliyun.tea.*;

public class SendDemoSaasTestTestkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("age")
    @Validation(required = true)
    public String age;

    public static SendDemoSaasTestTestkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDemoSaasTestTestkRequest self = new SendDemoSaasTestTestkRequest();
        return TeaModel.build(map, self);
    }

    public SendDemoSaasTestTestkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendDemoSaasTestTestkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendDemoSaasTestTestkRequest setAge(String age) {
        this.age = age;
        return this;
    }
    public String getAge() {
        return this.age;
    }

}
