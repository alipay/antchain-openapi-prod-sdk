// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作区
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 告警等级
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // 触发状态
    @NameInMap("status")
    public Long status;

    // 告警对象类型
    @NameInMap("alarm_target_type")
    public String alarmTargetType;

    // 模糊查询字段
    @NameInMap("keyword")
    public String keyword;

    // 开始时间
    @NameInMap("start_time")
    public Long startTime;

    // 结束时间
    @NameInMap("end_time")
    public Long endTime;

    // 告警规则 ID
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 根据应用栈过滤
    @NameInMap("alarm_stack_info")
    public AlarmStackInfo alarmStackInfo;

    // 查询告警事件产生时间所在区间的开始时间
    @NameInMap("fire_start_time")
    public Long fireStartTime;

    // 查询告警事件产生时间所在区间的结束时间
    @NameInMap("fire_end_time")
    public Long fireEndTime;

    // 查询告警事件恢复时间所在区间的开始时间
    @NameInMap("recovered_start_time")
    public Long recoveredStartTime;

    // 查询告警事件恢复时间所在区间的结束时间
    @NameInMap("recovered_end_time")
    public Long recoveredEndTime;

    public static QueryUnifiedalarmEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmEventRequest self = new QueryUnifiedalarmEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmEventRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmEventRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmEventRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmEventRequest setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public QueryUnifiedalarmEventRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryUnifiedalarmEventRequest setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public QueryUnifiedalarmEventRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUnifiedalarmEventRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryUnifiedalarmEventRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryUnifiedalarmEventRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryUnifiedalarmEventRequest setAlarmStackInfo(AlarmStackInfo alarmStackInfo) {
        this.alarmStackInfo = alarmStackInfo;
        return this;
    }
    public AlarmStackInfo getAlarmStackInfo() {
        return this.alarmStackInfo;
    }

    public QueryUnifiedalarmEventRequest setFireStartTime(Long fireStartTime) {
        this.fireStartTime = fireStartTime;
        return this;
    }
    public Long getFireStartTime() {
        return this.fireStartTime;
    }

    public QueryUnifiedalarmEventRequest setFireEndTime(Long fireEndTime) {
        this.fireEndTime = fireEndTime;
        return this;
    }
    public Long getFireEndTime() {
        return this.fireEndTime;
    }

    public QueryUnifiedalarmEventRequest setRecoveredStartTime(Long recoveredStartTime) {
        this.recoveredStartTime = recoveredStartTime;
        return this;
    }
    public Long getRecoveredStartTime() {
        return this.recoveredStartTime;
    }

    public QueryUnifiedalarmEventRequest setRecoveredEndTime(Long recoveredEndTime) {
        this.recoveredEndTime = recoveredEndTime;
        return this;
    }
    public Long getRecoveredEndTime() {
        return this.recoveredEndTime;
    }

}
