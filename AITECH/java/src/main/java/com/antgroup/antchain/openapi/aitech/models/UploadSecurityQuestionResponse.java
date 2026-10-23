// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityQuestionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // PASS/BLOCK/SECURITY_ANSWER/SECURITY_WARNING
    @NameInMap("action_code")
    public String actionCode;

    // 风险标签（label + subLabels[]：subLabel/riskWords/riskWordsIndex/thirdLabels）
    @NameInMap("labels")
    public java.util.List<LabelModel> labels;

    // 命中自定义风险词
    @NameInMap("customize_risk_word")
    public java.util.List<String> customizeRiskWord;

    // 拒答话术
    @NameInMap("limit_answer")
    public String limitAnswer;

    // 回传消息 ID
    @NameInMap("message_id")
    public String messageId;

    // 知识库匹配提问
    @NameInMap("match_q")
    public String matchQ;

    // 安全代答内容
    @NameInMap("security_answer")
    public String securityAnswer;

    // 安全提示
    @NameInMap("security_prompt")
    public String securityPrompt;

    // 越狱标签（旧字段）
    @NameInMap("jailbreak_label")
    public String jailbreakLabel;

    // 攻击标签（attackLabel + attackSubLabels[]）
    @NameInMap("attack_labels")
    public java.util.List<AttackLabelModel> attackLabels;

    // 领域识别（fieldCategory/fieldLabel/fieldScore:Double）
    @NameInMap("field_info")
    public FieldModel fieldInfo;

    // 回传会话 ID
    @NameInMap("session_id")
    public String sessionId;

    // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
    @NameInMap("token_usage")
    public TokenUsageSummary tokenUsage;

    // ASR 转写文本（文本链路恒 null）
    @NameInMap("transcribed_text")
    public String transcribedText;

    // 调试信息（当前链路无填充，恒 null）
    @NameInMap("debug_info")
    public String debugInfo;

    // 金融深挖结果
    @NameInMap("findeepdive_result")
    public String findeepdiveResult;

    // 金融深挖总览
    @NameInMap("fin_deep_dive_overall")
    public String finDeepDiveOverall;

    // Universal 调试-提示词
    @NameInMap("universal_prompt")
    public String universalPrompt;

    // Universal 调试-输出
    @NameInMap("universal_output")
    public String universalOutput;

    // 金融调试-提示词
    @NameInMap("finance_prompt")
    public String financePrompt;

    // 金融调试-输出
    @NameInMap("finance_output")
    public String financeOutput;

    // 策略版本
    @NameInMap("strategy_version")
    public String strategyVersion;

    public static UploadSecurityQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityQuestionResponse self = new UploadSecurityQuestionResponse();
        return TeaModel.build(map, self);
    }

    public UploadSecurityQuestionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadSecurityQuestionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadSecurityQuestionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadSecurityQuestionResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public UploadSecurityQuestionResponse setLabels(java.util.List<LabelModel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<LabelModel> getLabels() {
        return this.labels;
    }

    public UploadSecurityQuestionResponse setCustomizeRiskWord(java.util.List<String> customizeRiskWord) {
        this.customizeRiskWord = customizeRiskWord;
        return this;
    }
    public java.util.List<String> getCustomizeRiskWord() {
        return this.customizeRiskWord;
    }

    public UploadSecurityQuestionResponse setLimitAnswer(String limitAnswer) {
        this.limitAnswer = limitAnswer;
        return this;
    }
    public String getLimitAnswer() {
        return this.limitAnswer;
    }

    public UploadSecurityQuestionResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public UploadSecurityQuestionResponse setMatchQ(String matchQ) {
        this.matchQ = matchQ;
        return this;
    }
    public String getMatchQ() {
        return this.matchQ;
    }

    public UploadSecurityQuestionResponse setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
        return this;
    }
    public String getSecurityAnswer() {
        return this.securityAnswer;
    }

    public UploadSecurityQuestionResponse setSecurityPrompt(String securityPrompt) {
        this.securityPrompt = securityPrompt;
        return this;
    }
    public String getSecurityPrompt() {
        return this.securityPrompt;
    }

    public UploadSecurityQuestionResponse setJailbreakLabel(String jailbreakLabel) {
        this.jailbreakLabel = jailbreakLabel;
        return this;
    }
    public String getJailbreakLabel() {
        return this.jailbreakLabel;
    }

    public UploadSecurityQuestionResponse setAttackLabels(java.util.List<AttackLabelModel> attackLabels) {
        this.attackLabels = attackLabels;
        return this;
    }
    public java.util.List<AttackLabelModel> getAttackLabels() {
        return this.attackLabels;
    }

    public UploadSecurityQuestionResponse setFieldInfo(FieldModel fieldInfo) {
        this.fieldInfo = fieldInfo;
        return this;
    }
    public FieldModel getFieldInfo() {
        return this.fieldInfo;
    }

    public UploadSecurityQuestionResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public UploadSecurityQuestionResponse setTokenUsage(TokenUsageSummary tokenUsage) {
        this.tokenUsage = tokenUsage;
        return this;
    }
    public TokenUsageSummary getTokenUsage() {
        return this.tokenUsage;
    }

    public UploadSecurityQuestionResponse setTranscribedText(String transcribedText) {
        this.transcribedText = transcribedText;
        return this;
    }
    public String getTranscribedText() {
        return this.transcribedText;
    }

    public UploadSecurityQuestionResponse setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
        return this;
    }
    public String getDebugInfo() {
        return this.debugInfo;
    }

    public UploadSecurityQuestionResponse setFindeepdiveResult(String findeepdiveResult) {
        this.findeepdiveResult = findeepdiveResult;
        return this;
    }
    public String getFindeepdiveResult() {
        return this.findeepdiveResult;
    }

    public UploadSecurityQuestionResponse setFinDeepDiveOverall(String finDeepDiveOverall) {
        this.finDeepDiveOverall = finDeepDiveOverall;
        return this;
    }
    public String getFinDeepDiveOverall() {
        return this.finDeepDiveOverall;
    }

    public UploadSecurityQuestionResponse setUniversalPrompt(String universalPrompt) {
        this.universalPrompt = universalPrompt;
        return this;
    }
    public String getUniversalPrompt() {
        return this.universalPrompt;
    }

    public UploadSecurityQuestionResponse setUniversalOutput(String universalOutput) {
        this.universalOutput = universalOutput;
        return this;
    }
    public String getUniversalOutput() {
        return this.universalOutput;
    }

    public UploadSecurityQuestionResponse setFinancePrompt(String financePrompt) {
        this.financePrompt = financePrompt;
        return this;
    }
    public String getFinancePrompt() {
        return this.financePrompt;
    }

    public UploadSecurityQuestionResponse setFinanceOutput(String financeOutput) {
        this.financeOutput = financeOutput;
        return this;
    }
    public String getFinanceOutput() {
        return this.financeOutput;
    }

    public UploadSecurityQuestionResponse setStrategyVersion(String strategyVersion) {
        this.strategyVersion = strategyVersion;
        return this;
    }
    public String getStrategyVersion() {
        return this.strategyVersion;
    }

}
