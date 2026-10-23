// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityTextdetoxificationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否安全无风险
    @NameInMap("safe")
    public Boolean safe;

    // 一级风险分类
    @NameInMap("risk_category")
    public String riskCategory;

    // 二级风险明细分类
    @NameInMap("risk_label")
    public String riskLabel;

    // 风险分数
    @NameInMap("risk_score")
    public Long riskScore;

    // 风险关键词列表
    @NameInMap("risk_words")
    public java.util.List<String> riskWords;

    // 关键词索引
    @NameInMap("risk_words_index")
    public java.util.List<String> riskWordsIndex;

    public static QuerySecurityTextdetoxificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityTextdetoxificationResponse self = new QuerySecurityTextdetoxificationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityTextdetoxificationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySecurityTextdetoxificationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySecurityTextdetoxificationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySecurityTextdetoxificationResponse setSafe(Boolean safe) {
        this.safe = safe;
        return this;
    }
    public Boolean getSafe() {
        return this.safe;
    }

    public QuerySecurityTextdetoxificationResponse setRiskCategory(String riskCategory) {
        this.riskCategory = riskCategory;
        return this;
    }
    public String getRiskCategory() {
        return this.riskCategory;
    }

    public QuerySecurityTextdetoxificationResponse setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel;
        return this;
    }
    public String getRiskLabel() {
        return this.riskLabel;
    }

    public QuerySecurityTextdetoxificationResponse setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public QuerySecurityTextdetoxificationResponse setRiskWords(java.util.List<String> riskWords) {
        this.riskWords = riskWords;
        return this;
    }
    public java.util.List<String> getRiskWords() {
        return this.riskWords;
    }

    public QuerySecurityTextdetoxificationResponse setRiskWordsIndex(java.util.List<String> riskWordsIndex) {
        this.riskWordsIndex = riskWordsIndex;
        return this;
    }
    public java.util.List<String> getRiskWordsIndex() {
        return this.riskWordsIndex;
    }

}
