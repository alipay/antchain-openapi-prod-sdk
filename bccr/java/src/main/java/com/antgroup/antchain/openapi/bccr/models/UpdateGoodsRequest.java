// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class UpdateGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品id
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品价格（分）
    @NameInMap("standard_price_in_cent")
    public Long standardPriceInCent;

    // 商品状态:上架，下架
    @NameInMap("goods_status")
    public String goodsStatus;

    public static UpdateGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGoodsRequest self = new UpdateGoodsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateGoodsRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public UpdateGoodsRequest setStandardPriceInCent(Long standardPriceInCent) {
        this.standardPriceInCent = standardPriceInCent;
        return this;
    }
    public Long getStandardPriceInCent() {
        return this.standardPriceInCent;
    }

    public UpdateGoodsRequest setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public String getGoodsStatus() {
        return this.goodsStatus;
    }

}
