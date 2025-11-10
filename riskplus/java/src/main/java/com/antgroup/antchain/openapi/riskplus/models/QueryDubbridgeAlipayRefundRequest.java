// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAlipayRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款请求编号
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 商家订单编号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 导流平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    public static QueryDubbridgeAlipayRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAlipayRefundRequest self = new QueryDubbridgeAlipayRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAlipayRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeAlipayRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeAlipayRefundRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public QueryDubbridgeAlipayRefundRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryDubbridgeAlipayRefundRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubbridgeAlipayRefundRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
