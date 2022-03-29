// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmHistoryVO extends TeaModel {
    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 事件id
    @NameInMap("event_id")
    @Validation(required = true)
    public String eventId;

    // 告警规则id
    @NameInMap("alarm_rule_id")
    @Validation(required = true)
    public Long alarmRuleId;

    // 告警规则唯一标识
    @NameInMap("unique_identity")
    @Validation(required = true)
    public String uniqueIdentity;

    // 告警规则名字
    @NameInMap("alarm_rule_name")
    @Validation(required = true)
    public String alarmRuleName;

    // 告警等级
    @NameInMap("alarm_level")
    @Validation(required = true)
    public Long alarmLevel;

    // 告警时间
    @NameInMap("alarm_time")
    @Validation(required = true)
    public Long alarmTime;

    // 告警内容
    @NameInMap("alarm_content")
    @Validation(required = true)
    public String alarmContent;

    // 告警对象
    @NameInMap("alarm_target")
    @Validation(required = true)
    public String alarmTarget;

    // 触发状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 工作区id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // type
    @NameInMap("alarm_target_type")
    public String alarmTargetType;

    // 告警详情
    @NameInMap("alarm_detail")
    @Validation(required = true)
    public String alarmDetail;

    // 数据源名称
    @NameInMap("data_source_name")
    public String dataSourceName;

    // 数据源跳转url
    @NameInMap("alarm_url")
    public String alarmUrl;

    // 告警类型
    @NameInMap("alarm_type")
    public String alarmType;

    // 目标对象是否已经删除
    @NameInMap("alarm_target_deleted")
    public Boolean alarmTargetDeleted;

    public static UnifiedAlarmHistoryVO build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmHistoryVO self = new UnifiedAlarmHistoryVO();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmHistoryVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UnifiedAlarmHistoryVO setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public UnifiedAlarmHistoryVO setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }
    public Long getAlarmRuleId() {
        return this.alarmRuleId;
    }

    public UnifiedAlarmHistoryVO setUniqueIdentity(String uniqueIdentity) {
        this.uniqueIdentity = uniqueIdentity;
        return this;
    }
    public String getUniqueIdentity() {
        return this.uniqueIdentity;
    }

    public UnifiedAlarmHistoryVO setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }
    public String getAlarmRuleName() {
        return this.alarmRuleName;
    }

    public UnifiedAlarmHistoryVO setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }
    public Long getAlarmLevel() {
        return this.alarmLevel;
    }

    public UnifiedAlarmHistoryVO setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }
    public Long getAlarmTime() {
        return this.alarmTime;
    }

    public UnifiedAlarmHistoryVO setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
        return this;
    }
    public String getAlarmContent() {
        return this.alarmContent;
    }

    public UnifiedAlarmHistoryVO setAlarmTarget(String alarmTarget) {
        this.alarmTarget = alarmTarget;
        return this;
    }
    public String getAlarmTarget() {
        return this.alarmTarget;
    }

    public UnifiedAlarmHistoryVO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UnifiedAlarmHistoryVO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public UnifiedAlarmHistoryVO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public UnifiedAlarmHistoryVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public UnifiedAlarmHistoryVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UnifiedAlarmHistoryVO setAlarmTargetType(String alarmTargetType) {
        this.alarmTargetType = alarmTargetType;
        return this;
    }
    public String getAlarmTargetType() {
        return this.alarmTargetType;
    }

    public UnifiedAlarmHistoryVO setAlarmDetail(String alarmDetail) {
        this.alarmDetail = alarmDetail;
        return this;
    }
    public String getAlarmDetail() {
        return this.alarmDetail;
    }

    public UnifiedAlarmHistoryVO setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public UnifiedAlarmHistoryVO setAlarmUrl(String alarmUrl) {
        this.alarmUrl = alarmUrl;
        return this;
    }
    public String getAlarmUrl() {
        return this.alarmUrl;
    }

    public UnifiedAlarmHistoryVO setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public UnifiedAlarmHistoryVO setAlarmTargetDeleted(Boolean alarmTargetDeleted) {
        this.alarmTargetDeleted = alarmTargetDeleted;
        return this;
    }
    public Boolean getAlarmTargetDeleted() {
        return this.alarmTargetDeleted;
    }

}
