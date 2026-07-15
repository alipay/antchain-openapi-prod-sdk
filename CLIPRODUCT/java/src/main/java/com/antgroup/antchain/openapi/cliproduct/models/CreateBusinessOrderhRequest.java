// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class CreateBusinessOrderhRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单编号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static CreateBusinessOrderhRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOrderhRequest self = new CreateBusinessOrderhRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOrderhRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessOrderhRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessOrderhRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
