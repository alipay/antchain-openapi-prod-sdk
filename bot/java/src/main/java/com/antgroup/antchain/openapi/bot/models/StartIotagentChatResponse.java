// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartIotagentChatResponse extends TeaModel {
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

    public static StartIotagentChatResponse build(java.util.Map<String, ?> map) throws Exception {
        StartIotagentChatResponse self = new StartIotagentChatResponse();
        return TeaModel.build(map, self);
    }

    public StartIotagentChatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartIotagentChatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartIotagentChatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartIotagentChatResponse setChatCompletionObject(String chatCompletionObject) {
        this.chatCompletionObject = chatCompletionObject;
        return this;
    }
    public String getChatCompletionObject() {
        return this.chatCompletionObject;
    }

}
