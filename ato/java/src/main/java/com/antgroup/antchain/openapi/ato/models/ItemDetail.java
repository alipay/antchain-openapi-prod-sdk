// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ItemDetail extends TeaModel {
    // 租赁商品类目，可选项见 https://opendocs.alipay.com/open/10719
    @NameInMap("goods_category")
    @Validation(required = true, maxLength = 30)
    public String goodsCategory;

    // 租赁商品名称
    @NameInMap("item_name")
    @Validation(required = true, maxLength = 64)
    public String itemName;

    // 租赁商品数量
    @NameInMap("quantity")
    @Validation(required = true, maximum = 10000)
    public Long quantity;

    public static ItemDetail build(java.util.Map<String, ?> map) throws Exception {
        ItemDetail self = new ItemDetail();
        return TeaModel.build(map, self);
    }

    public ItemDetail setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
        return this;
    }
    public String getGoodsCategory() {
        return this.goodsCategory;
    }

    public ItemDetail setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public ItemDetail setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

}
