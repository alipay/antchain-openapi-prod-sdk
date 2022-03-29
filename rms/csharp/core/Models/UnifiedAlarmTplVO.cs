// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 统一告警规则模板
    public class UnifiedAlarmTplVO : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 模板名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 用于区分规则模板和消息模板
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

        // 无数据告警 这是个开关
        [NameInMap("alarm_empty")]
        [Validation(Required=false)]
        public long? AlarmEmpty { get; set; }

        // 告警触发时通知 开关
        [NameInMap("notify_firing")]
        [Validation(Required=false)]
        public long? NotifyFiring { get; set; }

        // 告警恢复时通知 开关
        [NameInMap("notify_recovered")]
        [Validation(Required=false)]
        public long? NotifyRecovered { get; set; }

        // 告警无数据时通知 开关
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

        // 生效范围
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 如scope为租户 则值为tenant_id
        [NameInMap("scope_identity")]
        [Validation(Required=false)]
        public long? ScopeIdentity { get; set; }

        // 订阅关系的对象
        [NameInMap("alarm_sub")]
        [Validation(Required=false)]
        public string AlarmSub { get; set; }

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

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
