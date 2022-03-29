// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 统一告警规则
    public class UnifiedAlarmRuleVO : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 告警规则名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 分类 用于区分pql规则和自定义规则
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        // 规则配置
        [NameInMap("rule_config")]
        [Validation(Required=false)]
        public string RuleConfig { get; set; }

        // 告警等级
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

        // 检测频率
        [NameInMap("step")]
        [Validation(Required=false)]
        public long? Step { get; set; }

        // 触发周期
        [NameInMap("pending_hit")]
        [Validation(Required=false)]
        public long? PendingHit { get; set; }

        // 恢复周期
        [NameInMap("recovered_hit")]
        [Validation(Required=false)]
        public long? RecoveredHit { get; set; }

        // 静默时间
        [NameInMap("silence_time")]
        [Validation(Required=false)]
        public long? SilenceTime { get; set; }

        // 时区
        [NameInMap("time_zone")]
        [Validation(Required=false)]
        public string TimeZone { get; set; }

        // 应急处理人
        [NameInMap("emergency")]
        [Validation(Required=false)]
        public string Emergency { get; set; }

        // 应急处理链接
        [NameInMap("emergency_url")]
        [Validation(Required=false)]
        public string EmergencyUrl { get; set; }

        // 指标无数据触发告警 是个开关 1:打开 0:关闭
        [NameInMap("alarm_empty")]
        [Validation(Required=false)]
        public long? AlarmEmpty { get; set; }

        // 告警触发时通知 1:勾选 0:不勾选
        [NameInMap("notify_firing")]
        [Validation(Required=false)]
        public long? NotifyFiring { get; set; }

        // 告警恢复时通知 1:勾选 0:不勾选
        [NameInMap("notify_recovered")]
        [Validation(Required=false)]
        public long? NotifyRecovered { get; set; }

        // 告警无数据时通知 1:勾选 0:不勾选
        [NameInMap("notify_empty")]
        [Validation(Required=false)]
        public long? NotifyEmpty { get; set; }

        // 通知渠道
        [NameInMap("channels")]
        [Validation(Required=false)]
        public string Channels { get; set; }

        // 通知模板id
        [NameInMap("notify_tpl_id")]
        [Validation(Required=false)]
        public long? NotifyTplId { get; set; }

        // 通知时间
        [NameInMap("notify_time_filter")]
        [Validation(Required=false)]
        public string NotifyTimeFilter { get; set; }

        // 暂停开始时间
        [NameInMap("suspended_start_time")]
        [Validation(Required=false)]
        public long? SuspendedStartTime { get; set; }

        // 暂停结束时间
        [NameInMap("suspended_end_time")]
        [Validation(Required=false)]
        public long? SuspendedEndTime { get; set; }

        // 暂停的原因
        [NameInMap("suspended_reason")]
        [Validation(Required=false)]
        public string SuspendedReason { get; set; }

        // 唯一 ID，保证迁移前后不变
        [NameInMap("unique_identity")]
        [Validation(Required=false)]
        public string UniqueIdentity { get; set; }

        // 标识告警规则迁移之前的 ID
        [NameInMap("source_id")]
        [Validation(Required=false)]
        public string SourceId { get; set; }

        // 启停状态 开关
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 软删除
        [NameInMap("deleted")]
        [Validation(Required=false)]
        public long? Deleted { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        // 工作空间id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

        // 创建人
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 修改人
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 告警状态
        [NameInMap("alarm_status")]
        [Validation(Required=false)]
        public long? AlarmStatus { get; set; }

        // 告警条件简介
        [NameInMap("conditions_des")]
        [Validation(Required=false)]
        public List<string> ConditionsDes { get; set; }

        // 告警类型
        [NameInMap("alarm_type")]
        [Validation(Required=false)]
        public string AlarmType { get; set; }

        // 告警数据源跳转url
        [NameInMap("alarm_url")]
        [Validation(Required=false)]
        public string AlarmUrl { get; set; }

        // 数据源名称
        [NameInMap("data_source_name")]
        [Validation(Required=false)]
        public string DataSourceName { get; set; }

        // 目标对象是否删除
        [NameInMap("alarm_target_deleted")]
        [Validation(Required=false)]
        public bool? AlarmTargetDeleted { get; set; }

    }

}
