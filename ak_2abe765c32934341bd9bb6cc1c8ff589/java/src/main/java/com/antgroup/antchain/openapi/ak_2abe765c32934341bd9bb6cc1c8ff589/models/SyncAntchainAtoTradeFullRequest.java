// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoTradeFullRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 购买用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public UserSyncInfo userInfo;

    // 主订单信息
    @NameInMap("order_info")
    @Validation(required = true)
    public OrderInfo orderInfo;

    // 订单包含的商品信息列表
    @NameInMap("goods_info")
    @Validation(required = true)
    public GoodsInfo goodsInfo;

    // 订单还款计划
    @NameInMap("promise_info")
    @Validation(required = true)
    public PromiseInfo promiseInfo;

    public static SyncAntchainAtoTradeFullRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoTradeFullRequest self = new SyncAntchainAtoTradeFullRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoTradeFullRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoTradeFullRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoTradeFullRequest setUserInfo(UserSyncInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public UserSyncInfo getUserInfo() {
        return this.userInfo;
    }

    public SyncAntchainAtoTradeFullRequest setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public SyncAntchainAtoTradeFullRequest setGoodsInfo(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
        return this;
    }
    public GoodsInfo getGoodsInfo() {
        return this.goodsInfo;
    }

    public SyncAntchainAtoTradeFullRequest setPromiseInfo(PromiseInfo promiseInfo) {
        this.promiseInfo = promiseInfo;
        return this;
    }
    public PromiseInfo getPromiseInfo() {
        return this.promiseInfo;
    }

}
