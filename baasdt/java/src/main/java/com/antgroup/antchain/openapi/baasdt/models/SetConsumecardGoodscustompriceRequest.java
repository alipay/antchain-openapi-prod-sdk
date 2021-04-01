// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetConsumecardGoodscustompriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 商品ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 设置一客一价的目标账户id
    @NameInMap("open_account_id")
    @Validation(required = true)
    public String openAccountId;

    // 设置的价格(单位:元,精确到分)
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    public static SetConsumecardGoodscustompriceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConsumecardGoodscustompriceRequest self = new SetConsumecardGoodscustompriceRequest();
        return TeaModel.build(map, self);
    }

    public SetConsumecardGoodscustompriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetConsumecardGoodscustompriceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetConsumecardGoodscustompriceRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public SetConsumecardGoodscustompriceRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public SetConsumecardGoodscustompriceRequest setOpenAccountId(String openAccountId) {
        this.openAccountId = openAccountId;
        return this;
    }
    public String getOpenAccountId() {
        return this.openAccountId;
    }

    public SetConsumecardGoodscustompriceRequest setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

}
