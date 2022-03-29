// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmRuleVO extends TeaModel {
    // 主键
    @NameInMap("id")
    public Long id;

    // 告警规则名称
    @NameInMap("name")
    public String name;

    // 分类 用于区分pql规则和自定义规则
    @NameInMap("category")
    public String category;

    // 规则配置
    @NameInMap("rule_config")
    public String ruleConfig;

    // 告警等级
    @NameInMap("level")
    public Long level;

    // 检测频率
    @NameInMap("step")
    public Long step;

    // 触发周期
    @NameInMap("pending_hit")
    public Long pendingHit;

    // 恢复周期
    @NameInMap("recovered_hit")
    public Long recoveredHit;

    // 静默时间
    @NameInMap("silence_time")
    public Long silenceTime;

    // 时区
    @NameInMap("time_zone")
    public String timeZone;

    // 应急处理人
    @NameInMap("emergency")
    public String emergency;

    // 应急处理链接
    @NameInMap("emergency_url")
    public String emergencyUrl;

    // 指标无数据触发告警 是个开关 1:打开 0:关闭
    @NameInMap("alarm_empty")
    public Long alarmEmpty;

    // 告警触发时通知 1:勾选 0:不勾选
    @NameInMap("notify_firing")
    public Long notifyFiring;

    // 告警恢复时通知 1:勾选 0:不勾选
    @NameInMap("notify_recovered")
    public Long notifyRecovered;

    // 告警无数据时通知 1:勾选 0:不勾选
    @NameInMap("notify_empty")
    public Long notifyEmpty;

    // 通知渠道
    @NameInMap("channels")
    public String channels;

    // 通知模板id
    @NameInMap("notify_tpl_id")
    public Long notifyTplId;

    // 通知时间
    @NameInMap("notify_time_filter")
    public String notifyTimeFilter;

    // 暂停开始时间
    @NameInMap("suspended_start_time")
    public Long suspendedStartTime;

    // 暂停结束时间
    @NameInMap("suspended_end_time")
    public Long suspendedEndTime;

    // 暂停的原因
    @NameInMap("suspended_reason")
    public String suspendedReason;

    // 唯一 ID，保证迁移前后不变
    @NameInMap("unique_identity")
    public String uniqueIdentity;

    // 标识告警规则迁移之前的 ID
    @NameInMap("source_id")
    public String sourceId;

    // 启停状态 开关
    @NameInMap("status")
    public Long status;

    // 软删除
    @NameInMap("deleted")
    public Long deleted;

    // 租户id
    @NameInMap("tenant_id")
    public Long tenantId;

    // 工作空间id
    @NameInMap("workspace_id")
    public Long workspaceId;

    // 创建人
    @NameInMap("creator")
    public String creator;

    // 修改人
    @NameInMap("modifier")
    public String modifier;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 告警状态
    @NameInMap("alarm_status")
    public Long alarmStatus;

    // 告警条件简介
    @NameInMap("conditions_des")
    public java.util.List<String> conditionsDes;

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

    public static UnifiedAlarmRuleVO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmRuleVO self = new UnifiedAlarmRuleVO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmRuleVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UnifiedAlarmRuleVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UnifiedAlarmRuleVO setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UnifiedAlarmRuleVO setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public UnifiedAlarmRuleVO setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public UnifiedAlarmRuleVO setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public UnifiedAlarmRuleVO setPendingHit(Long pendingHit) {
        this.pendingHit = pendingHit;
        return this;
    }
    public Long getPendingHit() {
        return this.pendingHit;
    }

    public UnifiedAlarmRuleVO setRecoveredHit(Long recoveredHit) {
        this.recoveredHit = recoveredHit;
        return this;
    }
    public Long getRecoveredHit() {
        return this.recoveredHit;
    }

    public UnifiedAlarmRuleVO setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public UnifiedAlarmRuleVO setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public UnifiedAlarmRuleVO setEmergency(String emergency) {
        this.emergency = emergency;
        return this;
    }
    public String getEmergency() {
        return this.emergency;
    }

    public UnifiedAlarmRuleVO setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

    public UnifiedAlarmRuleVO setAlarmEmpty(Long alarmEmpty) {
        this.alarmEmpty = alarmEmpty;
        return this;
    }
    public Long getAlarmEmpty() {
        return this.alarmEmpty;
    }

    public UnifiedAlarmRuleVO setNotifyFiring(Long notifyFiring) {
        this.notifyFiring = notifyFiring;
        return this;
    }
    public Long getNotifyFiring() {
        return this.notifyFiring;
    }

    public UnifiedAlarmRuleVO setNotifyRecovered(Long notifyRecovered) {
        this.notifyRecovered = notifyRecovered;
        return this;
    }
    public Long getNotifyRecovered() {
        return this.notifyRecovered;
    }

    public UnifiedAlarmRuleVO setNotifyEmpty(Long notifyEmpty) {
        this.notifyEmpty = notifyEmpty;
        return this;
    }
    public Long getNotifyEmpty() {
        return this.notifyEmpty;
    }

    public UnifiedAlarmRuleVO setChannels(String channels) {
        this.channels = channels;
        return this;
    }
    public String getChannels() {
        return this.channels;
    }

    public UnifiedAlarmRuleVO setNotifyTplId(Long notifyTplId) {
        this.notifyTplId = notifyTplId;
        return this;
    }
    public Long getNotifyTplId() {
        return this.notifyTplId;
    }

    public UnifiedAlarmRuleVO setNotifyTimeFilter(String notifyTimeFilter) {
        this.notifyTimeFilter = notifyTimeFilter;
        return this;
    }
    public String getNotifyTimeFilter() {
        return this.notifyTimeFilter;
    }

    public UnifiedAlarmRuleVO setSuspendedStartTime(Long suspendedStartTime) {
        this.suspendedStartTime = suspendedStartTime;
        return this;
    }
    public Long getSuspendedStartTime() {
        return this.suspendedStartTime;
    }

    public UnifiedAlarmRuleVO setSuspendedEndTime(Long suspendedEndTime) {
        this.suspendedEndTime = suspendedEndTime;
        return this;
    }
    public Long getSuspendedEndTime() {
        return this.suspendedEndTime;
    }

    public UnifiedAlarmRuleVO setSuspendedReason(String suspendedReason) {
        this.suspendedReason = suspendedReason;
        return this;
    }
    public String getSuspendedReason() {
        return this.suspendedReason;
    }

    public UnifiedAlarmRuleVO setUniqueIdentity(String uniqueIdentity) {
        this.uniqueIdentity = uniqueIdentity;
        return this;
    }
    public String getUniqueIdentity() {
        return this.uniqueIdentity;
    }

    public UnifiedAlarmRuleVO setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UnifiedAlarmRuleVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UnifiedAlarmRuleVO setDeleted(Long deleted) {
        this.deleted = deleted;
        return this;
    }
    public Long getDeleted() {
        return this.deleted;
    }

    public UnifiedAlarmRuleVO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UnifiedAlarmRuleVO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public UnifiedAlarmRuleVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public UnifiedAlarmRuleVO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public UnifiedAlarmRuleVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UnifiedAlarmRuleVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UnifiedAlarmRuleVO setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }
    public Long getAlarmStatus() {
        return this.alarmStatus;
    }

    public UnifiedAlarmRuleVO setConditionsDes(java.util.List<String> conditionsDes) {
        this.conditionsDes = conditionsDes;
        return this;
    }
    public java.util.List<String> getConditionsDes() {
        return this.conditionsDes;
    }

    public UnifiedAlarmRuleVO setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public UnifiedAlarmRuleVO setAlarmUrl(String alarmUrl) {
        this.alarmUrl = alarmUrl;
        return this;
    }
    public String getAlarmUrl() {
        return this.alarmUrl;
    }

    public UnifiedAlarmRuleVO setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public UnifiedAlarmRuleVO setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
        this.alarmTargetDeleted = alarmTargetDeleted;
        return this;
    }
    public Boolean getAlarmTargetDeleted() {
        return this.alarmTargetDeleted;
    }

}
