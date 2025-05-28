// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreateone.models;

import com.aliyun.tea.*;

public class OneTestCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 3000
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static OneTestCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OneTestCreateRequest self = new OneTestCreateRequest();
        return TeaModel.build(map, self);
    }

    public OneTestCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OneTestCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OneTestCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
