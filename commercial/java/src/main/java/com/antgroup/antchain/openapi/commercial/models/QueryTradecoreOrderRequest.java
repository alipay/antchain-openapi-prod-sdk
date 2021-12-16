// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryTradecoreOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static QueryTradecoreOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradecoreOrderRequest self = new QueryTradecoreOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradecoreOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradecoreOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
