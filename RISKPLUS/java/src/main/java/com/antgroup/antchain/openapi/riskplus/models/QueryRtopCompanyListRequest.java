// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyListRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活跃地区
    @NameInMap("active_areas")
    public java.util.List<String> activeAreas;

    // 企业类型
    @NameInMap("categories")
    public java.util.List<String> categories;

    // 企业状态
    @NameInMap("company_states")
    public java.util.List<String> companyStates;

    // 反馈
    @NameInMap("feedback")
    public java.util.List<String> feedback;

    // 风险指数最大值
    @NameInMap("max_risk_score")
    public Long maxRiskScore;

    // 指数周波动最大值
    @NameInMap("max_risk_score_weekly_float")
    public String maxRiskScoreWeeklyFloat;

    // 传播人次最大值
    @NameInMap("max_spread_number")
    public Long maxSpreadNumber;

    // 风险指数最小值
    @NameInMap("min_risk_score")
    public Long minRiskScore;

    // 指数周波动最小值
    @NameInMap("min_risk_score_weekly_float")
    public String minRiskScoreWeeklyFloat;

    // 传播人次最小值
    @NameInMap("min_spread_number")
    public Long minSpreadNumber;

    // 正常营运状态
    @NameInMap("normal_operation")
    public Boolean normalOperation;

    // 经营地区
    @NameInMap("operate_areas")
    public java.util.List<String> operateAreas;

    // 当前是第几页
    @NameInMap("page_no")
    @Validation(required = true)
    public Long pageNo;

    // 每一页的记录条数
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 平台状态
    @NameInMap("platform_states")
    public java.util.List<String> platformStates;

    // 注册地区
    @NameInMap("register_areas")
    public java.util.List<String> registerAreas;

    // 高风险维度
    @NameInMap("risky_dimensions")
    public java.util.List<String> riskyDimensions;

    // 风险标签
    @NameInMap("risk_tags")
    public java.util.List<String> riskTags;

    // 风险定性
    @NameInMap("risk_types")
    public java.util.List<String> riskTypes;

    // 排序字段
    @NameInMap("sort_field")
    public String sortField;

    // 排序类型
    @NameInMap("sort_type")
    public String sortType;

    // 用户属地
    @NameInMap("user_place")
    @Validation(required = true)
    public String userPlace;

    // 用户所在地类型
    @NameInMap("user_place_type")
    @Validation(required = true)
    public String userPlaceType;

    public static QueryRtopCompanyListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyListRequest self = new QueryRtopCompanyListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyListRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopCompanyListRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopCompanyListRequest setActiveAreas(java.util.List<String> activeAreas) {
        this.activeAreas = activeAreas;
        return this;
    }
    public java.util.List<String> getActiveAreas() {
        return this.activeAreas;
    }

    public QueryRtopCompanyListRequest setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public QueryRtopCompanyListRequest setCompanyStates(java.util.List<String> companyStates) {
        this.companyStates = companyStates;
        return this;
    }
    public java.util.List<String> getCompanyStates() {
        return this.companyStates;
    }

    public QueryRtopCompanyListRequest setFeedback(java.util.List<String> feedback) {
        this.feedback = feedback;
        return this;
    }
    public java.util.List<String> getFeedback() {
        return this.feedback;
    }

    public QueryRtopCompanyListRequest setMaxRiskScore(Long maxRiskScore) {
        this.maxRiskScore = maxRiskScore;
        return this;
    }
    public Long getMaxRiskScore() {
        return this.maxRiskScore;
    }

    public QueryRtopCompanyListRequest setMaxRiskScoreWeeklyFloat(String maxRiskScoreWeeklyFloat) {
        this.maxRiskScoreWeeklyFloat = maxRiskScoreWeeklyFloat;
        return this;
    }
    public String getMaxRiskScoreWeeklyFloat() {
        return this.maxRiskScoreWeeklyFloat;
    }

    public QueryRtopCompanyListRequest setMaxSpreadNumber(Long maxSpreadNumber) {
        this.maxSpreadNumber = maxSpreadNumber;
        return this;
    }
    public Long getMaxSpreadNumber() {
        return this.maxSpreadNumber;
    }

    public QueryRtopCompanyListRequest setMinRiskScore(Long minRiskScore) {
        this.minRiskScore = minRiskScore;
        return this;
    }
    public Long getMinRiskScore() {
        return this.minRiskScore;
    }

    public QueryRtopCompanyListRequest setMinRiskScoreWeeklyFloat(String minRiskScoreWeeklyFloat) {
        this.minRiskScoreWeeklyFloat = minRiskScoreWeeklyFloat;
        return this;
    }
    public String getMinRiskScoreWeeklyFloat() {
        return this.minRiskScoreWeeklyFloat;
    }

    public QueryRtopCompanyListRequest setMinSpreadNumber(Long minSpreadNumber) {
        this.minSpreadNumber = minSpreadNumber;
        return this;
    }
    public Long getMinSpreadNumber() {
        return this.minSpreadNumber;
    }

    public QueryRtopCompanyListRequest setNormalOperation(Boolean normalOperation) {
        this.normalOperation = normalOperation;
        return this;
    }
    public Boolean getNormalOperation() {
        return this.normalOperation;
    }

    public QueryRtopCompanyListRequest setOperateAreas(java.util.List<String> operateAreas) {
        this.operateAreas = operateAreas;
        return this;
    }
    public java.util.List<String> getOperateAreas() {
        return this.operateAreas;
    }

    public QueryRtopCompanyListRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryRtopCompanyListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRtopCompanyListRequest setPlatformStates(java.util.List<String> platformStates) {
        this.platformStates = platformStates;
        return this;
    }
    public java.util.List<String> getPlatformStates() {
        return this.platformStates;
    }

    public QueryRtopCompanyListRequest setRegisterAreas(java.util.List<String> registerAreas) {
        this.registerAreas = registerAreas;
        return this;
    }
    public java.util.List<String> getRegisterAreas() {
        return this.registerAreas;
    }

    public QueryRtopCompanyListRequest setRiskyDimensions(java.util.List<String> riskyDimensions) {
        this.riskyDimensions = riskyDimensions;
        return this;
    }
    public java.util.List<String> getRiskyDimensions() {
        return this.riskyDimensions;
    }

    public QueryRtopCompanyListRequest setRiskTags(java.util.List<String> riskTags) {
        this.riskTags = riskTags;
        return this;
    }
    public java.util.List<String> getRiskTags() {
        return this.riskTags;
    }

    public QueryRtopCompanyListRequest setRiskTypes(java.util.List<String> riskTypes) {
        this.riskTypes = riskTypes;
        return this;
    }
    public java.util.List<String> getRiskTypes() {
        return this.riskTypes;
    }

    public QueryRtopCompanyListRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryRtopCompanyListRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public QueryRtopCompanyListRequest setUserPlace(String userPlace) {
        this.userPlace = userPlace;
        return this;
    }
    public String getUserPlace() {
        return this.userPlace;
    }

    public QueryRtopCompanyListRequest setUserPlaceType(String userPlaceType) {
        this.userPlaceType = userPlaceType;
        return this;
    }
    public String getUserPlaceType() {
        return this.userPlaceType;
    }

}
