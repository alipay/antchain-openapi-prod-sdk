// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmNotifyhistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发送状态
    @NameInMap("status")
    public Long status;

    // 通知渠道
    @NameInMap("channel")
    public String channel;

    // 通知人id
    @NameInMap("subscriber")
    public String subscriber;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页面尺寸
    @NameInMap("page_size")
    public Long pageSize;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 事件id
    @NameInMap("event_id")
    public String eventId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 查询告警内容
    @NameInMap("keyword")
    public String keyword;

    // 告警规则 ID
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 告警状态
    @NameInMap("alarm_status")
    public Long alarmStatus;

    // 根据应用过滤告警历史
    @NameInMap("alarm_stack_info")
    public AlarmStackInfo alarmStackInfo;

    // 是否根据通知对象过滤
    @NameInMap("alarm_subscribers")
    public java.util.List<UnifiedAlarmSubDTO> alarmSubscribers;

    public static QueryUnifiedalarmNotifyhistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmNotifyhistoryRequest self = new QueryUnifiedalarmNotifyhistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmNotifyhistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setSubscriber(String subscriber) {
        this.subscriber = subscriber;
        return this;
    }
    public String getSubscriber() {
        return this.subscriber;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public Long getAlarmStatus() {
        return this.alarmStatus;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setAlarmStackInfo(AlarmStackInfo alarmStackInfo) {
        this.alarmStackInfo = alarmStackInfo;
        return this;
    }
    public AlarmStackInfo getAlarmStackInfo() {
        return this.alarmStackInfo;
    }

    public QueryUnifiedalarmNotifyhistoryRequest setAlarmSubscribers(java.util.List<UnifiedAlarmSubDTO> alarmSubscribers) {
        this.alarmSubscribers = alarmSubscribers;
        return this;
    }
    public java.util.List<UnifiedAlarmSubDTO> getAlarmSubscribers() {
        return this.alarmSubscribers;
    }

}
