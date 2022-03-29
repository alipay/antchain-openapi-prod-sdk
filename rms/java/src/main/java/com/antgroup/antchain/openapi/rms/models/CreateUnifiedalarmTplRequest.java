// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateUnifiedalarmTplRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 模板名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 区分自定义还是pql
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 规则配置
    @NameInMap("rule_config")
    @Validation(required = true)
    public String ruleConfig;

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
    @NameInMap("alarm_subs")
    public java.util.List<UnifiedAlarmSubDTO> alarmSubs;

    // 静默期
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

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 指标无数据触发告警 这是个开关 1表示打开 0表示闭合
    @NameInMap("alarm_nodata")
    @Validation(required = true)
    public Long alarmNodata;

    public static CreateUnifiedalarmTplRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUnifiedalarmTplRequest self = new CreateUnifiedalarmTplRequest();
        return TeaModel.build(map, self);
    }

    public CreateUnifiedalarmTplRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUnifiedalarmTplRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUnifiedalarmTplRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateUnifiedalarmTplRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public CreateUnifiedalarmTplRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public CreateUnifiedalarmTplRequest setEmergency(String emergency) {
        this.emergency = emergency;
        return this;
    }
    public String getEmergency() {
        return this.emergency;
    }

    public CreateUnifiedalarmTplRequest setEmergencyUrl(String emergencyUrl) {
        this.emergencyUrl = emergencyUrl;
        return this;
    }
    public String getEmergencyUrl() {
        return this.emergencyUrl;
    }

    public CreateUnifiedalarmTplRequest setPendingHit(Long pendingHit) {
        this.pendingHit = pendingHit;
        return this;
    }
    public Long getPendingHit() {
        return this.pendingHit;
    }

    public CreateUnifiedalarmTplRequest setRecoveredHit(Long recoveredHit) {
        this.recoveredHit = recoveredHit;
        return this;
    }
    public Long getRecoveredHit() {
        return this.recoveredHit;
    }

    public CreateUnifiedalarmTplRequest setStep(Long step) {
        this.step = step;
        return this;
    }
    public Long getStep() {
        return this.step;
    }

    public CreateUnifiedalarmTplRequest setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public CreateUnifiedalarmTplRequest setAlarmSubs(java.util.List<UnifiedAlarmSubDTO> alarmSubs) {
        this.alarmSubs = alarmSubs;
        return this;
    }
    public java.util.List<UnifiedAlarmSubDTO> getAlarmSubs() {
        return this.alarmSubs;
    }

    public CreateUnifiedalarmTplRequest setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public CreateUnifiedalarmTplRequest setNotifyFiring(Long notifyFiring) {
        this.notifyFiring = notifyFiring;
        return this;
    }
    public Long getNotifyFiring() {
        return this.notifyFiring;
    }

    public CreateUnifiedalarmTplRequest setNotifyRecovered(Long notifyRecovered) {
        this.notifyRecovered = notifyRecovered;
        return this;
    }
    public Long getNotifyRecovered() {
        return this.notifyRecovered;
    }

    public CreateUnifiedalarmTplRequest setNotifyNodata(Long notifyNodata) {
        this.notifyNodata = notifyNodata;
        return this;
    }
    public Long getNotifyNodata() {
        return this.notifyNodata;
    }

    public CreateUnifiedalarmTplRequest setNotifyTimeFilter(TimeFilter notifyTimeFilter) {
        this.notifyTimeFilter = notifyTimeFilter;
        return this;
    }
    public TimeFilter getNotifyTimeFilter() {
        return this.notifyTimeFilter;
    }

    public CreateUnifiedalarmTplRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateUnifiedalarmTplRequest setAlarmNodata(Long alarmNodata) {
        this.alarmNodata = alarmNodata;
        return this;
    }
    public Long getAlarmNodata() {
        return this.alarmNodata;
    }

}
