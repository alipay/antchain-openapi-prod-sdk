// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class OrderItem extends TeaModel {
    // 商品ID
    /**
     * <strong>example:</strong>
     * <p>SKU001</p>
     */
    @NameInMap("item_id")
    @Validation(required = true)
    public String itemId;

    // 数量
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    public static OrderItem build(java.util.Map<String, ?> map) throws Exception {
        OrderItem self = new OrderItem();
        return TeaModel.build(map, self);
    }

    public OrderItem setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public OrderItem setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

}
