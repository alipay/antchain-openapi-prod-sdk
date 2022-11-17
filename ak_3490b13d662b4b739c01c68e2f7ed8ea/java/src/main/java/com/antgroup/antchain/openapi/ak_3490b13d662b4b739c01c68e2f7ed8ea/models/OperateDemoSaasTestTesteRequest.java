// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_3490b13d662b4b739c01c68e2f7ed8ea.models;

import com.aliyun.tea.*;

public class OperateDemoSaasTestTesteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("age")
    @Validation(required = true)
    public String age;

    public static OperateDemoSaasTestTesteRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDemoSaasTestTesteRequest self = new OperateDemoSaasTestTesteRequest();
        return TeaModel.build(map, self);
    }

    public OperateDemoSaasTestTesteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateDemoSaasTestTesteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateDemoSaasTestTesteRequest setAge(String age) {
        this.age = age;
        return this;
    }
    public String getAge() {
        return this.age;
    }

}
