// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryCreativeResultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话ID
    @NameInMap("session_id")
    public String sessionId;

    // 消息ID
    @NameInMap("message_id")
    public String messageId;

    // 消息状态
    @NameInMap("status")
    public String status;

    // 消息内容
    @NameInMap("content")
    public String content;

    // agent消息扩展信息
    @NameInMap("assistant_extra")
    public AssistantExtra assistantExtra;

    // 当前会话的 Credit 计费总数
    @NameInMap("total_credit")
    public String totalCredit;

    public static QueryCreativeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreativeResultResponse self = new QueryCreativeResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreativeResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreativeResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreativeResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreativeResultResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryCreativeResultResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QueryCreativeResultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCreativeResultResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryCreativeResultResponse setAssistantExtra(AssistantExtra assistantExtra) {
        this.assistantExtra = assistantExtra;
        return this;
    }
    public AssistantExtra getAssistantExtra() {
        return this.assistantExtra;
    }

    public QueryCreativeResultResponse setTotalCredit(String totalCredit) {
        this.totalCredit = totalCredit;
        return this;
    }
    public String getTotalCredit() {
        return this.totalCredit;
    }

}
