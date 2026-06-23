// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushDubbridgePetitemRequest extends TeaModel {
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

    // 商城id
    @NameInMap("mail_id")
    public String mailId;

    // 商城订单信息
    @NameInMap("goods_order_info")
    @Validation(required = true)
    public java.util.List<GoodsOrderInfo> goodsOrderInfo;

    // 门店账户信息
    @NameInMap("store_account_info")
    @Validation(required = true)
    public StoreAccountInfo storeAccountInfo;

    public static PushDubbridgePetitemRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDubbridgePetitemRequest self = new PushDubbridgePetitemRequest();
        return TeaModel.build(map, self);
    }

    public PushDubbridgePetitemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushDubbridgePetitemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushDubbridgePetitemRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public PushDubbridgePetitemRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public PushDubbridgePetitemRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public PushDubbridgePetitemRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public PushDubbridgePetitemRequest setMailId(String mailId) {
        this.mailId = mailId;
        return this;
    }
    public String getMailId() {
        return this.mailId;
    }

    public PushDubbridgePetitemRequest setGoodsOrderInfo(java.util.List<GoodsOrderInfo> goodsOrderInfo) {
        this.goodsOrderInfo = goodsOrderInfo;
        return this;
    }
    public java.util.List<GoodsOrderInfo> getGoodsOrderInfo() {
        return this.goodsOrderInfo;
    }

    public PushDubbridgePetitemRequest setStoreAccountInfo(StoreAccountInfo storeAccountInfo) {
        this.storeAccountInfo = storeAccountInfo;
        return this;
    }
    public StoreAccountInfo getStoreAccountInfo() {
        return this.storeAccountInfo;
    }

}
