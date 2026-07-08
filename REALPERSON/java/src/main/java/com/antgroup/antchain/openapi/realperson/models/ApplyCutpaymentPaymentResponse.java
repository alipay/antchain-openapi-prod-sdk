// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ApplyCutpaymentPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功金额,整数，单位:分
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

    public static ApplyCutpaymentPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCutpaymentPaymentResponse self = new ApplyCutpaymentPaymentResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCutpaymentPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyCutpaymentPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyCutpaymentPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyCutpaymentPaymentResponse setSuccAmt(String succAmt) {
        this.succAmt = succAmt;
        return this;
    }
    public String getSuccAmt() {
        return this.succAmt;
    }

    public ApplyCutpaymentPaymentResponse setSuccTime(String succTime) {
        this.succTime = succTime;
        return this;
    }
    public String getSuccTime() {
        return this.succTime;
    }

    public ApplyCutpaymentPaymentResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ApplyCutpaymentPaymentResponse setTransId(String transId) {
        this.transId = transId;
        return this;
    }
    public String getTransId() {
        return this.transId;
    }

}
