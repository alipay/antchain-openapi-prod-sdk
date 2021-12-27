// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetRtopCompanyMonitorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 活跃市，不带国家和地区的代码
    @NameInMap("active_city")
    @Validation(required = true)
    public String activeCity;

    // 监测企业的行业
    @NameInMap("company_category")
    public String companyCategory;

    // 涉众风险类型
    @NameInMap("crowd_risk_type")
    @Validation(required = true)
    public String crowdRiskType;

    @NameInMap("features")
    @Validation(required = true)
    public java.util.List<RtopMonitorCompanyFeature> features;

    // 影响金额
    @NameInMap("money_involved")
    @Validation(required = true)
    public Long moneyInvolved;

    @NameInMap("monitor_risk_tags")
    @Validation(required = true)
    public java.util.List<String> monitorRiskTags;

    // 监测企业的评分
    @NameInMap("monitor_score")
    @Validation(required = true)
    public Long monitorScore;

    // 影响人数
    @NameInMap("people_involved")
    @Validation(required = true)
    public Long peopleInvolved;

    // 注册市，不带国家和地区的代码
    @NameInMap("registered_city")
    @Validation(required = true)
    public String registeredCity;

    public static GetRtopCompanyMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRtopCompanyMonitorResponse self = new GetRtopCompanyMonitorResponse();
        return TeaModel.build(map, self);
    }

    public GetRtopCompanyMonitorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRtopCompanyMonitorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRtopCompanyMonitorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRtopCompanyMonitorResponse setActiveCity(String activeCity) {
        this.activeCity = activeCity;
        return this;
    }
    public String getActiveCity() {
        return this.activeCity;
    }

    public GetRtopCompanyMonitorResponse setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
        return this;
    }
    public String getCompanyCategory() {
        return this.companyCategory;
    }

    public GetRtopCompanyMonitorResponse setCrowdRiskType(String crowdRiskType) {
        this.crowdRiskType = crowdRiskType;
        return this;
    }
    public String getCrowdRiskType() {
        return this.crowdRiskType;
    }

    public GetRtopCompanyMonitorResponse setFeatures(java.util.List<RtopMonitorCompanyFeature> features) {
        this.features = features;
        return this;
    }
    public java.util.List<RtopMonitorCompanyFeature> getFeatures() {
        return this.features;
    }

    public GetRtopCompanyMonitorResponse setMoneyInvolved(Long moneyInvolved) {
        this.moneyInvolved = moneyInvolved;
        return this;
    }
    public Long getMoneyInvolved() {
        return this.moneyInvolved;
    }

    public GetRtopCompanyMonitorResponse setMonitorRiskTags(java.util.List<String> monitorRiskTags) {
        this.monitorRiskTags = monitorRiskTags;
        return this;
    }
    public java.util.List<String> getMonitorRiskTags() {
        return this.monitorRiskTags;
    }

    public GetRtopCompanyMonitorResponse setMonitorScore(Long monitorScore) {
        this.monitorScore = monitorScore;
        return this;
    }
    public Long getMonitorScore() {
        return this.monitorScore;
    }

    public GetRtopCompanyMonitorResponse setPeopleInvolved(Long peopleInvolved) {
        this.peopleInvolved = peopleInvolved;
        return this;
    }
    public Long getPeopleInvolved() {
        return this.peopleInvolved;
    }

    public GetRtopCompanyMonitorResponse setRegisteredCity(String registeredCity) {
        this.registeredCity = registeredCity;
        return this;
    }
    public String getRegisteredCity() {
        return this.registeredCity;
    }

}
