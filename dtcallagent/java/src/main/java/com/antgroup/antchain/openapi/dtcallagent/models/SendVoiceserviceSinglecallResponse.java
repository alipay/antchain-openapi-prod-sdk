// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtcallagent.models;

import com.aliyun.tea.*;

public class SendVoiceserviceSinglecallResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求状态码。
    // 返回 OK 代表请求成功。
    // 其他错误码，请参考API错误码
    @NameInMap("code")
    public String code;

    // 状态码的描述。
    @NameInMap("message")
    public String message;

    // 请求 ID
    @NameInMap("request_id")
    public String requestId;

    // 此次通话的唯一回执 ID。
    // 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
    @NameInMap("call_id")
    public String callId;

    public static SendVoiceserviceSinglecallResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVoiceserviceSinglecallResponse self = new SendVoiceserviceSinglecallResponse();
        return TeaModel.build(map, self);
    }

    public SendVoiceserviceSinglecallResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendVoiceserviceSinglecallResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendVoiceserviceSinglecallResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendVoiceserviceSinglecallResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendVoiceserviceSinglecallResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendVoiceserviceSinglecallResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendVoiceserviceSinglecallResponse setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

}
