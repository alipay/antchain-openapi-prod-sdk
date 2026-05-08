// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAcopmAtoWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryAcopmAtoWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAcopmAtoWithholdRequest self = new QueryAcopmAtoWithholdRequest();
        return TeaModel.build(map, self);
    }

    public QueryAcopmAtoWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAcopmAtoWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAcopmAtoWithholdRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
