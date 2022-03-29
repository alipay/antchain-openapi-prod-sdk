// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmEventVO extends TeaModel {
    // 告警事件id
    @NameInMap("alarm_event_id")
    public String alarmEventId;

    // 告警内容
    @NameInMap("alarm_content")
    public String alarmContent;

    // 告警等级
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // 触发状态
    @NameInMap("status")
    public Long status;

    // 告警对象
    @NameInMap("alarm_target")
    public String alarmTarget;

    // 告警产生时间
    @NameInMap("alarm_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String alarmStartTime;

    // 告警恢复时间
    @NameInMap("alarm_recover_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String alarmRecoverTime;

    // 分组的告警历史集合
    @NameInMap("alarm_history_list")
    public java.util.List<UnifiedAlarmHistoryVO> alarmHistoryList;

    // 历史id
    @NameInMap("alarm_history_id")
    public Long alarmHistoryId;

    // type
    @NameInMap("alarm_target_type")
    public String alarmTargetType;

    // 告警类型
    @NameInMap("alarm_type")
    public String alarmType;

    // 数据源跳转url
    @NameInMap("alarm_url")
    public String alarmUrl;

    // 数据源名称
    @NameInMap("data_source_name")
    public String dataSourceName;

    // 目标对象是否已经删除
    @NameInMap("alarm_target_deleted")
    public Boolean alarmTargetDeleted;

    // 静默剩余时间
    @NameInMap("silence_remain_time")
    public Long silenceRemainTime;

    // 告警规则ID
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    public static UnifiedAlarmEventVO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmEventVO self = new UnifiedAlarmEventVO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmEventVO setAlarmEventId(String alarmEventId) {
        this.alarmEventId = alarmEventId;
        return this;
    }
    public String getAlarmEventId() {
        return this.alarmEventId;
    }

    public UnifiedAlarmEventVO setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
        return this;
    }
    public String getAlarmContent() {
        return this.alarmContent;
    }

    public UnifiedAlarmEventVO setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public UnifiedAlarmEventVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UnifiedAlarmEventVO setAlarmTarget(String alarmTarget) {
        this.alarmTarget = alarmTarget;
        return this;
    }
    public String getAlarmTarget() {
        return this.alarmTarget;
    }

    public UnifiedAlarmEventVO setAlarmStartTime(String alarmStartTime) {
        this.alarmStartTime = alarmStartTime;
        return this;
    }
    public String getAlarmStartTime() {
        return this.alarmStartTime;
    }

    public UnifiedAlarmEventVO setAlarmRecoverTime(String alarmRecoverTime) {
        this.alarmRecoverTime = alarmRecoverTime;
        return this;
    }
    public String getAlarmRecoverTime() {
        return this.alarmRecoverTime;
    }

    public UnifiedAlarmEventVO setAlarmHistoryList(java.util.List<UnifiedAlarmHistoryVO> alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }
    public java.util.List<UnifiedAlarmHistoryVO> getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    public UnifiedAlarmEventVO setAlarmHistoryId(Long alarmHistoryId) {
        this.alarmHistoryId = alarmHistoryId;
        return this;
    }
    public Long getAlarmHistoryId() {
        return this.alarmHistoryId;
    }

    public UnifiedAlarmEventVO setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public UnifiedAlarmEventVO setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public UnifiedAlarmEventVO setAlarmUrl(String alarmUrl) {
        this.alarmUrl = alarmUrl;
        return this;
    }
    public String getAlarmUrl() {
        return this.alarmUrl;
    }

    public UnifiedAlarmEventVO setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public UnifiedAlarmEventVO setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
        this.alarmTargetDeleted = alarmTargetDeleted;
        return this;
    }
    public Boolean getAlarmTargetDeleted() {
        return this.alarmTargetDeleted;
    }

    public UnifiedAlarmEventVO setSilenceRemainTime(Long silenceRemainTime) {
        this.silenceRemainTime = silenceRemainTime;
        return this;
    }
    public Long getSilenceRemainTime() {
        return this.silenceRemainTime;
    }

    public UnifiedAlarmEventVO setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

}
