// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class RefundOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 租户标识
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static RefundOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundOrderRequest self = new RefundOrderRequest();
        return TeaModel.build(map, self);
    }

    public RefundOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefundOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RefundOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
