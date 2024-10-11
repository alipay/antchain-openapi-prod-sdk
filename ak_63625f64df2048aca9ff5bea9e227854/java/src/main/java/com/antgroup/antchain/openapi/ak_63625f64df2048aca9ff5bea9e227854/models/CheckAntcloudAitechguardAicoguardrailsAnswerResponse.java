// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class CheckAntcloudAitechguardAicoguardrailsAnswerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 会话ID，用于匹配多轮对话上下文
    @NameInMap("session_id")
    public String sessionId;

    // 唯一定位一个问答对
    @NameInMap("request_id")
    public String requestId;

    // 是否安全无风险
    @NameInMap("safe")
    public Boolean safe;

    // 有风险时的安全动作, BLOCK: 拦截; SECURITY_ANSWER:安全代答;SECURITY_PROMPT:安全提示增强
    @NameInMap("action_code")
    public String actionCode;

    // 会话动作
    // END_SESSION：终止会话
    // RECALL_QUERY：撤回提问
    @NameInMap("session_action")
    public String sessionAction;

    // 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
    @NameInMap("action_msg")
    public String actionMsg;

    public static CheckAntcloudAitechguardAicoguardrailsAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAntcloudAitechguardAicoguardrailsAnswerResponse self = new CheckAntcloudAitechguardAicoguardrailsAnswerResponse();
        return TeaModel.build(map, self);
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }
    public Boolean getSafe() {
        return this.safe;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setSessionAction(String sessionAction) {
        this.sessionAction = sessionAction;
        return this;
    }
    public String getSessionAction() {
        return this.sessionAction;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setActionMsg(String actionMsg) {
        this.actionMsg = actionMsg;
        return this;
    }
    public String getActionMsg() {
        return this.actionMsg;
    }

}
