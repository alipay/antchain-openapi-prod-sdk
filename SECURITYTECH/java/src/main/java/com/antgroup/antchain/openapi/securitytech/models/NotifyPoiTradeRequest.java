// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class NotifyPoiTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道Code
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 子渠道Code
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 原始订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 交易状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 交易订单号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 拓展字段
    @NameInMap("extra_info")
    @Validation(required = true)
    public String extraInfo;

    public static NotifyPoiTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPoiTradeRequest self = new NotifyPoiTradeRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPoiTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyPoiTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyPoiTradeRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public NotifyPoiTradeRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public NotifyPoiTradeRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public NotifyPoiTradeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NotifyPoiTradeRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public NotifyPoiTradeRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
