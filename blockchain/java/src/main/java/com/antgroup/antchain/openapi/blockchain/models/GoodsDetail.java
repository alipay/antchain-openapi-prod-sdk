// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GoodsDetail extends TeaModel {
    // 商品编号
    /**
     * <strong>example:</strong>
     * <p>apple-01</p>
     */
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>apple</p>
     */
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    @Validation(required = true)
    public String quantity;

    // 商品单价
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 商品类目
    /**
     * <strong>example:</strong>
     * <p>34543238</p>
     */
    @NameInMap("goods_category")
    public String goodsCategory;

    // 商品类目树
    /**
     * <strong>example:</strong>
     * <p>124868003|126232002|126252004</p>
     */
    @NameInMap("categories_tree")
    public String categoriesTree;

    // 商品的展示地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.alipay.com/xxx.jpg">http://www.alipay.com/xxx.jpg</a></p>
     */
    @NameInMap("show_url")
    public String showUrl;

    // 商品69条码
    /**
     * <strong>example:</strong>
     * <p>6972829161111</p>
     */
    @NameInMap("goods_ean_id")
    public String goodsEanId;

    // 商家侧小程序商品 ID
    /**
     * <strong>example:</strong>
     * <p>outItem_01</p>
     */
    @NameInMap("out_item_id")
    public String outItemId;

    // 商家侧小程序商品ID
    /**
     * <strong>example:</strong>
     * <p>outSku_01</p>
     */
    @NameInMap("out_sku_id")
    public String outSkuId;

    public static GoodsDetail build(java.util.Map<String, ?> map) throws Exception {
        GoodsDetail self = new GoodsDetail();
        return TeaModel.build(map, self);
    }

    public GoodsDetail setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public GoodsDetail setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public GoodsDetail setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public GoodsDetail setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public GoodsDetail setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
        return this;
    }
    public String getGoodsCategory() {
        return this.goodsCategory;
    }

    public GoodsDetail setCategoriesTree(String categoriesTree) {
        this.categoriesTree = categoriesTree;
        return this;
    }
    public String getCategoriesTree() {
        return this.categoriesTree;
    }

    public GoodsDetail setShowUrl(String showUrl) {
        this.showUrl = showUrl;
        return this;
    }
    public String getShowUrl() {
        return this.showUrl;
    }

    public GoodsDetail setGoodsEanId(String goodsEanId) {
        this.goodsEanId = goodsEanId;
        return this;
    }
    public String getGoodsEanId() {
        return this.goodsEanId;
    }

    public GoodsDetail setOutItemId(String outItemId) {
        this.outItemId = outItemId;
        return this;
    }
    public String getOutItemId() {
        return this.outItemId;
    }

    public GoodsDetail setOutSkuId(String outSkuId) {
        this.outSkuId = outSkuId;
        return this;
    }
    public String getOutSkuId() {
        return this.outSkuId;
    }

}
