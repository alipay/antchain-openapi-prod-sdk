// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class BatchcreateOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付状态
    @NameInMap("pay_status")
    public String payStatus;

    // 批量下单列表返回
    @NameInMap("create_trade_order_results")
    public java.util.List<CreateTradeOrderResult> createTradeOrderResults;

    public static BatchcreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateOrderResponse self = new BatchcreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateOrderResponse setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public BatchcreateOrderResponse setCreateTradeOrderResults(java.util.List<CreateTradeOrderResult> createTradeOrderResults) {
        this.createTradeOrderResults = createTradeOrderResults;
        return this;
    }
    public java.util.List<CreateTradeOrderResult> getCreateTradeOrderResults() {
        return this.createTradeOrderResults;
    }

}
