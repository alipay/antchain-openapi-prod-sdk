// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UploadSecurityAnswerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 四种动作码
    @NameInMap("action_code")
    public String actionCode;

    // 风险标签
    @NameInMap("labels")
    public java.util.List<LabelModel> labels;

    // 命中自定义风险词
    @NameInMap("customize_risk_word")
    public java.util.List<String> customizeRiskWord;

    // 拒答话术
    @NameInMap("limit_answer")
    public String limitAnswer;

    // 回传
    @NameInMap("message_id")
    public String messageId;

    // 回传
    @NameInMap("flow_msg_id")
    public String flowMsgId;

    // 脱敏后内容
    @NameInMap("obfuscation_data")
    public String obfuscationData;

    // 流式处理状态（终态 done）
    @NameInMap("flow_process_state")
    public String flowProcessState;

    // 调试字段
    @NameInMap("universal_prompt")
    public String universalPrompt;

    // 调试字段
    @NameInMap("universal_output")
    public String universalOutput;

    // 调试字段
    @NameInMap("finance_prompt")
    public String financePrompt;

    // 调试字段
    @NameInMap("finance_output")
    public String financeOutput;

    // 策略版本
    @NameInMap("strategy_version")
    public String strategyVersion;

    // token 用量
    @NameInMap("token_usage")
    public TokenUsageSummary tokenUsage;

    // 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构）
    @NameInMap("debug_info")
    public String debugInfo;

    // ASR 转写文本（文本链路恒 null）
    @NameInMap("transcribed_text")
    public String transcribedText;

    // 金融深挖结果
    @NameInMap("findeepdive_result")
    public String findeepdiveResult;

    // 金融深挖总览
    @NameInMap("fin_deep_dive_overall")
    public String finDeepDiveOverall;

    public static UploadSecurityAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSecurityAnswerResponse self = new UploadSecurityAnswerResponse();
        return TeaModel.build(map, self);
    }

    public UploadSecurityAnswerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadSecurityAnswerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadSecurityAnswerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadSecurityAnswerResponse setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public UploadSecurityAnswerResponse setLabels(java.util.List<LabelModel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<LabelModel> getLabels() {
        return this.labels;
    }

    public UploadSecurityAnswerResponse setCustomizeRiskWord(java.util.List<String> customizeRiskWord) {
        this.customizeRiskWord = customizeRiskWord;
        return this;
    }
    public java.util.List<String> getCustomizeRiskWord() {
        return this.customizeRiskWord;
    }

    public UploadSecurityAnswerResponse setLimitAnswer(String limitAnswer) {
        this.limitAnswer = limitAnswer;
        return this;
    }
    public String getLimitAnswer() {
        return this.limitAnswer;
    }

    public UploadSecurityAnswerResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public UploadSecurityAnswerResponse setFlowMsgId(String flowMsgId) {
        this.flowMsgId = flowMsgId;
        return this;
    }
    public String getFlowMsgId() {
        return this.flowMsgId;
    }

    public UploadSecurityAnswerResponse setObfuscationData(String obfuscationData) {
        this.obfuscationData = obfuscationData;
        return this;
    }
    public String getObfuscationData() {
        return this.obfuscationData;
    }

    public UploadSecurityAnswerResponse setFlowProcessState(String flowProcessState) {
        this.flowProcessState = flowProcessState;
        return this;
    }
    public String getFlowProcessState() {
        return this.flowProcessState;
    }

    public UploadSecurityAnswerResponse setUniversalPrompt(String universalPrompt) {
        this.universalPrompt = universalPrompt;
        return this;
    }
    public String getUniversalPrompt() {
        return this.universalPrompt;
    }

    public UploadSecurityAnswerResponse setUniversalOutput(String universalOutput) {
        this.universalOutput = universalOutput;
        return this;
    }
    public String getUniversalOutput() {
        return this.universalOutput;
    }

    public UploadSecurityAnswerResponse setFinancePrompt(String financePrompt) {
        this.financePrompt = financePrompt;
        return this;
    }
    public String getFinancePrompt() {
        return this.financePrompt;
    }

    public UploadSecurityAnswerResponse setFinanceOutput(String financeOutput) {
        this.financeOutput = financeOutput;
        return this;
    }
    public String getFinanceOutput() {
        return this.financeOutput;
    }

    public UploadSecurityAnswerResponse setStrategyVersion(String strategyVersion) {
        this.strategyVersion = strategyVersion;
        return this;
    }
    public String getStrategyVersion() {
        return this.strategyVersion;
    }

    public UploadSecurityAnswerResponse setTokenUsage(TokenUsageSummary tokenUsage) {
        this.tokenUsage = tokenUsage;
        return this;
    }
    public TokenUsageSummary getTokenUsage() {
        return this.tokenUsage;
    }

    public UploadSecurityAnswerResponse setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
        return this;
    }
    public String getDebugInfo() {
        return this.debugInfo;
    }

    public UploadSecurityAnswerResponse setTranscribedText(String transcribedText) {
        this.transcribedText = transcribedText;
        return this;
    }
    public String getTranscribedText() {
        return this.transcribedText;
    }

    public UploadSecurityAnswerResponse setFindeepdiveResult(String findeepdiveResult) {
        this.findeepdiveResult = findeepdiveResult;
        return this;
    }
    public String getFindeepdiveResult() {
        return this.findeepdiveResult;
    }

    public UploadSecurityAnswerResponse setFinDeepDiveOverall(String finDeepDiveOverall) {
        this.finDeepDiveOverall = finDeepDiveOverall;
        return this;
    }
    public String getFinDeepDiveOverall() {
        return this.finDeepDiveOverall;
    }

}
