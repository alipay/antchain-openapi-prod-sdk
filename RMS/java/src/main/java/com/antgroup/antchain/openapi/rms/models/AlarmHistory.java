// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AlarmHistory extends TeaModel {
    // alarm_level
    @NameInMap("alarm_level")
    public Long alarmLevel;

    // alarmPkgId
    @NameInMap("alarm_pkg_id")
    public Long alarmPkgId;

    // alarm_rule_name
    @NameInMap("alarm_rule_name")
    public String alarmRuleName;

    // alarmSourceType
    @NameInMap("alarm_source_type")
    public String alarmSourceType;

    // alarm_time
    @NameInMap("alarm_time")
    public Long alarmTime;

    // biz_domain_id
    @NameInMap("biz_domain_id")
    public Long bizDomainId;

    // context
    @NameInMap("context")
    public String context;

    // custom_plugin_id
    @NameInMap("custom_plugin_id")
    public Long customPluginId;

    // id
    @NameInMap("id")
    public Long id;

    // meta_group_id
    @NameInMap("meta_group_id")
    public Long metaGroupId;

    // msg
    @NameInMap("msg")
    public String msg;

    // stack_entity_id
    @NameInMap("stack_entity_id")
    public Long stackEntityId;

    // stack_id
    @NameInMap("stack_id")
    public Long stackId;

    // stack_monitor_item_name
    @NameInMap("stack_monitor_item_name")
    public String stackMonitorItemName;

    // stack_universal_table_id
    @NameInMap("stack_universal_table_id")
    public String stackUniversalTableId;

    // tag_value_id
    @NameInMap("tag_value_id")
    public Long tagValueId;

    // tenant_id
    @NameInMap("tenant_id")
    public Long tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public Long workspaceId;

    public static AlarmHistory build(java.util.Map<String, ?> map) throws Exception {
        AlarmHistory self = new AlarmHistory();
        return TeaModel.build(map, self);
    }

    public AlarmHistory setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public AlarmHistory setAlarmPkgId(Long alarmPkgId) {
        this.alarmPkgId = alarmPkgId;
        return this;
    }
    public Long getAlarmPkgId() {
        return this.alarmPkgId;
    }

    public AlarmHistory setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }
    public String getAlarmRuleName() {
        return this.alarmRuleName;
    }

    public AlarmHistory setAlarmSourceType(String alarmSourceType) {
        this.alarmSourceType = alarmSourceType;
        return this;
    }
    public String getAlarmSourceType() {
        return this.alarmSourceType;
    }

    public AlarmHistory setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public Long getAlarmTime() {
        return this.alarmTime;
    }

    public AlarmHistory setBizDomainId(Long bizDomainId) {
        this.bizDomainId = bizDomainId;
        return this;
    }
    public Long getBizDomainId() {
        return this.bizDomainId;
    }

    public AlarmHistory setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public AlarmHistory setCustomPluginId(Long customPluginId) {
        this.customPluginId = customPluginId;
        return this;
    }
    public Long getCustomPluginId() {
        return this.customPluginId;
    }

    public AlarmHistory setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlarmHistory setMetaGroupId(Long metaGroupId) {
        this.metaGroupId = metaGroupId;
        return this;
    }
    public Long getMetaGroupId() {
        return this.metaGroupId;
    }

    public AlarmHistory setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AlarmHistory setStackEntityId(Long stackEntityId) {
        this.stackEntityId = stackEntityId;
        return this;
    }
    public Long getStackEntityId() {
        return this.stackEntityId;
    }

    public AlarmHistory setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

    public AlarmHistory setStackMonitorItemName(String stackMonitorItemName) {
        this.stackMonitorItemName = stackMonitorItemName;
        return this;
    }
    public String getStackMonitorItemName() {
        return this.stackMonitorItemName;
    }

    public AlarmHistory setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

    public AlarmHistory setTagValueId(Long tagValueId) {
        this.tagValueId = tagValueId;
        return this;
    }
    public Long getTagValueId() {
        return this.tagValueId;
    }

    public AlarmHistory setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public AlarmHistory setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
