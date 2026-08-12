// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class GetAntcloudTradeOrderRequest extends TeaModel {
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

    public static GetAntcloudTradeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntcloudTradeOrderRequest self = new GetAntcloudTradeOrderRequest();
        return TeaModel.build(map, self);
    }

    public GetAntcloudTradeOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntcloudTradeOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntcloudTradeOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
