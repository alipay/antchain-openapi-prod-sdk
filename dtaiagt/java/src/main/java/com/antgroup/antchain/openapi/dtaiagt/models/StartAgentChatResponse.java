// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class StartAgentChatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话结果
    @NameInMap("chat_completion_object")
    public String chatCompletionObject;

    public static StartAgentChatResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAgentChatResponse self = new StartAgentChatResponse();
        return TeaModel.build(map, self);
    }

    public StartAgentChatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAgentChatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAgentChatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAgentChatResponse setChatCompletionObject(String chatCompletionObject) {
        this.chatCompletionObject = chatCompletionObject;
        return this;
    }
    public String getChatCompletionObject() {
        return this.chatCompletionObject;
    }

}
