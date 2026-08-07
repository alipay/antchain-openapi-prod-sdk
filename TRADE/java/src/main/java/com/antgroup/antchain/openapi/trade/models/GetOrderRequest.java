// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class GetOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 中台订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static GetOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderRequest self = new GetOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
