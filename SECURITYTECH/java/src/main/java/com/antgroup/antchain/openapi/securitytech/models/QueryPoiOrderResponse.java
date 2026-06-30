// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryPoiOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单号
    @NameInMap("order_id")
    public String orderId;

    // 用户openId
    @NameInMap("open_id")
    public String openId;

    // 订单状态
    @NameInMap("order_status")
    public String orderStatus;

    // 订单金额
    @NameInMap("order_amount")
    public String orderAmount;

    // 门店ID
    @NameInMap("store_id")
    public String storeId;

    // 最近状态变更时间（yyyy-MM-dd HH:mm:ss）
    @NameInMap("effect_time")
    public String effectTime;

    public static QueryPoiOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPoiOrderResponse self = new QueryPoiOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryPoiOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPoiOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPoiOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPoiOrderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryPoiOrderResponse setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryPoiOrderResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public QueryPoiOrderResponse setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public String getOrderAmount() {
        return this.orderAmount;
    }

    public QueryPoiOrderResponse setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public QueryPoiOrderResponse setEffectTime(String effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public String getEffectTime() {
        return this.effectTime;
    }

}
