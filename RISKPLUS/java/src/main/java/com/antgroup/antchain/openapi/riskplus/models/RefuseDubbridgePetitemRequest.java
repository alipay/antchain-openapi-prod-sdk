// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RefuseDubbridgePetitemRequest extends TeaModel {
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

    // 退款金额
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 渠道号
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    public static RefuseDubbridgePetitemRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseDubbridgePetitemRequest self = new RefuseDubbridgePetitemRequest();
        return TeaModel.build(map, self);
    }

    public RefuseDubbridgePetitemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefuseDubbridgePetitemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefuseDubbridgePetitemRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public RefuseDubbridgePetitemRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public RefuseDubbridgePetitemRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public RefuseDubbridgePetitemRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public RefuseDubbridgePetitemRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefuseDubbridgePetitemRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
