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

    // 安全代答匹配到的Q
    @NameInMap("match_q")
    public String matchQ;

    // 越狱手法标签
    @NameInMap("jailbreak_label")
    public String jailbreakLabel;

    // universal模型请求参数
    @NameInMap("universal_prompt")
    public String universalPrompt;

    // universal模型返回结果
    @NameInMap("universal_output")
    public String universalOutput;

    // 金融V3模型请求参数
    @NameInMap("finance_prompt")
    public String financePrompt;

    // 金融V3模型返回结果
    @NameInMap("finance_output")
    public String financeOutput;

    // 策略版本号
    @NameInMap("strategy_version")
    public String strategyVersion;

    // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
    @NameInMap("token_usage")
    public TokenUsageSummary tokenUsage;

    // 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构）
    //  对应的结果为Map转化的JSON字符串
    @NameInMap("debug_info")
    public String debugInfo;

    // 金融合规深度审核——命中的风险点列表（JSON 数组字符串；仅深审开时返回，非深审场景不输出）
    @NameInMap("findeepdive_result")
    public String findeepdiveResult;

    // 金融合规深度审核——整体结论（block/warning/pass；仅深审开时返回）
    @NameInMap("fin_deep_dive_overall")
    public String finDeepDiveOverall;

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

    public QuerySecurityQuestionResponse setMatchQ(String matchQ) {
        this.matchQ = matchQ;
        return this;
    }
    public String getMatchQ() {
        return this.matchQ;
    }

    public QuerySecurityQuestionResponse setJailbreakLabel(String jailbreakLabel) {
        this.jailbreakLabel = jailbreakLabel;
        return this;
    }
    public String getJailbreakLabel() {
        return this.jailbreakLabel;
    }

    public QuerySecurityQuestionResponse setUniversalPrompt(String universalPrompt) {
        this.universalPrompt = universalPrompt;
        return this;
    }
    public String getUniversalPrompt() {
        return this.universalPrompt;
    }

    public QuerySecurityQuestionResponse setUniversalOutput(String universalOutput) {
        this.universalOutput = universalOutput;
        return this;
    }
    public String getUniversalOutput() {
        return this.universalOutput;
    }

    public QuerySecurityQuestionResponse setFinancePrompt(String financePrompt) {
        this.financePrompt = financePrompt;
        return this;
    }
    public String getFinancePrompt() {
        return this.financePrompt;
    }

    public QuerySecurityQuestionResponse setFinanceOutput(String financeOutput) {
        this.financeOutput = financeOutput;
        return this;
    }
    public String getFinanceOutput() {
        return this.financeOutput;
    }

    public QuerySecurityQuestionResponse setStrategyVersion(String strategyVersion) {
        this.strategyVersion = strategyVersion;
        return this;
    }
    public String getStrategyVersion() {
        return this.strategyVersion;
    }

    public QuerySecurityQuestionResponse setTokenUsage(TokenUsageSummary tokenUsage) {
        this.tokenUsage = tokenUsage;
        return this;
    }
    public TokenUsageSummary getTokenUsage() {
        return this.tokenUsage;
    }

    public QuerySecurityQuestionResponse setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
        return this;
    }
    public String getDebugInfo() {
        return this.debugInfo;
    }

    public QuerySecurityQuestionResponse setFindeepdiveResult(String findeepdiveResult) {
        this.findeepdiveResult = findeepdiveResult;
        return this;
    }
    public String getFindeepdiveResult() {
        return this.findeepdiveResult;
    }

    public QuerySecurityQuestionResponse setFinDeepDiveOverall(String finDeepDiveOverall) {
        this.finDeepDiveOverall = finDeepDiveOverall;
        return this;
    }
    public String getFinDeepDiveOverall() {
        return this.finDeepDiveOverall;
    }

}
