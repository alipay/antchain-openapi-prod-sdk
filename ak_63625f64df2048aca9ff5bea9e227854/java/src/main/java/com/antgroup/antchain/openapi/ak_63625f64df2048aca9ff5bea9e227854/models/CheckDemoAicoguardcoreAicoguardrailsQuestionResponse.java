// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class CheckDemoAicoguardcoreAicoguardrailsQuestionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否安全无风险 true：安全无风险 false：有风险
    @NameInMap("safe")
    public Boolean safe;

    // 安全动作 BLOCK：拦截  SECURITY_ANSWER：安全代答  SECURITY_PROMPT：安全提示增强
    @NameInMap("action_code")
    public String actionCode;

    // 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
    @NameInMap("action_msg")
    public String actionMsg;

    // 会话动作. END_SESSION：终止会话.  RECALL_QUERY：撤回提问
    @NameInMap("session_action")
    public String sessionAction;

    public static CheckDemoAicoguardcoreAicoguardrailsQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDemoAicoguardcoreAicoguardrailsQuestionResponse self = new CheckDemoAicoguardcoreAicoguardrailsQuestionResponse();
        return TeaModel.build(map, self);
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionResponse setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }
    public Boolean getSafe() {
        return this.safe;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionResponse setActionMsg(String actionMsg) {
        this.actionMsg = actionMsg;
        return this;
    }
    public String getActionMsg() {
        return this.actionMsg;
    }

    public CheckDemoAicoguardcoreAicoguardrailsQuestionResponse setSessionAction(String sessionAction) {
        this.sessionAction = sessionAction;
        return this;
    }
    public String getSessionAction() {
        return this.sessionAction;
    }

}
