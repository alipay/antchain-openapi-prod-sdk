// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class PushSpiOrderverifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static PushSpiOrderverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSpiOrderverifyRequest self = new PushSpiOrderverifyRequest();
        return TeaModel.build(map, self);
    }

    public PushSpiOrderverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushSpiOrderverifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushSpiOrderverifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
