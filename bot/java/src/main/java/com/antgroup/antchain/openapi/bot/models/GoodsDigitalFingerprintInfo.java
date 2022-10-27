// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintInfo extends TeaModel {
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

    // 商品数字指纹鉴定点列表
    @NameInMap("goods_points")
    @Validation(required = true)
    public java.util.List<GoodsDigitalFingerprintPoint> goodsPoints;

    public static GoodsDigitalFingerprintInfo build(java.util.Map<String, ?> map) throws Exception {
        GoodsDigitalFingerprintInfo self = new GoodsDigitalFingerprintInfo();
        return TeaModel.build(map, self);
    }

    public GoodsDigitalFingerprintInfo setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public GoodsDigitalFingerprintInfo setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public GoodsDigitalFingerprintInfo setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public GoodsDigitalFingerprintInfo setGoodsPoints(java.util.List<GoodsDigitalFingerprintPoint> goodsPoints) {
        this.goodsPoints = goodsPoints;
        return this;
    }
    public java.util.List<GoodsDigitalFingerprintPoint> getGoodsPoints() {
        return this.goodsPoints;
    }

}
