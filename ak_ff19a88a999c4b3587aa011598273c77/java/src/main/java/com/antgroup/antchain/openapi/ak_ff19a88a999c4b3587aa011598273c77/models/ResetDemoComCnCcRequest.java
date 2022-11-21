// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models;

import com.aliyun.tea.*;

public class ResetDemoComCnCcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // orderid
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static ResetDemoComCnCcRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDemoComCnCcRequest self = new ResetDemoComCnCcRequest();
        return TeaModel.build(map, self);
    }

    public ResetDemoComCnCcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetDemoComCnCcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResetDemoComCnCcRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
