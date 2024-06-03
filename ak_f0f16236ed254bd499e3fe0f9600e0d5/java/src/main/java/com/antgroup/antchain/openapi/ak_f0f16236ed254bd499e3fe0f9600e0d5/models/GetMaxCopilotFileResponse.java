// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f0f16236ed254bd499e3fe0f9600e0d5.models;

import com.aliyun.tea.*;

public class GetMaxCopilotFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 问题回答
    @NameInMap("answer")
    public String answer;

    public static GetMaxCopilotFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaxCopilotFileResponse self = new GetMaxCopilotFileResponse();
        return TeaModel.build(map, self);
    }

    public GetMaxCopilotFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetMaxCopilotFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMaxCopilotFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetMaxCopilotFileResponse setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

}
