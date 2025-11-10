// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAlipayTradeRequest extends TeaModel {
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

    public static QueryDubbridgeAlipayTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAlipayTradeRequest self = new QueryDubbridgeAlipayTradeRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAlipayTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeAlipayTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeAlipayTradeRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryDubbridgeAlipayTradeRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

}
