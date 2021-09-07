// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class SendGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品id
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 接收人用户id
    @NameInMap("transferee_id")
    @Validation(required = true)
    public String transfereeId;

    // 转让金额，单位分
    @NameInMap("amount")
    public Long amount;

    public static SendGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendGoodsRequest self = new SendGoodsRequest();
        return TeaModel.build(map, self);
    }

    public SendGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendGoodsRequest setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public SendGoodsRequest setTransfereeId(String transfereeId) {
        this.transfereeId = transfereeId;
        return this;
    }
    public String getTransfereeId() {
        return this.transfereeId;
    }

    public SendGoodsRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

}
