// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmTplVO extends TeaModel {
    // 主键
    @NameInMap("id")
    public Long id;

    // 模板名称
    @NameInMap("name")
    public String name;

    // 用于区分规则模板和消息模板
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

    // 无数据告警 这是个开关
    @NameInMap("alarm_empty")
    public Long alarmEmpty;

    // 告警触发时通知 开关
    @NameInMap("notify_firing")
    public Long notifyFiring;

    // 告警恢复时通知 开关
    @NameInMap("notify_recovered")
    public Long notifyRecovered;

    // 告警无数据时通知 开关
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

    // 生效范围
    @NameInMap("scope")
    public String scope;

    // 如scope为租户 则值为tenant_id
    @NameInMap("scope_identity")
    public Long scopeIdentity;

    // 订阅关系的对象
    @NameInMap("alarm_sub")
    public String alarmSub;

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

    // 状态
    @NameInMap("status")
    public Long status;

    public static UnifiedAlarmTplVO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmTplVO self = new UnifiedAlarmTplVO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmTplVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UnifiedAlarmTplVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UnifiedAlarmTplVO setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UnifiedAlarmTplVO setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public UnifiedAlarmTplVO setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public UnifiedAlarmTplVO setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public UnifiedAlarmTplVO setPendingHit(Long pendingHit) {
        this.pendingHit = pendingHit;
        return this;
    }
    public Long getPendingHit() {
        return this.pendingHit;
    }

    public UnifiedAlarmTplVO setRecoveredHit(Long recoveredHit) {
        this.recoveredHit = recoveredHit;
        return this;
    }
    public Long getRecoveredHit() {
        return this.recoveredHit;
    }

    public UnifiedAlarmTplVO setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public UnifiedAlarmTplVO setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public UnifiedAlarmTplVO setEmergency(String emergency) {
        this.emergency = emergency;
        return this;
    }
    public String getEmergency() {
        return this.emergency;
    }

    public UnifiedAlarmTplVO setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

    public UnifiedAlarmTplVO setAlarmEmpty(Long alarmEmpty) {
        this.alarmEmpty = alarmEmpty;
        return this;
    }
    public Long getAlarmEmpty() {
        return this.alarmEmpty;
    }

    public UnifiedAlarmTplVO setNotifyFiring(Long notifyFiring) {
        this.notifyFiring = notifyFiring;
        return this;
    }
    public Long getNotifyFiring() {
        return this.notifyFiring;
    }

    public UnifiedAlarmTplVO setNotifyRecovered(Long notifyRecovered) {
        this.notifyRecovered = notifyRecovered;
        return this;
    }
    public Long getNotifyRecovered() {
        return this.notifyRecovered;
    }

    public UnifiedAlarmTplVO setNotifyEmpty(Long notifyEmpty) {
        this.notifyEmpty = notifyEmpty;
        return this;
    }
    public Long getNotifyEmpty() {
        return this.notifyEmpty;
    }

    public UnifiedAlarmTplVO setChannels(String channels) {
        this.channels = channels;
        return this;
    }
    public String getChannels() {
        return this.channels;
    }

    public UnifiedAlarmTplVO setNotifyTplId(Long notifyTplId) {
        this.notifyTplId = notifyTplId;
        return this;
    }
    public Long getNotifyTplId() {
        return this.notifyTplId;
    }

    public UnifiedAlarmTplVO setNotifyTimeFilter(String notifyTimeFilter) {
        this.notifyTimeFilter = notifyTimeFilter;
        return this;
    }
    public String getNotifyTimeFilter() {
        return this.notifyTimeFilter;
    }

    public UnifiedAlarmTplVO setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UnifiedAlarmTplVO setScopeIdentity(Long scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public Long getScopeIdentity() {
        return this.scopeIdentity;
    }

    public UnifiedAlarmTplVO setAlarmSub(String alarmSub) {
        this.alarmSub = alarmSub;
        return this;
    }
    public String getAlarmSub() {
        return this.alarmSub;
    }

    public UnifiedAlarmTplVO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UnifiedAlarmTplVO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public UnifiedAlarmTplVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public UnifiedAlarmTplVO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public UnifiedAlarmTplVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UnifiedAlarmTplVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UnifiedAlarmTplVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
