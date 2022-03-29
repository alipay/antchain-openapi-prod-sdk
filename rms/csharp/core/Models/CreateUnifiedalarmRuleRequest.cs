// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CreateUnifiedalarmRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 告警规则名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 标识符 区分规则是自定义规则还是pql规则
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 规则配置
        [NameInMap("rule_config")]
        [Validation(Required=true)]
        public string RuleConfig { get; set; }

        // 指标无数据触发告警 这是个开关 1表示打开 0表示闭合
        [NameInMap("alarm_nodata")]
        [Validation(Required=true)]
        public long? AlarmNodata { get; set; }

        // 告警等级
        [NameInMap("level")]
        [Validation(Required=true)]
        public long? Level { get; set; }

        // 应急处理人
        [NameInMap("emergency")]
        [Validation(Required=false)]
        public string Emergency { get; set; }

        // 应急处理链接
        [NameInMap("emergency_url")]
        [Validation(Required=false)]
        public string EmergencyUrl { get; set; }

        // 触发周期
        [NameInMap("pending_hit")]
        [Validation(Required=true)]
        public long? PendingHit { get; set; }

        // 恢复周期
        [NameInMap("recovered_hit")]
        [Validation(Required=true)]
        public long? RecoveredHit { get; set; }

        // 检测频率
        [NameInMap("step")]
        [Validation(Required=true)]
        public long? Step { get; set; }

        // 通知渠道
        [NameInMap("channels")]
        [Validation(Required=true)]
        public List<string> Channels { get; set; }

        // 通知对象
        [NameInMap("notify_target")]
        [Validation(Required=false)]
        public List<UnifiedAlarmSubDTO> NotifyTarget { get; set; }

        // 静默时间
        [NameInMap("silence_time")]
        [Validation(Required=true)]
        public long? SilenceTime { get; set; }

        // 告警触发时通知 1:勾选 0:不勾选
        [NameInMap("notify_firing")]
        [Validation(Required=true)]
        public long? NotifyFiring { get; set; }

        // 告警恢复时通知 1:勾选 0:不勾选
        [NameInMap("notify_recovered")]
        [Validation(Required=true)]
        public long? NotifyRecovered { get; set; }

        // 告警无数据时通知 1:勾选 0:不勾选
        [NameInMap("notify_nodata")]
        [Validation(Required=true)]
        public long? NotifyNodata { get; set; }

        // 通知时间
        [NameInMap("notify_time_filter")]
        [Validation(Required=false)]
        public TimeFilter NotifyTimeFilter { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

    }

}
