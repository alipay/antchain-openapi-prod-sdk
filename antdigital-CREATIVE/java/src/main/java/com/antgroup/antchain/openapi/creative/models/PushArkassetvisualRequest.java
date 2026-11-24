// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class PushArkassetvisualRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("request_body")
    @Validation(required = true)
    public String requestBody;

    public static PushArkassetvisualRequest build(java.util.Map<String, ?> map) throws Exception {
        PushArkassetvisualRequest self = new PushArkassetvisualRequest();
        return TeaModel.build(map, self);
    }

    public PushArkassetvisualRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushArkassetvisualRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushArkassetvisualRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

}
