// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class ApiJzqCliCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static ApiJzqCliCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiJzqCliCreateRequest self = new ApiJzqCliCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApiJzqCliCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApiJzqCliCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApiJzqCliCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
