// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CancelOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单ID
    // 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 下单时的租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequest self = new CancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
