// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgePetFundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流量平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 买家用户id
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 关联交易单号
    @NameInMap("trade_no")
    public String tradeNo;

    // 订单归属主体入驻ID
    @NameInMap("merchant_id")
    public String merchantId;

    // 渠道编码
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    public static QueryRiskplusDubbridgePetFundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgePetFundRequest self = new QueryRiskplusDubbridgePetFundRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgePetFundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgePetFundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgePetFundRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryRiskplusDubbridgePetFundRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public QueryRiskplusDubbridgePetFundRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryRiskplusDubbridgePetFundRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryRiskplusDubbridgePetFundRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
