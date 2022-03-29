// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmHistoryDTO extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // alarm_rule_name
    @NameInMap("alarm_rule_name")
    @Validation(required = true)
    public String alarmRuleName;

    // msg
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    // alarm_pkg_id
    @NameInMap("alarm_pkg_id")
    @Validation(required = true)
    public Long alarmPkgId;

    // custom_plugin_id
    @NameInMap("custom_plugin_id")
    @Validation(required = true)
    public Long customPluginId;

    // meta_group_id
    @NameInMap("meta_group_id")
    @Validation(required = true)
    public Long metaGroupId;

    // stack_universal_tableId
    @NameInMap("stack_universal_table_id")
    @Validation(required = true)
    public String stackUniversalTableId;

    // tag_value_id
    @NameInMap("tag_value_id")
    @Validation(required = true)
    public Long tagValueId;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // biz_domain_id
    @NameInMap("biz_domain_id")
    @Validation(required = true)
    public Long bizDomainId;

    // alarm_time
    @NameInMap("alarm_time")
    @Validation(required = true)
    public Long alarmTime;

    // alarm_level
    @NameInMap("alarm_level")
    @Validation(required = true)
    public Long alarmLevel;

    // stack_id
    @NameInMap("stack_id")
    @Validation(required = true)
    public Long stackId;

    // stack_entity_id
    @NameInMap("stack_entity_id")
    @Validation(required = true)
    public Long stackEntityId;

    // stack_monitor_item_name
    @NameInMap("stack_monitor_item_name")
    @Validation(required = true)
    public String stackMonitorItemName;

    // alarm_source_type
    @NameInMap("alarm_source_type")
    @Validation(required = true)
    public String alarmSourceType;

    // biz_id
    @NameInMap("biz_id")
    @Validation(required = true)
    public Long bizId;

    // biz_groupby_name
    @NameInMap("biz_groupby_name")
    @Validation(required = true)
    public String bizGroupbyName;

    // multi_alarm_id
    @NameInMap("multi_alarm_id")
    @Validation(required = true)
    public Long multiAlarmId;

    // context
    @NameInMap("context")
    @Validation(required = true)
    public java.util.List<KeySet> context;

    public static AlarmHistoryDTO build(java.util.Map<String, ?> map) throws Exception {
        AlarmHistoryDTO self = new AlarmHistoryDTO();
        return TeaModel.build(map, self);
    }

    public AlarmHistoryDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlarmHistoryDTO setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }
    public String getAlarmRuleName() {
        return this.alarmRuleName;
    }

    public AlarmHistoryDTO setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AlarmHistoryDTO setAlarmPkgId(Long alarmPkgId) {
        this.alarmPkgId = alarmPkgId;
        return this;
    }
    public Long getAlarmPkgId() {
        return this.alarmPkgId;
    }

    public AlarmHistoryDTO setCustomPluginId(Long customPluginId) {
        this.customPluginId = customPluginId;
        return this;
    }
    public Long getCustomPluginId() {
        return this.customPluginId;
    }

    public AlarmHistoryDTO setMetaGroupId(Long metaGroupId) {
        this.metaGroupId = metaGroupId;
        return this;
    }
    public Long getMetaGroupId() {
        return this.metaGroupId;
    }

    public AlarmHistoryDTO setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

    public AlarmHistoryDTO setTagValueId(Long tagValueId) {
        this.tagValueId = tagValueId;
        return this;
    }
    public Long getTagValueId() {
        return this.tagValueId;
    }

    public AlarmHistoryDTO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public AlarmHistoryDTO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public AlarmHistoryDTO setBizDomainId(Long bizDomainId) {
        this.bizDomainId = bizDomainId;
        return this;
    }
    public Long getBizDomainId() {
        return this.bizDomainId;
    }

    public AlarmHistoryDTO setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public Long getAlarmTime() {
        return this.alarmTime;
    }

    public AlarmHistoryDTO setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public AlarmHistoryDTO setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

    public AlarmHistoryDTO setStackEntityId(Long stackEntityId) {
        this.stackEntityId = stackEntityId;
        return this;
    }
    public Long getStackEntityId() {
        return this.stackEntityId;
    }

    public AlarmHistoryDTO setStackMonitorItemName(String stackMonitorItemName) {
        this.stackMonitorItemName = stackMonitorItemName;
        return this;
    }
    public String getStackMonitorItemName() {
        return this.stackMonitorItemName;
    }

    public AlarmHistoryDTO setAlarmSourceType(String alarmSourceType) {
        this.alarmSourceType = alarmSourceType;
        return this;
    }
    public String getAlarmSourceType() {
        return this.alarmSourceType;
    }

    public AlarmHistoryDTO setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public AlarmHistoryDTO setBizGroupbyName(String bizGroupbyName) {
        this.bizGroupbyName = bizGroupbyName;
        return this;
    }
    public String getBizGroupbyName() {
        return this.bizGroupbyName;
    }

    public AlarmHistoryDTO setMultiAlarmId(Long multiAlarmId) {
        this.multiAlarmId = multiAlarmId;
        return this;
    }
    public Long getMultiAlarmId() {
        return this.multiAlarmId;
    }

    public AlarmHistoryDTO setContext(java.util.List<KeySet> context) {
        this.context = context;
        return this;
    }
    public java.util.List<KeySet> getContext() {
        return this.context;
    }

}
