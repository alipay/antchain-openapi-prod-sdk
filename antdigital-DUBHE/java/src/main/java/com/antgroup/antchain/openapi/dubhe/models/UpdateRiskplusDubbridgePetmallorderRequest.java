// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class UpdateRiskplusDubbridgePetmallorderRequest extends TeaModel {
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
    public String trafficPlatform;

    // 买家用户id
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 商户入驻id
    @NameInMap("merchant_id")
    public String merchantId;

    // 关联交易单号
    @NameInMap("trade_no")
    public String tradeNo;

    // 商城业务订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // SHIPPED: 已发货
    // CANCELED: 取消
    // RECEIVED: 确认收货
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static UpdateRiskplusDubbridgePetmallorderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskplusDubbridgePetmallorderRequest self = new UpdateRiskplusDubbridgePetmallorderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public UpdateRiskplusDubbridgePetmallorderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
