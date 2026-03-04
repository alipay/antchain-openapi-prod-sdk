// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAgentFinancialRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险等级
    @NameInMap("risk_level")
    public String riskLevel;

    // 风险建议动作
    @NameInMap("suggested_action")
    public String suggestedAction;

    // 风险分
    @NameInMap("risk_score")
    public Long riskScore;

    // 风险因子列表
    @NameInMap("riskfactors")
    public RiskFactorDetail riskfactors;

    // 处置建议
    @NameInMap("recommendations")
    public String recommendations;

    public static QueryAgentFinancialRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentFinancialRiskResponse self = new QueryAgentFinancialRiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgentFinancialRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAgentFinancialRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAgentFinancialRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAgentFinancialRiskResponse setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public QueryAgentFinancialRiskResponse setSuggestedAction(String suggestedAction) {
        this.suggestedAction = suggestedAction;
        return this;
    }
    public String getSuggestedAction() {
        return this.suggestedAction;
    }

    public QueryAgentFinancialRiskResponse setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public QueryAgentFinancialRiskResponse setRiskfactors(RiskFactorDetail riskfactors) {
        this.riskfactors = riskfactors;
        return this;
    }
    public RiskFactorDetail getRiskfactors() {
        return this.riskfactors;
    }

    public QueryAgentFinancialRiskResponse setRecommendations(String recommendations) {
        this.recommendations = recommendations;
        return this;
    }
    public String getRecommendations() {
        return this.recommendations;
    }

}
