// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsComparisonReqData extends TeaModel {
    // 品类
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 品牌
    @NameInMap("brand")
    @Validation(required = true)
    public String brand;

    // 款式
    @NameInMap("style")
    @Validation(required = true)
    public String style;

    // 商品鉴定点列表
    @NameInMap("goods_points")
    @Validation(required = true)
    public java.util.List<BaiGoodsPoint> goodsPoints;

    public static BaiGoodsComparisonReqData build(java.util.Map<String, ?> map) throws Exception {
        BaiGoodsComparisonReqData self = new BaiGoodsComparisonReqData();
        return TeaModel.build(map, self);
    }

    public BaiGoodsComparisonReqData setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public BaiGoodsComparisonReqData setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public BaiGoodsComparisonReqData setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public BaiGoodsComparisonReqData setGoodsPoints(java.util.List<BaiGoodsPoint> goodsPoints) {
        this.goodsPoints = goodsPoints;
        return this;
    }
    public java.util.List<BaiGoodsPoint> getGoodsPoints() {
        return this.goodsPoints;
    }

}
