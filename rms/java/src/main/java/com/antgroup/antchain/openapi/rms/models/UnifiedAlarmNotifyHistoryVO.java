// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmNotifyHistoryVO extends TeaModel {
    // 主键
    @NameInMap("id")
    public Long id;

    // 告警历史id
    @NameInMap("alarm_history_id")
    public Long alarmHistoryId;

    // 告警事件id
    @NameInMap("alarm_event_id")
    public String alarmEventId;

    // 告警规则id
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 告警等级
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // 告警静默期
    @NameInMap("alarm_silence_time")
    public Long alarmSilenceTime;

    // 告警时间
    @NameInMap("alarm_time")
    public Long alarmTime;

    // 通知渠道
    @NameInMap("channel")
    public String channel;

    // 订阅人的类型
    @NameInMap("subscriber_type")
    public String subscriberType;

    // 订阅人
    @NameInMap("subscriber")
    public String subscriber;

    // 聚合条数
    @NameInMap("agg_count")
    public Long aggCount;

    // 通知状态
    @NameInMap("status")
    public Long status;

    // 租户id
    @NameInMap("tenant_id")
    public Long tenantId;

    // 工作空间id
    @NameInMap("workspace_id")
    public Long workspaceId;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 消息内容
    @NameInMap("notify_content")
    public String notifyContent;

    // 告警规则名
    @NameInMap("alarm_rule_name")
    public String alarmRuleName;

    // 订阅人
    @NameInMap("subscriber_name")
    public String subscriberName;

    // 订阅者来源
    @NameInMap("subscriber_source")
    public String subscriberSource;

    // 告警消息的状态
    @NameInMap("alarm_status")
    public Long alarmStatus;

    // 告警类型
    @NameInMap("alarm_type")
    public String alarmType;

    // 告警数据源跳转url
    @NameInMap("alarm_url")
    public String alarmUrl;

    // 数据源名称
    @NameInMap("data_source_name")
    public String dataSourceName;

    // 目标对象是否删除
    @NameInMap("alarm_target_deleted")
    public Boolean alarmTargetDeleted;

    // 描述消息发送错误原因
    @NameInMap("error_message")
    public String errorMessage;

    // 告警消息的日志跟踪字段
    @NameInMap("trace_id")
    public String traceId;

    public static UnifiedAlarmNotifyHistoryVO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmNotifyHistoryVO self = new UnifiedAlarmNotifyHistoryVO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmNotifyHistoryVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmHistoryId(Long alarmHistoryId) {
        this.alarmHistoryId = alarmHistoryId;
        return this;
    }
    public Long getAlarmHistoryId() {
        return this.alarmHistoryId;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmEventId(String alarmEventId) {
        this.alarmEventId = alarmEventId;
        return this;
    }
    public String getAlarmEventId() {
        return this.alarmEventId;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmSilenceTime(Long alarmSilenceTime) {
        this.alarmSilenceTime = alarmSilenceTime;
        return this;
    }
    public Long getAlarmSilenceTime() {
        return this.alarmSilenceTime;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public Long getAlarmTime() {
        return this.alarmTime;
    }

    public UnifiedAlarmNotifyHistoryVO setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UnifiedAlarmNotifyHistoryVO setSubscriberType(String subscriberType) {
        this.subscriberType = subscriberType;
        return this;
    }
    public String getSubscriberType() {
        return this.subscriberType;
    }

    public UnifiedAlarmNotifyHistoryVO setSubscriber(String subscriber) {
        this.subscriber = subscriber;
        return this;
    }
    public String getSubscriber() {
        return this.subscriber;
    }

    public UnifiedAlarmNotifyHistoryVO setAggCount(Long aggCount) {
        this.aggCount = aggCount;
        return this;
    }
    public Long getAggCount() {
        return this.aggCount;
    }

    public UnifiedAlarmNotifyHistoryVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UnifiedAlarmNotifyHistoryVO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UnifiedAlarmNotifyHistoryVO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public UnifiedAlarmNotifyHistoryVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UnifiedAlarmNotifyHistoryVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UnifiedAlarmNotifyHistoryVO setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
        return this;
    }
    public String getNotifyContent() {
        return this.notifyContent;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }
    public String getAlarmRuleName() {
        return this.alarmRuleName;
    }

    public UnifiedAlarmNotifyHistoryVO setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
        return this;
    }
    public String getSubscriberName() {
        return this.subscriberName;
    }

    public UnifiedAlarmNotifyHistoryVO setSubscriberSource(String subscriberSource) {
        this.subscriberSource = subscriberSource;
        return this;
    }
    public String getSubscriberSource() {
        return this.subscriberSource;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public Long getAlarmStatus() {
        return this.alarmStatus;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmUrl(String alarmUrl) {
        this.alarmUrl = alarmUrl;
        return this;
    }
    public String getAlarmUrl() {
        return this.alarmUrl;
    }

    public UnifiedAlarmNotifyHistoryVO setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public UnifiedAlarmNotifyHistoryVO setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
        this.alarmTargetDeleted = alarmTargetDeleted;
        return this;
    }
    public Boolean getAlarmTargetDeleted() {
        return this.alarmTargetDeleted;
    }

    public UnifiedAlarmNotifyHistoryVO setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnifiedAlarmNotifyHistoryVO setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
