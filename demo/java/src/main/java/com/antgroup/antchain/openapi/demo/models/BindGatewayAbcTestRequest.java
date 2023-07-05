// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class BindGatewayAbcTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("test_param")
    @Validation(required = true)
    public java.util.List<DemoClass> testParam;

    public static BindGatewayAbcTestRequest build(java.util.Map<String, ?> map) throws Exception {
        BindGatewayAbcTestRequest self = new BindGatewayAbcTestRequest();
        return TeaModel.build(map, self);
    }

    public BindGatewayAbcTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindGatewayAbcTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindGatewayAbcTestRequest setTestParam(java.util.List<DemoClass> testParam) {
        this.testParam = testParam;
        return this;
    }
    public java.util.List<DemoClass> getTestParam() {
        return this.testParam;
    }

}
