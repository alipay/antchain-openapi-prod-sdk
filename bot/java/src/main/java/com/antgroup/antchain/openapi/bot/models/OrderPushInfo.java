// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OrderPushInfo extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>208395</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 时间戳，取订单上链timestamp字段
    /**
     * <strong>example:</strong>
     * <p>1665490037182</p>
     */
    @NameInMap("order_collect_time")
    @Validation(required = true)
    public String orderCollectTime;

    // 订单总金额
    /**
     * <strong>example:</strong>
     * <p>12000.37</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static OrderPushInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderPushInfo self = new OrderPushInfo();
        return TeaModel.build(map, self);
    }

    public OrderPushInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderPushInfo setOrderCollectTime(String orderCollectTime) {
        this.orderCollectTime = orderCollectTime;
        return this;
    }
    public String getOrderCollectTime() {
        return this.orderCollectTime;
    }

    public OrderPushInfo setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public OrderPushInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
