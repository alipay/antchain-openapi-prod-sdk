// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class CaptureSaasPaymentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付请款结果
    // 
    @NameInMap("data")
    public PaymentCaptureResult data;

    public static CaptureSaasPaymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CaptureSaasPaymentResponse self = new CaptureSaasPaymentResponse();
        return TeaModel.build(map, self);
    }

    public CaptureSaasPaymentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CaptureSaasPaymentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CaptureSaasPaymentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CaptureSaasPaymentResponse setData(PaymentCaptureResult data) {
        this.data = data;
        return this;
    }
    public PaymentCaptureResult getData() {
        return this.data;
    }

}
