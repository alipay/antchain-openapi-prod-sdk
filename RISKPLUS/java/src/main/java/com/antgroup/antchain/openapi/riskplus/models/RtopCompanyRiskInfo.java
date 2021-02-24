// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCompanyRiskInfo extends TeaModel {
    // 企业唯一id
    @NameInMap("mct_one_id")
    public String mctOneId;

    // 组织机构代码
    @NameInMap("org_code")
    public String orgCode;

    // 企业名
    @NameInMap("org_name")
    public String orgName;

    // 区域
    @NameInMap("place_name")
    public String placeName;

    // 区域类型
    @NameInMap("place_type")
    public String placeType;

    // 工商注册号
    @NameInMap("reg_no")
    public String regNo;

    // 风险评分
    @NameInMap("risk_score")
    public String riskScore;

    // 风险变化程度排序，根据分值波动大小，标签变更次数排序
    @NameInMap("risk_shift_rank")
    public String riskShiftRank;

    // 风险标签id列表
    @NameInMap("risk_tags_id")
    public java.util.List<String> riskTagsId;

    // 风险定性
    @NameInMap("risk_type")
    public String riskType;

    // 线索
    @NameInMap("tags_clue")
    public String tagsClue;

    // 风险线索明细
    @NameInMap("tags_clue_detail")
    public String tagsClueDetail;

    // 企业统一社会信用代码
    @NameInMap("uc_code")
    public String ucCode;

    public static RtopCompanyRiskInfo build(java.util.Map<String, ?> map) throws Exception {
        RtopCompanyRiskInfo self = new RtopCompanyRiskInfo();
        return TeaModel.build(map, self);
    }

    public RtopCompanyRiskInfo setMctOneId(String mctOneId) {
        this.mctOneId = mctOneId;
        return this;
    }
    public String getMctOneId() {
        return this.mctOneId;
    }

    public RtopCompanyRiskInfo setOrgCode(String orgCode) {
        this.orgCode = orgCode;
        return this;
    }
    public String getOrgCode() {
        return this.orgCode;
    }

    public RtopCompanyRiskInfo setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RtopCompanyRiskInfo setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    public String getPlaceName() {
        return this.placeName;
    }

    public RtopCompanyRiskInfo setPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }
    public String getPlaceType() {
        return this.placeType;
    }

    public RtopCompanyRiskInfo setRegNo(String regNo) {
        this.regNo = regNo;
        return this;
    }
    public String getRegNo() {
        return this.regNo;
    }

    public RtopCompanyRiskInfo setRiskScore(String riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public String getRiskScore() {
        return this.riskScore;
    }

    public RtopCompanyRiskInfo setRiskShiftRank(String riskShiftRank) {
        this.riskShiftRank = riskShiftRank;
        return this;
    }
    public String getRiskShiftRank() {
        return this.riskShiftRank;
    }

    public RtopCompanyRiskInfo setRiskTagsId(java.util.List<String> riskTagsId) {
        this.riskTagsId = riskTagsId;
        return this;
    }
    public java.util.List<String> getRiskTagsId() {
        return this.riskTagsId;
    }

    public RtopCompanyRiskInfo setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public RtopCompanyRiskInfo setTagsClue(String tagsClue) {
        this.tagsClue = tagsClue;
        return this;
    }
    public String getTagsClue() {
        return this.tagsClue;
    }

    public RtopCompanyRiskInfo setTagsClueDetail(String tagsClueDetail) {
        this.tagsClueDetail = tagsClueDetail;
        return this;
    }
    public String getTagsClueDetail() {
        return this.tagsClueDetail;
    }

    public RtopCompanyRiskInfo setUcCode(String ucCode) {
        this.ucCode = ucCode;
        return this;
    }
    public String getUcCode() {
        return this.ucCode;
    }

}
