// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SendDubbridgeSmsBatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 云通信短信发送结果
    @NameInMap("response")
    public SmsReponse response;

    public static SendDubbridgeSmsBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SendDubbridgeSmsBatchResponse self = new SendDubbridgeSmsBatchResponse();
        return TeaModel.build(map, self);
    }

    public SendDubbridgeSmsBatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendDubbridgeSmsBatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendDubbridgeSmsBatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendDubbridgeSmsBatchResponse setResponse(SmsReponse response) {
        this.response = response;
        return this;
    }
    public SmsReponse getResponse() {
        return this.response;
    }

}
