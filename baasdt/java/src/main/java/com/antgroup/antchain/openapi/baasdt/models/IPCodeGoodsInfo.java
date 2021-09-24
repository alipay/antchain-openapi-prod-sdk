// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeGoodsInfo extends TeaModel {
    // 商品名称
    @NameInMap("goods_name")
    public String goodsName;

    // 商品链接
    @NameInMap("goods_url")
    public String goodsUrl;

    // 商品图片
    @NameInMap("goods_image")
    public String goodsImage;

    // 商品店铺名称/商品出品方
    @NameInMap("goods_store")
    public String goodsStore;

    // 店铺logo图片链接
    @NameInMap("goods_store_logo")
    public String goodsStoreLogo;

    // 商品描述
    @NameInMap("goods_description")
    public String goodsDescription;

    // 商品品牌
    @NameInMap("goods_brand")
    public String goodsBrand;

    // 授权过期类型，0：长久有效，1：有效日期内有效
    @NameInMap("authorization_expirated_type")
    public String authorizationExpiratedType;

    // 授权截止日期
    @NameInMap("authorization_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String authorizationEndTime;

    public static IPCodeGoodsInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeGoodsInfo self = new IPCodeGoodsInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeGoodsInfo setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public IPCodeGoodsInfo setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
        return this;
    }
    public String getGoodsUrl() {
        return this.goodsUrl;
    }

    public IPCodeGoodsInfo setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
        return this;
    }
    public String getGoodsImage() {
        return this.goodsImage;
    }

    public IPCodeGoodsInfo setGoodsStore(String goodsStore) {
        this.goodsStore = goodsStore;
        return this;
    }
    public String getGoodsStore() {
        return this.goodsStore;
    }

    public IPCodeGoodsInfo setGoodsStoreLogo(String goodsStoreLogo) {
        this.goodsStoreLogo = goodsStoreLogo;
        return this;
    }
    public String getGoodsStoreLogo() {
        return this.goodsStoreLogo;
    }

    public IPCodeGoodsInfo setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
        return this;
    }
    public String getGoodsDescription() {
        return this.goodsDescription;
    }

    public IPCodeGoodsInfo setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand;
        return this;
    }
    public String getGoodsBrand() {
        return this.goodsBrand;
    }

    public IPCodeGoodsInfo setAuthorizationExpiratedType(String authorizationExpiratedType) {
        this.authorizationExpiratedType = authorizationExpiratedType;
        return this;
    }
    public String getAuthorizationExpiratedType() {
        return this.authorizationExpiratedType;
    }

    public IPCodeGoodsInfo setAuthorizationEndTime(String authorizationEndTime) {
        this.authorizationEndTime = authorizationEndTime;
        return this;
    }
    public String getAuthorizationEndTime() {
        return this.authorizationEndTime;
    }

}
