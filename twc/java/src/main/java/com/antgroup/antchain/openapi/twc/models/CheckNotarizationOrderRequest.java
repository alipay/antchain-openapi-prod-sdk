// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CheckNotarizationOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公证订单ID号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static CheckNotarizationOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckNotarizationOrderRequest self = new CheckNotarizationOrderRequest();
        return TeaModel.build(map, self);
    }

    public CheckNotarizationOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckNotarizationOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckNotarizationOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
