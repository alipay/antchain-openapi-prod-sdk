// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmHistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 开始时间
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // 结束时间
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 应用 / 主机
    @NameInMap("alarm_target_type")
    public String alarmTargetType;

    // 告警对象
    @NameInMap("alarm_target")
    public String alarmTarget;

    // 告警级别
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // 触发状态
    @NameInMap("status")
    public Long status;

    // 根据应用过滤告警历史
    @NameInMap("alarm_stack_info")
    public AlarmStackInfo alarmStackInfo;

    public static QueryUnifiedalarmHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmHistoryRequest self = new QueryUnifiedalarmHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmHistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmHistoryRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmHistoryRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryUnifiedalarmHistoryRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public QueryUnifiedalarmHistoryRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmHistoryRequest setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public QueryUnifiedalarmHistoryRequest setAlarmTarget(String alarmTarget) {
        this.alarmTarget = alarmTarget;
        return this;
    }
    public String getAlarmTarget() {
        return this.alarmTarget;
    }

    public QueryUnifiedalarmHistoryRequest setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public QueryUnifiedalarmHistoryRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryUnifiedalarmHistoryRequest setAlarmStackInfo(AlarmStackInfo alarmStackInfo) {
        this.alarmStackInfo = alarmStackInfo;
        return this;
    }
    public AlarmStackInfo getAlarmStackInfo() {
        return this.alarmStackInfo;
    }

}
