// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class QueryAntsecuritytechGatewayPoiOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryAntsecuritytechGatewayPoiOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsecuritytechGatewayPoiOrderRequest self = new QueryAntsecuritytechGatewayPoiOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsecuritytechGatewayPoiOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsecuritytechGatewayPoiOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsecuritytechGatewayPoiOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
