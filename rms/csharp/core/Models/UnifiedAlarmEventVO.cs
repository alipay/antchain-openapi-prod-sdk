// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 告警历史时间页面显示对象
    public class UnifiedAlarmEventVO : TeaModel {
        // 告警事件id
        [NameInMap("alarm_event_id")]
        [Validation(Required=false)]
        public string AlarmEventId { get; set; }

        // 告警内容
        [NameInMap("alarm_content")]
        [Validation(Required=false)]
        public string AlarmContent { get; set; }

        // 告警等级
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // 触发状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 告警对象
        [NameInMap("alarm_target")]
        [Validation(Required=false)]
        public string AlarmTarget { get; set; }

        // 告警产生时间
        [NameInMap("alarm_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AlarmStartTime { get; set; }

        // 告警恢复时间
        [NameInMap("alarm_recover_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AlarmRecoverTime { get; set; }

        // 分组的告警历史集合
        [NameInMap("alarm_history_list")]
        [Validation(Required=false)]
        public List<UnifiedAlarmHistoryVO> AlarmHistoryList { get; set; }

        // 历史id
        [NameInMap("alarm_history_id")]
        [Validation(Required=false)]
        public long? AlarmHistoryId { get; set; }

        // type
        [NameInMap("alarm_target_type")]
        [Validation(Required=false)]
        public string AlarmTargetType { get; set; }

        // 告警类型
        [NameInMap("alarm_type")]
        [Validation(Required=false)]
        public string AlarmType { get; set; }

        // 数据源跳转url
        [NameInMap("alarm_url")]
        [Validation(Required=false)]
        public string AlarmUrl { get; set; }

        // 数据源名称
        [NameInMap("data_source_name")]
        [Validation(Required=false)]
        public string DataSourceName { get; set; }

        // 目标对象是否已经删除
        [NameInMap("alarm_target_deleted")]
        [Validation(Required=false)]
        public bool? AlarmTargetDeleted { get; set; }

        // 静默剩余时间
        [NameInMap("silence_remain_time")]
        [Validation(Required=false)]
        public long? SilenceRemainTime { get; set; }

        // 告警规则ID
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

    }

}
