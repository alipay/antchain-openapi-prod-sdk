// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class PushSpiCompletecommodityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static PushSpiCompletecommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSpiCompletecommodityRequest self = new PushSpiCompletecommodityRequest();
        return TeaModel.build(map, self);
    }

    public PushSpiCompletecommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushSpiCompletecommodityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushSpiCompletecommodityRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
