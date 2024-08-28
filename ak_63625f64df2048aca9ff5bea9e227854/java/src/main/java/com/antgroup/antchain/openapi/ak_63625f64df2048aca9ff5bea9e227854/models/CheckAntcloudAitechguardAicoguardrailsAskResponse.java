// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_63625f64df2048aca9ff5bea9e227854.models;

import com.aliyun.tea.*;

public class CheckAntcloudAitechguardAicoguardrailsAskResponse extends TeaModel {
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

    // 是否安全无风险. true：安全无风险. false：有风险
    @NameInMap("safe")
    public Boolean safe;

    // 安全动作
    // 提问场景
    //    BLOCK：拦截
    //    SECURITY_ANSWER：安全代答
    //    SECURITY_PROMPT：安全提示增强
    @NameInMap("action_code")
    public String actionCode;

    // 安全代答的回答
    @NameInMap("security_answer")
    public String securityAnswer;

    // 有安全风险时的提问改写
    @NameInMap("security_prompt")
    public String securityPrompt;

    // 有风险时的风险标签
    @NameInMap("risk_label")
    public String riskLabel;

    // 会话动作
    //    END_SESSION：终止会话
    //    RECALL_QUERY：撤回提问
    @NameInMap("session_action")
    public String sessionAction;

    public static CheckAntcloudAitechguardAicoguardrailsAskResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAntcloudAitechguardAicoguardrailsAskResponse self = new CheckAntcloudAitechguardAicoguardrailsAskResponse();
        return TeaModel.build(map, self);
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }
    public Boolean getSafe() {
        return this.safe;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
        return this;
    }
    public String getSecurityAnswer() {
        return this.securityAnswer;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setSecurityPrompt(String securityPrompt) {
        this.securityPrompt = securityPrompt;
        return this;
    }
    public String getSecurityPrompt() {
        return this.securityPrompt;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel;
        return this;
    }
    public String getRiskLabel() {
        return this.riskLabel;
    }

    public CheckAntcloudAitechguardAicoguardrailsAskResponse setSessionAction(String sessionAction) {
        this.sessionAction = sessionAction;
        return this;
    }
    public String getSessionAction() {
        return this.sessionAction;
    }

}
