// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class PushSpiPaycallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // JSON data
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // request_id
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static PushSpiPaycallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSpiPaycallbackRequest self = new PushSpiPaycallbackRequest();
        return TeaModel.build(map, self);
    }

    public PushSpiPaycallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushSpiPaycallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushSpiPaycallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushSpiPaycallbackRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
