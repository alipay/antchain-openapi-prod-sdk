// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetRtopCompanyDetailResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 风险维度特征
    @NameInMap("risk_features")
    public String riskFeatures;

    // 风险分数
    @NameInMap("risk_score")
    public Long riskScore;

    // 风险标签列表
    @NameInMap("risk_tags")
    public java.util.List<RtopRiskTag> riskTags;

    public static GetRtopCompanyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRtopCompanyDetailResponse self = new GetRtopCompanyDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetRtopCompanyDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRtopCompanyDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRtopCompanyDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRtopCompanyDetailResponse setRiskFeatures(String riskFeatures) {
        this.riskFeatures = riskFeatures;
        return this;
    }
    public String getRiskFeatures() {
        return this.riskFeatures;
    }

    public GetRtopCompanyDetailResponse setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public GetRtopCompanyDetailResponse setRiskTags(java.util.List<RtopRiskTag> riskTags) {
        this.riskTags = riskTags;
        return this;
    }
    public java.util.List<RtopRiskTag> getRiskTags() {
        return this.riskTags;
    }

}
