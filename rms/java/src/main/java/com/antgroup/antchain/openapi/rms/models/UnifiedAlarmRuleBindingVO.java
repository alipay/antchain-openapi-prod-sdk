// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmRuleBindingVO extends TeaModel {
    // 租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 工作空间 ID
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // 监控对象类型
    @NameInMap("alarm_target_type")
    @Validation(required = true)
    public String alarmTargetType;

    // 监控对象名称
    @NameInMap("alarm_target_identity")
    public String alarmTargetIdentity;

    // 告警规则 ID
    @NameInMap("alarm_rule_id")
    @Validation(required = true)
    public Long alarmRuleId;

    // 数据源类型
    @NameInMap("datasource_type")
    public String datasourceType;

    // 数据源 ID
    @NameInMap("datasource")
    public String datasource;

    // 告警规则详情
    @NameInMap("alarm_rule")
    public UnifiedAlarmRuleVO alarmRule;

    public static UnifiedAlarmRuleBindingVO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmRuleBindingVO self = new UnifiedAlarmRuleBindingVO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmRuleBindingVO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UnifiedAlarmRuleBindingVO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public UnifiedAlarmRuleBindingVO setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public UnifiedAlarmRuleBindingVO setAlarmTargetIdentity(String alarmTargetIdentity) {
        this.alarmTargetIdentity = alarmTargetIdentity;
        return this;
    }
    public String getAlarmTargetIdentity() {
        return this.alarmTargetIdentity;
    }

    public UnifiedAlarmRuleBindingVO setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public UnifiedAlarmRuleBindingVO setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public UnifiedAlarmRuleBindingVO setDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }
    public String getDatasource() {
        return this.datasource;
    }

    public UnifiedAlarmRuleBindingVO setAlarmRule(UnifiedAlarmRuleVO alarmRule) {
        this.alarmRule = alarmRule;
        return this;
    }
    public UnifiedAlarmRuleVO getAlarmRule() {
        return this.alarmRule;
    }

}
