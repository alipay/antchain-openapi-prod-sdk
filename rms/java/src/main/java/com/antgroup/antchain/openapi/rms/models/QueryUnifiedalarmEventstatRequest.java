// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmEventstatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 告警等级
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // 触发状态
    @NameInMap("status")
    public Long status;

    // 时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 工作空间名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 模糊查询告警内容
    @NameInMap("keyword")
    public String keyword;

    // 告警规则 ID
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // alarm_target_type
    @NameInMap("alarm_target_type")
    public String alarmTargetType;

    // 根据应用过滤
    @NameInMap("alarm_stack_info")
    public AlarmStackInfo alarmStackInfo;

    public static QueryUnifiedalarmEventstatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmEventstatRequest self = new QueryUnifiedalarmEventstatRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmEventstatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnifiedalarmEventstatRequest setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public QueryUnifiedalarmEventstatRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryUnifiedalarmEventstatRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryUnifiedalarmEventstatRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryUnifiedalarmEventstatRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryUnifiedalarmEventstatRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUnifiedalarmEventstatRequest setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public QueryUnifiedalarmEventstatRequest setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public QueryUnifiedalarmEventstatRequest setAlarmStackInfo(AlarmStackInfo alarmStackInfo) {
        this.alarmStackInfo = alarmStackInfo;
        return this;
    }
    public AlarmStackInfo getAlarmStackInfo() {
        return this.alarmStackInfo;
    }

}
