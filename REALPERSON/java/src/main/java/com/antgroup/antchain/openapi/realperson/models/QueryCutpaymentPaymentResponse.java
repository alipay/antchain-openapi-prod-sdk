// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功金额，整数，单位:分
    @NameInMap("succ_amt")
    public String succAmt;

    // 支付成功时间，yyyy-MM-dd HH:mm:ss
    @NameInMap("succ_time")
    public String succTime;

    // 平台订单号
    @NameInMap("order_id")
    public String orderId;

    // 商户订单号
    @NameInMap("trans_id")
    public String transId;

    // 订单状态
    @NameInMap("order_state")
    public String orderState;

    // 分账状态
    @NameInMap("share_state")
    public String shareState;

    public static QueryCutpaymentPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentPaymentResponse self = new QueryCutpaymentPaymentResponse();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCutpaymentPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCutpaymentPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCutpaymentPaymentResponse setSuccAmt(String succAmt) {
        this.succAmt = succAmt;
        return this;
    }
    public String getSuccAmt() {
        return this.succAmt;
    }

    public QueryCutpaymentPaymentResponse setSuccTime(String succTime) {
        this.succTime = succTime;
        return this;
    }
    public String getSuccTime() {
        return this.succTime;
    }

    public QueryCutpaymentPaymentResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryCutpaymentPaymentResponse setTransId(String transId) {
        this.transId = transId;
        return this;
    }
    public String getTransId() {
        return this.transId;
    }

    public QueryCutpaymentPaymentResponse setOrderState(String orderState) {
        this.orderState = orderState;
        return this;
    }
    public String getOrderState() {
        return this.orderState;
    }

    public QueryCutpaymentPaymentResponse setShareState(String shareState) {
        this.shareState = shareState;
        return this;
    }
    public String getShareState() {
        return this.shareState;
    }

}
