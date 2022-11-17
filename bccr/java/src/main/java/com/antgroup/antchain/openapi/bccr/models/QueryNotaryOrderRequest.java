// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // acrbasis订单ID
    @NameInMap("notary_order_id")
    @Validation(required = true)
    public String notaryOrderId;

    public static QueryNotaryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryOrderRequest self = new QueryNotaryOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotaryOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNotaryOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNotaryOrderRequest setNotaryOrderId(String notaryOrderId) {
        this.notaryOrderId = notaryOrderId;
        return this;
    }
    public String getNotaryOrderId() {
        return this.notaryOrderId;
    }

}
