// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CloseDubbridgeAlipayTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产方购物订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 导流平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 操作人id
    @NameInMap("operator_id")
    public String operatorId;

    public static CloseDubbridgeAlipayTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDubbridgeAlipayTradeRequest self = new CloseDubbridgeAlipayTradeRequest();
        return TeaModel.build(map, self);
    }

    public CloseDubbridgeAlipayTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloseDubbridgeAlipayTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloseDubbridgeAlipayTradeRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public CloseDubbridgeAlipayTradeRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public CloseDubbridgeAlipayTradeRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
