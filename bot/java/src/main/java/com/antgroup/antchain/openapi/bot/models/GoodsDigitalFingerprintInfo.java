// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintInfo extends TeaModel {
    // 品类
    /**
     * <strong>example:</strong>
     * <p>奢侈品</p>
     */
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 品牌
    /**
     * <strong>example:</strong>
     * <p>GUCCI</p>
     */
    @NameInMap("brand")
    @Validation(required = true)
    public String brand;

    // 款式
    /**
     * <strong>example:</strong>
     * <p>Gucci Diana</p>
     */
    @NameInMap("style")
    @Validation(required = true)
    public String style;

    // 商品数字指纹鉴定点列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;sub_point_name&quot;:&quot;正面&quot;,&quot;image_url&quot;:&quot;<a href="http://xxxx1001%22%7D,%7B%22sub_point_name%22:%22%E8%83%8C%E9%9D%A2%22,%22image_url%22:%22http://xxxx1002%22%7D%5D">http://xxxx1001&quot;},{&quot;sub_point_name&quot;:&quot;背面&quot;,&quot;image_url&quot;:&quot;http://xxxx1002&quot;}]</a></p>
     */
    @NameInMap("goods_points")
    @Validation(required = true)
    public java.util.List<GoodsDigitalFingerprintPoint> goodsPoints;

    // 商品id
    /**
     * <strong>example:</strong>
     * <p>goodsId</p>
     */
    @NameInMap("goods_id")
    @Validation(required = true, maxLength = 128)
    public String goodsId;

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

    public GoodsDigitalFingerprintInfo setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

}
