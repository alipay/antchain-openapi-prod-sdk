// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentChatCreativeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 消息ID
    @NameInMap("message_id")
    public String messageId;

    // 所属会话ID
    @NameInMap("session_id")
    public String sessionId;

    // 消息角色
    @NameInMap("role")
    public String role;

    // 消息状态
    @NameInMap("status")
    public String status;

    // 消息内容
    @NameInMap("content")
    public String content;

    // ASSISTANT消息的额外信息
    @NameInMap("assistant_extra")
    public AssistantExtra assistantExtra;

    public static ExecAntcloudMarketingagentChatCreativeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentChatCreativeResponse self = new ExecAntcloudMarketingagentChatCreativeResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecAntcloudMarketingagentChatCreativeResponse setAssistantExtra(AssistantExtra assistantExtra) {
        this.assistantExtra = assistantExtra;
        return this;
    }
    public AssistantExtra getAssistantExtra() {
        return this.assistantExtra;
    }

}
