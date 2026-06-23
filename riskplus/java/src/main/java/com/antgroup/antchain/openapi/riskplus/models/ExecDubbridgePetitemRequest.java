// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ExecDubbridgePetitemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小程序客户号
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 唯一标识的渠道号
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

    public static ExecDubbridgePetitemRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDubbridgePetitemRequest self = new ExecDubbridgePetitemRequest();
        return TeaModel.build(map, self);
    }

    public ExecDubbridgePetitemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecDubbridgePetitemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecDubbridgePetitemRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ExecDubbridgePetitemRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ExecDubbridgePetitemRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ExecDubbridgePetitemRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ExecDubbridgePetitemRequest setGoodsBalance(String goodsBalance) {
        this.goodsBalance = goodsBalance;
        return this;
    }
    public String getGoodsBalance() {
        return this.goodsBalance;
    }

}
