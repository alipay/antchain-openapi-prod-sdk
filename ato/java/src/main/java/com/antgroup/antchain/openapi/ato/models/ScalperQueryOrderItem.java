// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ScalperQueryOrderItem extends TeaModel {
    // 订单商品名称
    @NameInMap("order_items_name")
    @Validation(maxLength = 256, minLength = 1)
    public String orderItemsName;

    // 订单商品数量
    @NameInMap("order_items_quantity")
    @Validation(maximum = 100000, minimum = 1)
    public Long orderItemsQuantity;

    // 订单商品价格，单位：分
    @NameInMap("order_items_price")
    @Validation(maximum = 10000000, minimum = 1)
    public Long orderItemsPrice;

    public static ScalperQueryOrderItem build(java.util.Map<String, ?> map) throws Exception {
        ScalperQueryOrderItem self = new ScalperQueryOrderItem();
        return TeaModel.build(map, self);
    }

    public ScalperQueryOrderItem setOrderItemsName(String orderItemsName) {
        this.orderItemsName = orderItemsName;
        return this;
    }
    public String getOrderItemsName() {
        return this.orderItemsName;
    }

    public ScalperQueryOrderItem setOrderItemsQuantity(Long orderItemsQuantity) {
        this.orderItemsQuantity = orderItemsQuantity;
        return this;
    }
    public Long getOrderItemsQuantity() {
        return this.orderItemsQuantity;
    }

    public ScalperQueryOrderItem setOrderItemsPrice(Long orderItemsPrice) {
        this.orderItemsPrice = orderItemsPrice;
        return this;
    }
    public Long getOrderItemsPrice() {
        return this.orderItemsPrice;
    }

}
