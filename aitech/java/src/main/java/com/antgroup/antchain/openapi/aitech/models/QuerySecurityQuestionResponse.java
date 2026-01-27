// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityQuestionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
    @NameInMap("action_code")
    public String actionCode;

    // 命中的自定义黑词列表
    @NameInMap("customize_risk_word")
    public java.util.List<String> customizeRiskWord;

    // 风险标签
    @NameInMap("labels")
    public java.util.List<LabelModel> labels;

    // 会话Id
    @NameInMap("session_id")
    public String sessionId;

    // 表示是同一个Q&A
    @NameInMap("message_id")
    public String messageId;

    // 兜底话术
    @NameInMap("limit_answer")
    public String limitAnswer;

    // 有风险时的安全代答
    @NameInMap("security_answer")
    public String securityAnswer;

    // 当请求参数 promptReword=Y 时返回，为安全改写后的内容
    @NameInMap("security_prompt")
    public String securityPrompt;

    // 提示词攻击手法标签
    @NameInMap("attack_labels")
    public AttackLabel attackLabels;

    // 领域标签信息
    @NameInMap("field_info")
    public FieldModel fieldInfo;

    public static QuerySecurityQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityQuestionResponse self = new QuerySecurityQuestionResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityQuestionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySecurityQuestionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySecurityQuestionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySecurityQuestionResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public QuerySecurityQuestionResponse setCustomizeRiskWord(java.util.List<String> customizeRiskWord) {
        this.customizeRiskWord = customizeRiskWord;
        return this;
    }
    public java.util.List<String> getCustomizeRiskWord() {
        return this.customizeRiskWord;
    }

    public QuerySecurityQuestionResponse setLabels(java.util.List<LabelModel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<LabelModel> getLabels() {
        return this.labels;
    }

    public QuerySecurityQuestionResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public QuerySecurityQuestionResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySecurityQuestionResponse setLimitAnswer(String limitAnswer) {
        this.limitAnswer = limitAnswer;
        return this;
    }
    public String getLimitAnswer() {
        return this.limitAnswer;
    }

    public QuerySecurityQuestionResponse setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
        return this;
    }
    public String getSecurityAnswer() {
        return this.securityAnswer;
    }

    public QuerySecurityQuestionResponse setSecurityPrompt(String securityPrompt) {
        this.securityPrompt = securityPrompt;
        return this;
    }
    public String getSecurityPrompt() {
        return this.securityPrompt;
    }

    public QuerySecurityQuestionResponse setAttackLabels(AttackLabel attackLabels) {
        this.attackLabels = attackLabels;
        return this;
    }
    public AttackLabel getAttackLabels() {
        return this.attackLabels;
    }

    public QuerySecurityQuestionResponse setFieldInfo(FieldModel fieldInfo) {
        this.fieldInfo = fieldInfo;
        return this;
    }
    public FieldModel getFieldInfo() {
        return this.fieldInfo;
    }

}
