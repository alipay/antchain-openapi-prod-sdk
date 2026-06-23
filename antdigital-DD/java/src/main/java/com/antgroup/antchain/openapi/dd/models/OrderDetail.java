// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class OrderDetail extends TeaModel {
    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>商品A</p>
     */
    @NameInMap("item_name")
    @Validation(required = true)
    public String itemName;

    // 数量
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    // 单价
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("price")
    @Validation(required = true)
    public Long price;

    public static OrderDetail build(java.util.Map<String, ?> map) throws Exception {
        OrderDetail self = new OrderDetail();
        return TeaModel.build(map, self);
    }

    public OrderDetail setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public OrderDetail setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public OrderDetail setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

}
