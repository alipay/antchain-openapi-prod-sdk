// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class OperateDemoShanghaiPreTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参数1
    @NameInMap("param1")
    @Validation(required = true)
    public String param1;

    public static OperateDemoShanghaiPreTestRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateDemoShanghaiPreTestRequest self = new OperateDemoShanghaiPreTestRequest();
        return TeaModel.build(map, self);
    }

    public OperateDemoShanghaiPreTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateDemoShanghaiPreTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateDemoShanghaiPreTestRequest setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

}
