// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class OrderInfo extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>ORD001</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 金额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 详情
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("detail")
    public OrderDetail detail;

    public static OrderInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderInfo self = new OrderInfo();
        return TeaModel.build(map, self);
    }

    public OrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderInfo setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public OrderInfo setDetail(OrderDetail detail) {
        this.detail = detail;
        return this;
    }
    public OrderDetail getDetail() {
        return this.detail;
    }

}
