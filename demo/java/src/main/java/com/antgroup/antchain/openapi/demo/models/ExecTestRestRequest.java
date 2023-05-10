// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ExecTestRestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 111
    @NameInMap("param1")
    @Validation(required = true)
    public String param1;

    public static ExecTestRestRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecTestRestRequest self = new ExecTestRestRequest();
        return TeaModel.build(map, self);
    }

    public ExecTestRestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecTestRestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecTestRestRequest setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

}
