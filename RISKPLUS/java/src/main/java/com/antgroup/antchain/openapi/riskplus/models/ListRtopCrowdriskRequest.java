// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListRtopCrowdriskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活跃地筛选
    @NameInMap("active_places")
    public java.util.List<String> activePlaces;

    // 风险等级
    @NameInMap("crowd_risk_levels")
    public java.util.List<String> crowdRiskLevels;

    // 风险类型
    @NameInMap("crowd_risk_types")
    public java.util.List<String> crowdRiskTypes;

    // 结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 所在地的名称
    @NameInMap("place_name")
    public String placeName;

    // 地区类型
    @NameInMap("place_type")
    public String placeType;

    // 注册地筛选
    @NameInMap("reg_places")
    public java.util.List<String> regPlaces;

    // 排序字段
    @NameInMap("sort_by")
    public String sortBy;

    // 排序方式
    @NameInMap("sort_type")
    public String sortType;

    // 开始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    public static ListRtopCrowdriskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRtopCrowdriskRequest self = new ListRtopCrowdriskRequest();
        return TeaModel.build(map, self);
    }

    public ListRtopCrowdriskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRtopCrowdriskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListRtopCrowdriskRequest setActivePlaces(java.util.List<String> activePlaces) {
        this.activePlaces = activePlaces;
        return this;
    }
    public java.util.List<String> getActivePlaces() {
        return this.activePlaces;
    }

    public ListRtopCrowdriskRequest setCrowdRiskLevels(java.util.List<String> crowdRiskLevels) {
        this.crowdRiskLevels = crowdRiskLevels;
        return this;
    }
    public java.util.List<String> getCrowdRiskLevels() {
        return this.crowdRiskLevels;
    }

    public ListRtopCrowdriskRequest setCrowdRiskTypes(java.util.List<String> crowdRiskTypes) {
        this.crowdRiskTypes = crowdRiskTypes;
        return this;
    }
    public java.util.List<String> getCrowdRiskTypes() {
        return this.crowdRiskTypes;
    }

    public ListRtopCrowdriskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRtopCrowdriskRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListRtopCrowdriskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRtopCrowdriskRequest setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    public String getPlaceName() {
        return this.placeName;
    }

    public ListRtopCrowdriskRequest setPlaceType(String placeType) {
        this.placeType = placeType;
        return this;
    }
    public String getPlaceType() {
        return this.placeType;
    }

    public ListRtopCrowdriskRequest setRegPlaces(java.util.List<String> regPlaces) {
        this.regPlaces = regPlaces;
        return this;
    }
    public java.util.List<String> getRegPlaces() {
        return this.regPlaces;
    }

    public ListRtopCrowdriskRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListRtopCrowdriskRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListRtopCrowdriskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
