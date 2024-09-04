// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class OrderItem extends TeaModel {
    // 项目ID
    @NameInMap("item_id")
    @Validation(required = true)
    public String itemId;

    // 项目类型（数登申请）
    @NameInMap("item_type")
    @Validation(required = true)
    public String itemType;

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

    public OrderItem setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

}
