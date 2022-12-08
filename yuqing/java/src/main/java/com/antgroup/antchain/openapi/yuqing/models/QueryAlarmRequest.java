// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryAlarmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 规则id列表
    @NameInMap("alarm_rule_ids")
    public java.util.List<Long> alarmRuleIds;

    // 排序字段名称，如gmt_create
    @NameInMap("order_by")
    public String orderBy;

    // 是否用更新时间筛选
    @NameInMap("is_query_update_time")
    public Boolean isQueryUpdateTime;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 舆情项目id列表
    @NameInMap("project_ids")
    public java.util.List<Long> projectIds;

    // 预警时间下限
    @NameInMap("end_time")
    public Long endTime;

    // 预警等级，如：P0
    @NameInMap("levels")
    public String levels;

    // 预警时间上限
    @NameInMap("start_time")
    public Long startTime;

    // 预警规则类型
    @NameInMap("type")
    public String type;

    // 预警消息id
    @NameInMap("ids")
    public java.util.List<Long> ids;

    // 标签id
    @NameInMap("tag_ids")
    public java.util.List<Long> tagIds;

    // 媒体类型
    @NameInMap("doc_media_type")
    public String docMediaType;

    // 消息状态，如：FINISHED
    @NameInMap("status")
    public java.util.List<String> status;

    // 文章docId列表
    @NameInMap("doc_id_list")
    public java.util.List<String> docIdList;

    // 排序方向，DESC降序，ASC升序
    @NameInMap("sort_type")
    public String sortType;

    // requestId
    @NameInMap("request_id")
    public String requestId;

    public static QueryAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmRequest self = new QueryAlarmRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlarmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAlarmRequest setAlarmRuleIds(java.util.List<Long> alarmRuleIds) {
        this.alarmRuleIds = alarmRuleIds;
        return this;
    }
    public java.util.List<Long> getAlarmRuleIds() {
        return this.alarmRuleIds;
    }

    public QueryAlarmRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryAlarmRequest setIsQueryUpdateTime(Boolean isQueryUpdateTime) {
        this.isQueryUpdateTime = isQueryUpdateTime;
        return this;
    }
    public Boolean getIsQueryUpdateTime() {
        return this.isQueryUpdateTime;
    }

    public QueryAlarmRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlarmRequest setProjectIds(java.util.List<Long> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    public QueryAlarmRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryAlarmRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public QueryAlarmRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryAlarmRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryAlarmRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public QueryAlarmRequest setTagIds(java.util.List<Long> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<Long> getTagIds() {
        return this.tagIds;
    }

    public QueryAlarmRequest setDocMediaType(String docMediaType) {
        this.docMediaType = docMediaType;
        return this;
    }
    public String getDocMediaType() {
        return this.docMediaType;
    }

    public QueryAlarmRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public QueryAlarmRequest setDocIdList(java.util.List<String> docIdList) {
        this.docIdList = docIdList;
        return this;
    }
    public java.util.List<String> getDocIdList() {
        return this.docIdList;
    }

    public QueryAlarmRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public QueryAlarmRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
