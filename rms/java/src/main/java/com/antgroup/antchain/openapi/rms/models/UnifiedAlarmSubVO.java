// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmSubVO extends TeaModel {
    // 主键
    @NameInMap("id")
    public Long id;

    // 告警规则id
    @NameInMap("alarm_rule_id")
    public Long alarmRuleId;

    // 告警模板id
    @NameInMap("alarm_tpl_id")
    public Long alarmTplId;

    // 订阅者的类型
    @NameInMap("subscriber_type")
    public String subscriberType;

    // 订阅者
    @NameInMap("subscriber")
    public String subscriber;

    // 订阅者名称
    @NameInMap("subscriber_name")
    public String subscriberName;

    // 租户id
    @NameInMap("tenant_id")
    public Long tenantId;

    // 工作空间id
    @NameInMap("workspace_id")
    public Long workspaceId;

    // 创建人,可以理解为当前登录用户
    @NameInMap("creator")
    public String creator;

    // 修改人,同creator
    @NameInMap("modifier")
    public String modifier;

    // 创建日期
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改日期
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 静默时间
    @NameInMap("silence_time")
    public Long silenceTime;

    // 通知渠道
    @NameInMap("channel")
    public String channel;

    // 订阅者来源
    @NameInMap("subscriber_source")
    public String subscriberSource;

    public static UnifiedAlarmSubVO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmSubVO self = new UnifiedAlarmSubVO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmSubVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UnifiedAlarmSubVO setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public UnifiedAlarmSubVO setAlarmTplId(Long alarmTplId) {
        this.alarmTplId = alarmTplId;
        return this;
    }
    public Long getAlarmTplId() {
        return this.alarmTplId;
    }

    public UnifiedAlarmSubVO setSubscriberType(String subscriberType) {
        this.subscriberType = subscriberType;
        return this;
    }
    public String getSubscriberType() {
        return this.subscriberType;
    }

    public UnifiedAlarmSubVO setSubscriber(String subscriber) {
        this.subscriber = subscriber;
        return this;
    }
    public String getSubscriber() {
        return this.subscriber;
    }

    public UnifiedAlarmSubVO setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
        return this;
    }
    public String getSubscriberName() {
        return this.subscriberName;
    }

    public UnifiedAlarmSubVO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UnifiedAlarmSubVO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public UnifiedAlarmSubVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public UnifiedAlarmSubVO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public UnifiedAlarmSubVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UnifiedAlarmSubVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UnifiedAlarmSubVO setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public UnifiedAlarmSubVO setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UnifiedAlarmSubVO setSubscriberSource(String subscriberSource) {
        this.subscriberSource = subscriberSource;
        return this;
    }
    public String getSubscriberSource() {
        return this.subscriberSource;
    }

}
