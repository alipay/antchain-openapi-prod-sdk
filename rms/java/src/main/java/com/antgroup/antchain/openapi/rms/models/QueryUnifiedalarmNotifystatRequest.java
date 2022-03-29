// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmNotifystatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 发送状态
    @NameInMap("status")
    public Long status;

    // 通知渠道
    @NameInMap("channel")
    public String channel;

    // 模糊查询通知内容
    @NameInMap("keyword")
    public String keyword;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 告警规则 ID
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 事件ID
    @NameInMap("event_id")
    public String eventId;

    // 根据应用过滤
    @NameInMap("alarm_stack_info")
    public AlarmStackInfo alarmStackInfo;

    public static QueryUnifiedalarmNotifystatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmNotifystatRequest self = new QueryUnifiedalarmNotifystatRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmNotifystatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmNotifystatRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryUnifiedalarmNotifystatRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryUnifiedalarmNotifystatRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryUnifiedalarmNotifystatRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryUnifiedalarmNotifystatRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUnifiedalarmNotifystatRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmNotifystatRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryUnifiedalarmNotifystatRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryUnifiedalarmNotifystatRequest setAlarmStackInfo(AlarmStackInfo alarmStackInfo) {
        this.alarmStackInfo = alarmStackInfo;
        return this;
    }
    public AlarmStackInfo getAlarmStackInfo() {
        return this.alarmStackInfo;
    }

}
