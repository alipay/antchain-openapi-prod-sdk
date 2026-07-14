// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class PayInstanceBillResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付请求唯一id
    @NameInMap("pay_request_id")
    public String payRequestId;

    // paymentSession for front-end sdk integration。
    // 目前在payProductCode = ALIPAY_GLOBAL_CARD, paySceneCode = TRADE_CREATE时有效
    @NameInMap("payment_session_data")
    public String paymentSessionData;

    public static PayInstanceBillResponse build(java.util.Map<String, ?> map) throws Exception {
        PayInstanceBillResponse self = new PayInstanceBillResponse();
        return TeaModel.build(map, self);
    }

    public PayInstanceBillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PayInstanceBillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PayInstanceBillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PayInstanceBillResponse setPayRequestId(String payRequestId) {
        this.payRequestId = payRequestId;
        return this;
    }
    public String getPayRequestId() {
        return this.payRequestId;
    }

    public PayInstanceBillResponse setPaymentSessionData(String paymentSessionData) {
        this.paymentSessionData = paymentSessionData;
        return this;
    }
    public String getPaymentSessionData() {
        return this.paymentSessionData;
    }

}
