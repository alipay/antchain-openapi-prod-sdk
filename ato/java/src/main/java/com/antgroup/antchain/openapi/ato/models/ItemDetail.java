// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ItemDetail extends TeaModel {
    // 租赁商品类目，可选类型：
    // RENT_PHONE - 手机租赁；RENT_COMPUTER - 电脑/平板租赁；RENT_CAMERA - 数码摄像租赁；RENT_DIGITAL - 数码其他租赁；RENT_STATIONERY - 电子词典/电纸书/文化用品租赁；RENT_CLOTHING - 服装租赁
    /**
     * <strong>example:</strong>
     * <p>RENT_PHONE</p>
     */
    @NameInMap("goods_category")
    @Validation(maxLength = 30)
    public String goodsCategory;

    // 租赁商品名称
    /**
     * <strong>example:</strong>
     * <p>全新国行iPhone15Pro A17Pro处理器</p>
     */
    @NameInMap("item_name")
    @Validation(maxLength = 128)
    public String itemName;

    // 租赁商品数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    @Validation(maximum = 10000)
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
