// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class ApplyRiskplusDubbridgePetmallorderTransferRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 渠道编码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 流量平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 买家用户id
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 入驻主体id，业务订单归属
    @NameInMap("merchant_id")
    public String merchantId;

    // 业务订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 交易单号
    @NameInMap("trade_no")
    public String tradeNo;

    public static ApplyRiskplusDubbridgePetmallorderTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRiskplusDubbridgePetmallorderTransferRequest self = new ApplyRiskplusDubbridgePetmallorderTransferRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ApplyRiskplusDubbridgePetmallorderTransferRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
