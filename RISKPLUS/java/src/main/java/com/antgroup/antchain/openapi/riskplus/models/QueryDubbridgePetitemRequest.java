// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgePetitemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小程序客户号
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 子渠道号(唯一标识)
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 门店ID
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 分期订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 商城可用余额
    @NameInMap("mall_available_balance")
    @Validation(required = true)
    public String mallAvailableBalance;

    // 商城消费在途未结算订单
    @NameInMap("mall_consume_unsettle_orders")
    @Validation(required = true)
    public GoodsOrderInfo mallConsumeUnsettleOrders;

    public static QueryDubbridgePetitemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgePetitemRequest self = new QueryDubbridgePetitemRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgePetitemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgePetitemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgePetitemRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgePetitemRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubbridgePetitemRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public QueryDubbridgePetitemRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryDubbridgePetitemRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryDubbridgePetitemRequest setMallAvailableBalance(String mallAvailableBalance) {
        this.mallAvailableBalance = mallAvailableBalance;
        return this;
    }
    public String getMallAvailableBalance() {
        return this.mallAvailableBalance;
    }

    public QueryDubbridgePetitemRequest setMallConsumeUnsettleOrders(GoodsOrderInfo mallConsumeUnsettleOrders) {
        this.mallConsumeUnsettleOrders = mallConsumeUnsettleOrders;
        return this;
    }
    public GoodsOrderInfo getMallConsumeUnsettleOrders() {
        return this.mallConsumeUnsettleOrders;
    }

}
