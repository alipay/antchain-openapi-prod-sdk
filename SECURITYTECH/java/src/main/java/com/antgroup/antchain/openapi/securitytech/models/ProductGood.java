// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ProductGood extends TeaModel {
    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>猫罐头</p>
     */
    @NameInMap("goods_name")
    @Validation(required = true)
    public String goodsName;

    // 商品类别，枚举值
    /**
     * <strong>example:</strong>
     * <p>CAN</p>
     */
    @NameInMap("goods_category")
    @Validation(required = true)
    public String goodsCategory;

    // 此商品总金额（元，两位小数）
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("goods_amount")
    @Validation(required = true)
    public String goodsAmount;

    // 此商消费总积分（两位小数）
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("goods_points")
    @Validation(required = true)
    public String goodsPoints;

    // 商品件数（整数）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("goods_count")
    @Validation(required = true)
    public String goodsCount;

    public static ProductGood build(java.util.Map<String, ?> map) throws Exception {
        ProductGood self = new ProductGood();
        return TeaModel.build(map, self);
    }

    public ProductGood setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public ProductGood setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
        return this;
    }
    public String getGoodsCategory() {
        return this.goodsCategory;
    }

    public ProductGood setGoodsAmount(String goodsAmount) {
        this.goodsAmount = goodsAmount;
        return this;
    }
    public String getGoodsAmount() {
        return this.goodsAmount;
    }

    public ProductGood setGoodsPoints(String goodsPoints) {
        this.goodsPoints = goodsPoints;
        return this;
    }
    public String getGoodsPoints() {
        return this.goodsPoints;
    }

    public ProductGood setGoodsCount(String goodsCount) {
        this.goodsCount = goodsCount;
        return this;
    }
    public String getGoodsCount() {
        return this.goodsCount;
    }

}
