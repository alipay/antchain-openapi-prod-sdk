// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class OverdueAntsecuritytechGatewayPoiTerminationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 门店ID
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 分期主订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 逾期事件类型
    @NameInMap("event")
    @Validation(required = true)
    public String event;

    // 渠道
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 渠道Code
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    public static OverdueAntsecuritytechGatewayPoiTerminationRequest build(java.util.Map<String, ?> map) throws Exception {
        OverdueAntsecuritytechGatewayPoiTerminationRequest self = new OverdueAntsecuritytechGatewayPoiTerminationRequest();
        return TeaModel.build(map, self);
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
