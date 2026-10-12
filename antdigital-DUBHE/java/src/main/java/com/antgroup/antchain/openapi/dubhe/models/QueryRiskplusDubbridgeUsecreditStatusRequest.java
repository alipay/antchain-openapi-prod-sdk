// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeUsecreditStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求网络流水号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 1：现金贷（默认）
    // 2：分期付
    @NameInMap("prod_type")
    public String prodType;

    // 天枢系统用信申请的订单号
    @NameInMap("original_order_no")
    public String originalOrderNo;

    // 购物订单号，如二轮车/摩托车订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 渠道号
    @NameInMap("channel_code")
    public String channelCode;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    public static QueryRiskplusDubbridgeUsecreditStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeUsecreditStatusRequest self = new QueryRiskplusDubbridgeUsecreditStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setOriginalOrderNo(String originalOrderNo) {
        this.originalOrderNo = originalOrderNo;
        return this;
    }
    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryRiskplusDubbridgeUsecreditStatusRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

}
