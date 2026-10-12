// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgePetrefundRequest extends TeaModel {
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

    // 退款单号
    @NameInMap("refund_no")
    @Validation(required = true)
    public String refundNo;

    // 关联交易单号
    @NameInMap("trade_no")
    public String tradeNo;

    public static QueryRiskplusDubbridgePetrefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgePetrefundRequest self = new QueryRiskplusDubbridgePetrefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgePetrefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgePetrefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgePetrefundRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryRiskplusDubbridgePetrefundRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryRiskplusDubbridgePetrefundRequest setRefundNo(String refundNo) {
        this.refundNo = refundNo;
        return this;
    }
    public String getRefundNo() {
        return this.refundNo;
    }

    public QueryRiskplusDubbridgePetrefundRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
