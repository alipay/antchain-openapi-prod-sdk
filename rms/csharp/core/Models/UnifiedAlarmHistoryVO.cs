// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 告警历史对象
    public class UnifiedAlarmHistoryVO : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 事件id
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public string EventId { get; set; }

        // 告警规则id
        [NameInMap("alarm_rule_id")]
        [Validation(Required=true)]
        public long? AlarmRuleId { get; set; }

        // 告警规则唯一标识
        [NameInMap("unique_identity")]
        [Validation(Required=true)]
        public string UniqueIdentity { get; set; }

        // 告警规则名字
        [NameInMap("alarm_rule_name")]
        [Validation(Required=true)]
        public string AlarmRuleName { get; set; }

        // 告警等级
        [NameInMap("alarm_level")]
        [Validation(Required=true)]
        public long? AlarmLevel { get; set; }

        // 告警时间
        [NameInMap("alarm_time")]
        [Validation(Required=true)]
        public long? AlarmTime { get; set; }

        // 告警内容
        [NameInMap("alarm_content")]
        [Validation(Required=true)]
        public string AlarmContent { get; set; }

        // 告警对象
        [NameInMap("alarm_target")]
        [Validation(Required=true)]
        public string AlarmTarget { get; set; }

        // 触发状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // 工作区id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public long? WorkspaceId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // type
        [NameInMap("alarm_target_type")]
        [Validation(Required=false)]
        public string AlarmTargetType { get; set; }

        // 告警详情
        [NameInMap("alarm_detail")]
        [Validation(Required=true)]
        public string AlarmDetail { get; set; }

        // 数据源名称
        [NameInMap("data_source_name")]
        [Validation(Required=false)]
        public string DataSourceName { get; set; }

        // 数据源跳转url
        [NameInMap("alarm_url")]
        [Validation(Required=false)]
        public string AlarmUrl { get; set; }

        // 告警类型
        [NameInMap("alarm_type")]
        [Validation(Required=false)]
        public string AlarmType { get; set; }

        // 目标对象是否已经删除
        [NameInMap("alarm_target_deleted")]
        [Validation(Required=false)]
        public bool? AlarmTargetDeleted { get; set; }

    }

}
