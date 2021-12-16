// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class CancelTradecoreOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static CancelTradecoreOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTradecoreOrderRequest self = new CancelTradecoreOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelTradecoreOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelTradecoreOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
