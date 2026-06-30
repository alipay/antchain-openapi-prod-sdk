// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CancelDubbridgeAlipayTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 导流平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    public static CancelDubbridgeAlipayTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDubbridgeAlipayTradeRequest self = new CancelDubbridgeAlipayTradeRequest();
        return TeaModel.build(map, self);
    }

    public CancelDubbridgeAlipayTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelDubbridgeAlipayTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelDubbridgeAlipayTradeRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public CancelDubbridgeAlipayTradeRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

}
