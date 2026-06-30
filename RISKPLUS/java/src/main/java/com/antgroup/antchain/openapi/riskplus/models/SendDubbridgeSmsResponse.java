// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendDubbridgeSmsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 云通信发送结果
    @NameInMap("response")
    public SmsReponse response;

    public static SendDubbridgeSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendDubbridgeSmsResponse self = new SendDubbridgeSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendDubbridgeSmsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendDubbridgeSmsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendDubbridgeSmsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendDubbridgeSmsResponse setResponse(SmsReponse response) {
        this.response = response;
        return this;
    }
    public SmsReponse getResponse() {
        return this.response;
    }

}
