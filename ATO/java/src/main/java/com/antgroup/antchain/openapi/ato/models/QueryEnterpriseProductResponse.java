// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryEnterpriseProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单状态 PAY_SUCCESS-支付成功 ACTIVATION_SUCCESS-产品开通成功 CLOSED-关单状态
    @NameInMap("event")
    public String event;

    // 支付串
    @NameInMap("trade_no")
    public String tradeNo;

    // 订单类型 NEW=新购 RENEW=续费
    @NameInMap("order_type")
    public String orderType;

    // 产品码
    @NameInMap("commodity_code")
    public String commodityCode;

    // 认购类型
    @NameInMap("duration_type")
    public String durationType;

    // 认购时长
    @NameInMap("duration_value")
    public String durationValue;

    public static QueryEnterpriseProductResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseProductResponse self = new QueryEnterpriseProductResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnterpriseProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnterpriseProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnterpriseProductResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryEnterpriseProductResponse setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public QueryEnterpriseProductResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryEnterpriseProductResponse setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryEnterpriseProductResponse setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QueryEnterpriseProductResponse setDurationType(String durationType) {
        this.durationType = durationType;
        return this;
    }
    public String getDurationType() {
        return this.durationType;
    }

    public QueryEnterpriseProductResponse setDurationValue(String durationValue) {
        this.durationValue = durationValue;
        return this;
    }
    public String getDurationValue() {
        return this.durationValue;
    }

}
