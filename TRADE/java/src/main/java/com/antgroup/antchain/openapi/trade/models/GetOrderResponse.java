// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class GetOrderResponse extends TeaModel {
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

    // 订单状态，示例：
    // ORDER_SUCCESS（成功）
    // ORDER_FAIL（失败）
    // ORDER_CANCEL（取消）
    @NameInMap("order_status")
    public String orderStatus;

    // 履约状态；INIT(待履约), DOING(履约中), DONE("履约完成"), FAILED(履约失败)
    @NameInMap("fulfill_status")
    public String fulfillStatus;

    public static GetOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderResponse self = new GetOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetOrderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetOrderResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public GetOrderResponse setFulfillStatus(String fulfillStatus) {
        this.fulfillStatus = fulfillStatus;
        return this;
    }
    public String getFulfillStatus() {
        return this.fulfillStatus;
    }

}
