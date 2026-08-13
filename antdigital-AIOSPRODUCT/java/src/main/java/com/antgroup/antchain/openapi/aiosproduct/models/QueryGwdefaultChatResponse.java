// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class QueryGwdefaultChatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话id
    @NameInMap("session_id")
    public String sessionId;

    // 业务配置标识（必传），决定模型、策略、提示词
    @NameInMap("agent_code")
    public String agentCode;

    // 回答
    @NameInMap("answer")
    public String answer;

    // 链路id
    @NameInMap("trace_id")
    public String traceId;

    // 附加信息
    @NameInMap("metadata")
    public String metadata;

    public static QueryGwdefaultChatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGwdefaultChatResponse self = new QueryGwdefaultChatResponse();
        return TeaModel.build(map, self);
    }

    public QueryGwdefaultChatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGwdefaultChatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGwdefaultChatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGwdefaultChatResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QueryGwdefaultChatResponse setAgentCode(String agentCode) {
        this.agentCode = agentCode;
        return this;
    }
    public String getAgentCode() {
        return this.agentCode;
    }

    public QueryGwdefaultChatResponse setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public QueryGwdefaultChatResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryGwdefaultChatResponse setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

}
