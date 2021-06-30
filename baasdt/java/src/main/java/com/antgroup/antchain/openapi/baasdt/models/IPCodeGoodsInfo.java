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

    // 商品店铺名称
    @NameInMap("goods_store")
    public String goodsStore;

    // 店铺logo图片链接
    @NameInMap("goods_store_logo")
    public String goodsStoreLogo;

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

}
