// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopStarCompanyInfo extends TeaModel {
    // 行业
    @NameInMap("categories")
    public java.util.List<String> categories;

    // 经营地址
    /**
     * <strong>example:</strong>
     * <p>广东省珠海市前山金鸡西路</p>
     */
    @NameInMap("operating_place")
    public String operatingPlace;

    // 经营省份
    /**
     * <strong>example:</strong>
     * <p>湖北省</p>
     */
    @NameInMap("operating_province")
    public String operatingProvince;

    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>珠海格力电器股份有限公司</p>
     */
    @NameInMap("org_name")
    public String orgName;

    // 风险分数
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("risk_score")
    public Long riskScore;

    // 风险标签
    /**
     * <strong>example:</strong>
     * <p>[&quot;内部被投诉&quot;,&quot;法定代表人名下企业超过6家&quot;]</p>
     */
    @NameInMap("risk_tags")
    public java.util.List<String> riskTags;

    // 风险线索
    @NameInMap("risk_tag_details")
    public java.util.List<RtopRiskTag> riskTagDetails;

    // 风险标签Id集合
    /**
     * <strong>example:</strong>
     * <p>[&quot;CMN00025&quot;, &quot;CMN00011&quot;]</p>
     */
    @NameInMap("risk_tag_ids")
    public java.util.List<String> riskTagIds;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>91440400192548256N</p>
     */
    @NameInMap("uc_code")
    public String ucCode;

    public static RtopStarCompanyInfo build(java.util.Map<String, ?> map) throws Exception {
        RtopStarCompanyInfo self = new RtopStarCompanyInfo();
        return TeaModel.build(map, self);
    }

    public RtopStarCompanyInfo setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public RtopStarCompanyInfo setOperatingPlace(String operatingPlace) {
        this.operatingPlace = operatingPlace;
        return this;
    }
    public String getOperatingPlace() {
        return this.operatingPlace;
    }

    public RtopStarCompanyInfo setOperatingProvince(String operatingProvince) {
        this.operatingProvince = operatingProvince;
        return this;
    }
    public String getOperatingProvince() {
        return this.operatingProvince;
    }

    public RtopStarCompanyInfo setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RtopStarCompanyInfo setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public RtopStarCompanyInfo setRiskTags(java.util.List<String> riskTags) {
        this.riskTags = riskTags;
        return this;
    }
    public java.util.List<String> getRiskTags() {
        return this.riskTags;
    }

    public RtopStarCompanyInfo setRiskTagDetails(java.util.List<RtopRiskTag> riskTagDetails) {
        this.riskTagDetails = riskTagDetails;
        return this;
    }
    public java.util.List<RtopRiskTag> getRiskTagDetails() {
        return this.riskTagDetails;
    }

    public RtopStarCompanyInfo setRiskTagIds(java.util.List<String> riskTagIds) {
        this.riskTagIds = riskTagIds;
        return this;
    }
    public java.util.List<String> getRiskTagIds() {
        return this.riskTagIds;
    }

    public RtopStarCompanyInfo setUcCode(String ucCode) {
        this.ucCode = ucCode;
        return this;
    }
    public String getUcCode() {
        return this.ucCode;
    }

}
