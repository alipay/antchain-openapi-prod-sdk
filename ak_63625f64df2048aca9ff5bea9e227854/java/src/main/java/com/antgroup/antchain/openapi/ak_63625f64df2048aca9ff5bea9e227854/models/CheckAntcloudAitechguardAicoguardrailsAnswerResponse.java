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

    // 风险一级分类标签
    @NameInMap("risk_category")
    public String riskCategory;

    // 风险二级分类标签
    @NameInMap("risk_label")
    public String riskLabel;

    // 风险等级分数，百分之，分数越高风险等级越高
    @NameInMap("risk_score")
    public Long riskScore;

    // 风险关键词列表
    @NameInMap("risk_words")
    public java.util.List<String> riskWords;

    // 风险关键词位置，逗号分割左右下标，左闭右开区间
    @NameInMap("risk_words_index")
    public java.util.List<String> riskWordsIndex;

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

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
        return this;
    }
    public String getRiskCategory() {
        return this.riskCategory;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel;
        return this;
    }
    public String getRiskLabel() {
        return this.riskLabel;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setRiskWords(java.util.List<String> riskWords) {
        this.riskWords = riskWords;
        return this;
    }
    public java.util.List<String> getRiskWords() {
        return this.riskWords;
    }

    public CheckAntcloudAitechguardAicoguardrailsAnswerResponse setRiskWordsIndex(java.util.List<String> riskWordsIndex) {
        this.riskWordsIndex = riskWordsIndex;
        return this;
    }
    public java.util.List<String> getRiskWordsIndex() {
        return this.riskWordsIndex;
    }

}
