// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCrowdRiskSummaryResp extends TeaModel {
    // 活跃市
    @NameInMap("active_city")
    public String activeCity;

    // 活跃县
    @NameInMap("active_county")
    public String activeCounty;

    // 活跃省
    @NameInMap("active_province")
    public String activeProvince;

    // 风险标签
    @NameInMap("clue_tags")
    public java.util.List<String> clueTags;

    // 企业ID
    @NameInMap("company_id")
    @Validation(required = true)
    public String companyId;

    // 企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 风险等级
    @NameInMap("crowd_risk_level")
    public String crowdRiskLevel;

    // 涉众风险分数
    @NameInMap("crowd_risk_score")
    public Long crowdRiskScore;

    // 涉众风险类型
    @NameInMap("crowd_risk_type")
    public String crowdRiskType;

    // 发现时间
    @NameInMap("detected_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String detectedTime;

    // 影响金额
    @NameInMap("money_involved")
    public Long moneyInvolved;

    // 影响人数
    @NameInMap("people_involved")
    public Long peopleInvolved;

    // 注册市
    @NameInMap("registered_city")
    public String registeredCity;

    // 注册县
    @NameInMap("registered_county")
    public String registeredCounty;

    // 注册省
    @NameInMap("registered_province")
    public String registeredProvince;

    public static RtopCrowdRiskSummaryResp build(java.util.Map<String, ?> map) throws Exception {
        RtopCrowdRiskSummaryResp self = new RtopCrowdRiskSummaryResp();
        return TeaModel.build(map, self);
    }

    public RtopCrowdRiskSummaryResp setActiveCity(String activeCity) {
        this.activeCity = activeCity;
        return this;
    }
    public String getActiveCity() {
        return this.activeCity;
    }

    public RtopCrowdRiskSummaryResp setActiveCounty(String activeCounty) {
        this.activeCounty = activeCounty;
        return this;
    }
    public String getActiveCounty() {
        return this.activeCounty;
    }

    public RtopCrowdRiskSummaryResp setActiveProvince(String activeProvince) {
        this.activeProvince = activeProvince;
        return this;
    }
    public String getActiveProvince() {
        return this.activeProvince;
    }

    public RtopCrowdRiskSummaryResp setClueTags(java.util.List<String> clueTags) {
        this.clueTags = clueTags;
        return this;
    }
    public java.util.List<String> getClueTags() {
        return this.clueTags;
    }

    public RtopCrowdRiskSummaryResp setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    public String getCompanyId() {
        return this.companyId;
    }

    public RtopCrowdRiskSummaryResp setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public RtopCrowdRiskSummaryResp setCrowdRiskLevel(String crowdRiskLevel) {
        this.crowdRiskLevel = crowdRiskLevel;
        return this;
    }
    public String getCrowdRiskLevel() {
        return this.crowdRiskLevel;
    }

    public RtopCrowdRiskSummaryResp setCrowdRiskScore(Long crowdRiskScore) {
        this.crowdRiskScore = crowdRiskScore;
        return this;
    }
    public Long getCrowdRiskScore() {
        return this.crowdRiskScore;
    }

    public RtopCrowdRiskSummaryResp setCrowdRiskType(String crowdRiskType) {
        this.crowdRiskType = crowdRiskType;
        return this;
    }
    public String getCrowdRiskType() {
        return this.crowdRiskType;
    }

    public RtopCrowdRiskSummaryResp setDetectedTime(String detectedTime) {
        this.detectedTime = detectedTime;
        return this;
    }
    public String getDetectedTime() {
        return this.detectedTime;
    }

    public RtopCrowdRiskSummaryResp setMoneyInvolved(Long moneyInvolved) {
        this.moneyInvolved = moneyInvolved;
        return this;
    }
    public Long getMoneyInvolved() {
        return this.moneyInvolved;
    }

    public RtopCrowdRiskSummaryResp setPeopleInvolved(Long peopleInvolved) {
        this.peopleInvolved = peopleInvolved;
        return this;
    }
    public Long getPeopleInvolved() {
        return this.peopleInvolved;
    }

    public RtopCrowdRiskSummaryResp setRegisteredCity(String registeredCity) {
        this.registeredCity = registeredCity;
        return this;
    }
    public String getRegisteredCity() {
        return this.registeredCity;
    }

    public RtopCrowdRiskSummaryResp setRegisteredCounty(String registeredCounty) {
        this.registeredCounty = registeredCounty;
        return this;
    }
    public String getRegisteredCounty() {
        return this.registeredCounty;
    }

    public RtopCrowdRiskSummaryResp setRegisteredProvince(String registeredProvince) {
        this.registeredProvince = registeredProvince;
        return this;
    }
    public String getRegisteredProvince() {
        return this.registeredProvince;
    }

}
