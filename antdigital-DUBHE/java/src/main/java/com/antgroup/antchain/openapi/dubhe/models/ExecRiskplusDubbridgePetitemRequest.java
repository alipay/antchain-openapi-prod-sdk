// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class ExecRiskplusDubbridgePetitemRequest extends TeaModel {
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

    // 商城余额
    @NameInMap("goods_balance")
    @Validation(required = true)
    public String goodsBalance;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 请求流水号(通过此流水号幂等判断是否是同一个请求)
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    public static ExecRiskplusDubbridgePetitemRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRiskplusDubbridgePetitemRequest self = new ExecRiskplusDubbridgePetitemRequest();
        return TeaModel.build(map, self);
    }

    public ExecRiskplusDubbridgePetitemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRiskplusDubbridgePetitemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecRiskplusDubbridgePetitemRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ExecRiskplusDubbridgePetitemRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ExecRiskplusDubbridgePetitemRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ExecRiskplusDubbridgePetitemRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ExecRiskplusDubbridgePetitemRequest setGoodsBalance(String goodsBalance) {
        this.goodsBalance = goodsBalance;
        return this;
    }
    public String getGoodsBalance() {
        return this.goodsBalance;
    }

    public ExecRiskplusDubbridgePetitemRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public ExecRiskplusDubbridgePetitemRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

}
