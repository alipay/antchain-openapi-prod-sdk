// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCrowdriskDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 活跃市
    @NameInMap("active_city")
    public String activeCity;

    // 活跃县
    @NameInMap("active_county")
    public String activeCounty;

    // 活跃省
    @NameInMap("active_province")
    public String activeProvince;

    // 年龄分布
    @NameInMap("age_distribution")
    public java.util.List<RtopAgeDistribution> ageDistribution;

    // 线索标签
    @NameInMap("clue_tags")
    public java.util.List<String> clueTags;

    // 报文
    @NameInMap("conclusion")
    public String conclusion;

    // 风险等级
    @NameInMap("crowd_risk_level")
    public String crowdRiskLevel;

    // 涉众风险分析的分数
    @NameInMap("crowd_risk_score")
    public Long crowdRiskScore;

    // 风险类型
    @NameInMap("crowd_risk_type")
    public String crowdRiskType;

    // 发现时间
    @NameInMap("detected_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String detectedTime;

    // 特征
    @NameInMap("features")
    public java.util.List<RtopCrowdRiskFeatureResp> features;

    // 性别分布
    @NameInMap("gender_distribution")
    public java.util.List<RtopGenderDistribution> genderDistribution;

    // 上次活跃时间
    @NameInMap("last_active_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastActiveTime;

    // 涉案金额
    @NameInMap("money_involved")
    public Long moneyInvolved;

    // 影响金额的历史曲线
    @NameInMap("money_involved_history")
    public java.util.List<RtopDateDistribution> moneyInvolvedHistory;

    // 涉案人数
    @NameInMap("people_involved")
    public Long peopleInvolved;

    // 影响人数的历史曲线
    @NameInMap("people_involved_history")
    public java.util.List<RtopDateDistribution> peopleInvolvedHistory;

    // 影响的人数分布，key为地区城市，value为影响的人数
    @NameInMap("population_distribution")
    public java.util.List<RtopPopulationDistribution> populationDistribution;

    // 注册市
    @NameInMap("registered_city")
    public String registeredCity;

    // 注册县
    @NameInMap("registered_county")
    public String registeredCounty;

    // 注册省
    @NameInMap("registered_province")
    public String registeredProvince;

    public static QueryRtopCrowdriskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCrowdriskDetailResponse self = new QueryRtopCrowdriskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCrowdriskDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCrowdriskDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCrowdriskDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCrowdriskDetailResponse setActiveCity(String activeCity) {
        this.activeCity = activeCity;
        return this;
    }
    public String getActiveCity() {
        return this.activeCity;
    }

    public QueryRtopCrowdriskDetailResponse setActiveCounty(String activeCounty) {
        this.activeCounty = activeCounty;
        return this;
    }
    public String getActiveCounty() {
        return this.activeCounty;
    }

    public QueryRtopCrowdriskDetailResponse setActiveProvince(String activeProvince) {
        this.activeProvince = activeProvince;
        return this;
    }
    public String getActiveProvince() {
        return this.activeProvince;
    }

    public QueryRtopCrowdriskDetailResponse setAgeDistribution(java.util.List<RtopAgeDistribution> ageDistribution) {
        this.ageDistribution = ageDistribution;
        return this;
    }
    public java.util.List<RtopAgeDistribution> getAgeDistribution() {
        return this.ageDistribution;
    }

    public QueryRtopCrowdriskDetailResponse setClueTags(java.util.List<String> clueTags) {
        this.clueTags = clueTags;
        return this;
    }
    public java.util.List<String> getClueTags() {
        return this.clueTags;
    }

    public QueryRtopCrowdriskDetailResponse setConclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }
    public String getConclusion() {
        return this.conclusion;
    }

    public QueryRtopCrowdriskDetailResponse setCrowdRiskLevel(String crowdRiskLevel) {
        this.crowdRiskLevel = crowdRiskLevel;
        return this;
    }
    public String getCrowdRiskLevel() {
        return this.crowdRiskLevel;
    }

    public QueryRtopCrowdriskDetailResponse setCrowdRiskScore(Long crowdRiskScore) {
        this.crowdRiskScore = crowdRiskScore;
        return this;
    }
    public Long getCrowdRiskScore() {
        return this.crowdRiskScore;
    }

    public QueryRtopCrowdriskDetailResponse setCrowdRiskType(String crowdRiskType) {
        this.crowdRiskType = crowdRiskType;
        return this;
    }
    public String getCrowdRiskType() {
        return this.crowdRiskType;
    }

    public QueryRtopCrowdriskDetailResponse setDetectedTime(String detectedTime) {
        this.detectedTime = detectedTime;
        return this;
    }
    public String getDetectedTime() {
        return this.detectedTime;
    }

    public QueryRtopCrowdriskDetailResponse setFeatures(java.util.List<RtopCrowdRiskFeatureResp> features) {
        this.features = features;
        return this;
    }
    public java.util.List<RtopCrowdRiskFeatureResp> getFeatures() {
        return this.features;
    }

    public QueryRtopCrowdriskDetailResponse setGenderDistribution(java.util.List<RtopGenderDistribution> genderDistribution) {
        this.genderDistribution = genderDistribution;
        return this;
    }
    public java.util.List<RtopGenderDistribution> getGenderDistribution() {
        return this.genderDistribution;
    }

    public QueryRtopCrowdriskDetailResponse setLastActiveTime(String lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
        return this;
    }
    public String getLastActiveTime() {
        return this.lastActiveTime;
    }

    public QueryRtopCrowdriskDetailResponse setMoneyInvolved(Long moneyInvolved) {
        this.moneyInvolved = moneyInvolved;
        return this;
    }
    public Long getMoneyInvolved() {
        return this.moneyInvolved;
    }

    public QueryRtopCrowdriskDetailResponse setMoneyInvolvedHistory(java.util.List<RtopDateDistribution> moneyInvolvedHistory) {
        this.moneyInvolvedHistory = moneyInvolvedHistory;
        return this;
    }
    public java.util.List<RtopDateDistribution> getMoneyInvolvedHistory() {
        return this.moneyInvolvedHistory;
    }

    public QueryRtopCrowdriskDetailResponse setPeopleInvolved(Long peopleInvolved) {
        this.peopleInvolved = peopleInvolved;
        return this;
    }
    public Long getPeopleInvolved() {
        return this.peopleInvolved;
    }

    public QueryRtopCrowdriskDetailResponse setPeopleInvolvedHistory(java.util.List<RtopDateDistribution> peopleInvolvedHistory) {
        this.peopleInvolvedHistory = peopleInvolvedHistory;
        return this;
    }
    public java.util.List<RtopDateDistribution> getPeopleInvolvedHistory() {
        return this.peopleInvolvedHistory;
    }

    public QueryRtopCrowdriskDetailResponse setPopulationDistribution(java.util.List<RtopPopulationDistribution> populationDistribution) {
        this.populationDistribution = populationDistribution;
        return this;
    }
    public java.util.List<RtopPopulationDistribution> getPopulationDistribution() {
        return this.populationDistribution;
    }

    public QueryRtopCrowdriskDetailResponse setRegisteredCity(String registeredCity) {
        this.registeredCity = registeredCity;
        return this;
    }
    public String getRegisteredCity() {
        return this.registeredCity;
    }

    public QueryRtopCrowdriskDetailResponse setRegisteredCounty(String registeredCounty) {
        this.registeredCounty = registeredCounty;
        return this;
    }
    public String getRegisteredCounty() {
        return this.registeredCounty;
    }

    public QueryRtopCrowdriskDetailResponse setRegisteredProvince(String registeredProvince) {
        this.registeredProvince = registeredProvince;
        return this;
    }
    public String getRegisteredProvince() {
        return this.registeredProvince;
    }

}
