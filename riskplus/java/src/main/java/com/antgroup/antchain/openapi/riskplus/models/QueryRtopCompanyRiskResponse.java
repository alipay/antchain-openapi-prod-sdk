// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险维度
    @NameInMap("risk_factors")
    public java.util.List<RtopCompanyRiskFactor> riskFactors;

    // 风险等级
    @NameInMap("risk_level")
    public String riskLevel;

    // 风险报文
    @NameInMap("risk_message")
    public String riskMessage;

    // 风险分数
    @NameInMap("risk_score")
    public Long riskScore;

    // 风险标签
    @NameInMap("risk_tags")
    public java.util.List<String> riskTags;

    public static QueryRtopCompanyRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyRiskResponse self = new QueryRtopCompanyRiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCompanyRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCompanyRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCompanyRiskResponse setRiskFactors(java.util.List<RtopCompanyRiskFactor> riskFactors) {
        this.riskFactors = riskFactors;
        return this;
    }
    public java.util.List<RtopCompanyRiskFactor> getRiskFactors() {
        return this.riskFactors;
    }

    public QueryRtopCompanyRiskResponse setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public QueryRtopCompanyRiskResponse setRiskMessage(String riskMessage) {
        this.riskMessage = riskMessage;
        return this;
    }
    public String getRiskMessage() {
        return this.riskMessage;
    }

    public QueryRtopCompanyRiskResponse setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public QueryRtopCompanyRiskResponse setRiskTags(java.util.List<String> riskTags) {
        this.riskTags = riskTags;
        return this;
    }
    public java.util.List<String> getRiskTags() {
        return this.riskTags;
    }

}
