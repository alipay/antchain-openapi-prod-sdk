// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class BatchcancelOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否取消成功
    // 
    @NameInMap("result")
    public Boolean result;

    // 取消订单结果
    @NameInMap("create_trade_order_result")
    public java.util.List<CreateTradeOrderResult> createTradeOrderResult;

    public static BatchcancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcancelOrderResponse self = new BatchcancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public BatchcancelOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcancelOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcancelOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcancelOrderResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public BatchcancelOrderResponse setCreateTradeOrderResult(java.util.List<CreateTradeOrderResult> createTradeOrderResult) {
        this.createTradeOrderResult = createTradeOrderResult;
        return this;
    }
    public java.util.List<CreateTradeOrderResult> getCreateTradeOrderResult() {
        return this.createTradeOrderResult;
    }

}
