// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushMeterdataOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 订单计费数据列表
    @NameInMap("order_push_list")
    @Validation(required = true)
    public java.util.List<OrderPushInfo> orderPushList;

    public static PushMeterdataOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeterdataOrderRequest self = new PushMeterdataOrderRequest();
        return TeaModel.build(map, self);
    }

    public PushMeterdataOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushMeterdataOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushMeterdataOrderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PushMeterdataOrderRequest setOrderPushList(java.util.List<OrderPushInfo> orderPushList) {
        this.orderPushList = orderPushList;
        return this;
    }
    public java.util.List<OrderPushInfo> getOrderPushList() {
        return this.orderPushList;
    }

}
