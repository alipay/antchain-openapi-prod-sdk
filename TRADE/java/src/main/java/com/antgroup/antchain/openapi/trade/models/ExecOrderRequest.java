// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ExecOrderRequest extends TeaModel {
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

    // 开通参数
    @NameInMap("provision_options")
    public ProvisionOption provisionOptions;

    public static ExecOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecOrderRequest self = new ExecOrderRequest();
        return TeaModel.build(map, self);
    }

    public ExecOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExecOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExecOrderRequest setProvisionOptions(ProvisionOption provisionOptions) {
        this.provisionOptions = provisionOptions;
        return this;
    }
    public ProvisionOption getProvisionOptions() {
        return this.provisionOptions;
    }

}
