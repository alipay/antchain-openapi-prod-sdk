// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateUnifiedalarmTplRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 模板名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 区分自定义还是pql
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 规则配置
        [NameInMap("rule_config")]
        [Validation(Required=true)]
        public string RuleConfig { get; set; }

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

        // 通知对象 可能有多个
        [NameInMap("alarm_subs")]
        [Validation(Required=false)]
        public List<UnifiedAlarmSubDTO> AlarmSubs { get; set; }

        // 静默期
        [NameInMap("silence_time")]
        [Validation(Required=true)]
        public long? SilenceTime { get; set; }

        // 告警触发时通知
        [NameInMap("notify_firing")]
        [Validation(Required=true)]
        public long? NotifyFiring { get; set; }

        // 告警恢复时通知
        [NameInMap("notify_recovered")]
        [Validation(Required=true)]
        public long? NotifyRecovered { get; set; }

        // 告警无数据时通知
        [NameInMap("notify_nodata")]
        [Validation(Required=true)]
        public long? NotifyNodata { get; set; }

        // 通知时间
        [NameInMap("notify_time_filter")]
        [Validation(Required=false)]
        public TimeFilter NotifyTimeFilter { get; set; }

        // 工作空间名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

    }

}
