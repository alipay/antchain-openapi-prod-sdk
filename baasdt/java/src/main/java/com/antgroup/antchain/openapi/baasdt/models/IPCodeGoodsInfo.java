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

    // 商品图片临时访问地址，可直接访问
    @NameInMap("goods_image_tmp")
    public String goodsImageTmp;

    // 商品店铺名称/商品出品方
    @NameInMap("goods_store")
    public String goodsStore;

    // 店铺logo图片链接
    @NameInMap("goods_store_logo")
    public String goodsStoreLogo;

    // 店铺logo临时访问地址
    @NameInMap("goods_store_logo_tmp")
    public String goodsStoreLogoTmp;

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

    // 发售渠道
    @NameInMap("goods_sale_channel")
    public String goodsSaleChannel;

    // 商品规格
    @NameInMap("goods_specifications")
    public java.util.List<ProductSpecification> goodsSpecifications;

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

    public IPCodeGoodsInfo setGoodsImageTmp(String goodsImageTmp) {
        this.goodsImageTmp = goodsImageTmp;
        return this;
    }
    public String getGoodsImageTmp() {
        return this.goodsImageTmp;
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

    public IPCodeGoodsInfo setGoodsStoreLogoTmp(String goodsStoreLogoTmp) {
        this.goodsStoreLogoTmp = goodsStoreLogoTmp;
        return this;
    }
    public String getGoodsStoreLogoTmp() {
        return this.goodsStoreLogoTmp;
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

    public IPCodeGoodsInfo setGoodsSaleChannel(String goodsSaleChannel) {
        this.goodsSaleChannel = goodsSaleChannel;
        return this;
    }
    public String getGoodsSaleChannel() {
        return this.goodsSaleChannel;
    }

    public IPCodeGoodsInfo setGoodsSpecifications(java.util.List<ProductSpecification> goodsSpecifications) {
        this.goodsSpecifications = goodsSpecifications;
        return this;
    }
    public java.util.List<ProductSpecification> getGoodsSpecifications() {
        return this.goodsSpecifications;
    }

}
