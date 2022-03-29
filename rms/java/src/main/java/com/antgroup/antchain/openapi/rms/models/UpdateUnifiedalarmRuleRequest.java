// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateUnifiedalarmRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 规则名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 规则分类
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 规则配置
    @NameInMap("rule_config")
    @Validation(required = true)
    public String ruleConfig;

    // 指标无数据时触发告警
    @NameInMap("alarm_nodata")
    @Validation(required = true)
    public Long alarmNodata;

    // 告警等级
    @NameInMap("level")
    @Validation(required = true)
    public Long level;

    // 应急处理人
    @NameInMap("emergency")
    public String emergency;

    // 应急处理链接
    @NameInMap("emergency_url")
    public String emergencyUrl;

    // 触发周期
    @NameInMap("pending_hit")
    @Validation(required = true)
    public Long pendingHit;

    // 恢复周期
    @NameInMap("recovered_hit")
    @Validation(required = true)
    public Long recoveredHit;

    // 检测频率
    @NameInMap("step")
    @Validation(required = true)
    public Long step;

    // 通知渠道 
    @NameInMap("channels")
    @Validation(required = true)
    public java.util.List<String> channels;

    // 通知对象
    @NameInMap("notify_target")
    public java.util.List<UnifiedAlarmSubDTO> notifyTarget;

    // 静默时间
    @NameInMap("silence_time")
    @Validation(required = true)
    public Long silenceTime;

    // 告警触发时通知 
    @NameInMap("notify_firing")
    @Validation(required = true)
    public Long notifyFiring;

    // 告警恢复时通知
    @NameInMap("notify_recovered")
    @Validation(required = true)
    public Long notifyRecovered;

    // 告警无数据时通知
    @NameInMap("notify_nodata")
    @Validation(required = true)
    public Long notifyNodata;

    // 通知时间
    @NameInMap("notify_time_filter")
    public TimeFilter notifyTimeFilter;

    // 启停状态
    @NameInMap("status")
    public String status;

    // 暂停开始时间
    @NameInMap("suspended_start_time")
    public Long suspendedStartTime;

    // 告警结束时间
    @NameInMap("suspended_end_time")
    public Long suspendedEndTime;

    // 暂停原因
    @NameInMap("suspended_reason")
    public String suspendedReason;

    // 工作空间名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static UpdateUnifiedalarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnifiedalarmRuleRequest self = new UpdateUnifiedalarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUnifiedalarmRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateUnifiedalarmRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateUnifiedalarmRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateUnifiedalarmRuleRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateUnifiedalarmRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public UpdateUnifiedalarmRuleRequest setAlarmNodata(Long alarmNodata) {
        this.alarmNodata = alarmNodata;
        return this;
    }
    public Long getAlarmNodata() {
        return this.alarmNodata;
    }

    public UpdateUnifiedalarmRuleRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public UpdateUnifiedalarmRuleRequest setEmergency(String emergency) {
        this.emergency = emergency;
        return this;
    }
    public String getEmergency() {
        return this.emergency;
    }

    public UpdateUnifiedalarmRuleRequest setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

    public UpdateUnifiedalarmRuleRequest setPendingHit(Long pendingHit) {
        this.pendingHit = pendingHit;
        return this;
    }
    public Long getPendingHit() {
        return this.pendingHit;
    }

    public UpdateUnifiedalarmRuleRequest setRecoveredHit(Long recoveredHit) {
        this.recoveredHit = recoveredHit;
        return this;
    }
    public Long getRecoveredHit() {
        return this.recoveredHit;
    }

    public UpdateUnifiedalarmRuleRequest setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public UpdateUnifiedalarmRuleRequest setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public UpdateUnifiedalarmRuleRequest setNotifyTarget(java.util.List<UnifiedAlarmSubDTO> notifyTarget) {
        this.notifyTarget = notifyTarget;
        return this;
    }
    public java.util.List<UnifiedAlarmSubDTO> getNotifyTarget() {
        return this.notifyTarget;
    }

    public UpdateUnifiedalarmRuleRequest setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public UpdateUnifiedalarmRuleRequest setNotifyFiring(Long notifyFiring) {
        this.notifyFiring = notifyFiring;
        return this;
    }
    public Long getNotifyFiring() {
        return this.notifyFiring;
    }

    public UpdateUnifiedalarmRuleRequest setNotifyRecovered(Long notifyRecovered) {
        this.notifyRecovered = notifyRecovered;
        return this;
    }
    public Long getNotifyRecovered() {
        return this.notifyRecovered;
    }

    public UpdateUnifiedalarmRuleRequest setNotifyNodata(Long notifyNodata) {
        this.notifyNodata = notifyNodata;
        return this;
    }
    public Long getNotifyNodata() {
        return this.notifyNodata;
    }

    public UpdateUnifiedalarmRuleRequest setNotifyTimeFilter(TimeFilter notifyTimeFilter) {
        this.notifyTimeFilter = notifyTimeFilter;
        return this;
    }
    public TimeFilter getNotifyTimeFilter() {
        return this.notifyTimeFilter;
    }

    public UpdateUnifiedalarmRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateUnifiedalarmRuleRequest setSuspendedStartTime(Long suspendedStartTime) {
        this.suspendedStartTime = suspendedStartTime;
        return this;
    }
    public Long getSuspendedStartTime() {
        return this.suspendedStartTime;
    }

    public UpdateUnifiedalarmRuleRequest setSuspendedEndTime(Long suspendedEndTime) {
        this.suspendedEndTime = suspendedEndTime;
        return this;
    }
    public Long getSuspendedEndTime() {
        return this.suspendedEndTime;
    }

    public UpdateUnifiedalarmRuleRequest setSuspendedReason(String suspendedReason) {
        this.suspendedReason = suspendedReason;
        return this;
    }
    public String getSuspendedReason() {
        return this.suspendedReason;
    }

    public UpdateUnifiedalarmRuleRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
