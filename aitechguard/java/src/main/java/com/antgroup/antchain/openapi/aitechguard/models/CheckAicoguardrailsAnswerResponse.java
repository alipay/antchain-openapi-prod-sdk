// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitechguard.models;

import com.aliyun.tea.*;

public class CheckAicoguardrailsAnswerResponse extends TeaModel {
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

    public static CheckAicoguardrailsAnswerResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAicoguardrailsAnswerResponse self = new CheckAicoguardrailsAnswerResponse();
        return TeaModel.build(map, self);
    }

    public CheckAicoguardrailsAnswerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckAicoguardrailsAnswerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckAicoguardrailsAnswerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckAicoguardrailsAnswerResponse setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CheckAicoguardrailsAnswerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAicoguardrailsAnswerResponse setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }
    public Boolean getSafe() {
        return this.safe;
    }

    public CheckAicoguardrailsAnswerResponse setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
        return this;
    }
    public String getRiskCategory() {
        return this.riskCategory;
    }

    public CheckAicoguardrailsAnswerResponse setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel;
        return this;
    }
    public String getRiskLabel() {
        return this.riskLabel;
    }

    public CheckAicoguardrailsAnswerResponse setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public CheckAicoguardrailsAnswerResponse setRiskWords(java.util.List<String> riskWords) {
        this.riskWords = riskWords;
        return this;
    }
    public java.util.List<String> getRiskWords() {
        return this.riskWords;
    }

    public CheckAicoguardrailsAnswerResponse setRiskWordsIndex(java.util.List<String> riskWordsIndex) {
        this.riskWordsIndex = riskWordsIndex;
        return this;
    }
    public java.util.List<String> getRiskWordsIndex() {
        return this.riskWordsIndex;
    }

}
