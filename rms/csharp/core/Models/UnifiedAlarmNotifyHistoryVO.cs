// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 告警消息历史
    public class UnifiedAlarmNotifyHistoryVO : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 告警历史id
        [NameInMap("alarm_history_id")]
        [Validation(Required=false)]
        public long? AlarmHistoryId { get; set; }

        // 告警事件id
        [NameInMap("alarm_event_id")]
        [Validation(Required=false)]
        public string AlarmEventId { get; set; }

        // 告警规则id
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 告警等级
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // 告警静默期
        [NameInMap("alarm_silence_time")]
        [Validation(Required=false)]
        public long? AlarmSilenceTime { get; set; }

        // 告警时间
        [NameInMap("alarm_time")]
        [Validation(Required=false)]
        public long? AlarmTime { get; set; }

        // 通知渠道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 订阅人的类型
        [NameInMap("subscriber_type")]
        [Validation(Required=false)]
        public string SubscriberType { get; set; }

        // 订阅人
        [NameInMap("subscriber")]
        [Validation(Required=false)]
        public string Subscriber { get; set; }

        // 聚合条数
        [NameInMap("agg_count")]
        [Validation(Required=false)]
        public long? AggCount { get; set; }

        // 通知状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        // 工作空间id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 消息内容
        [NameInMap("notify_content")]
        [Validation(Required=false)]
        public string NotifyContent { get; set; }

        // 告警规则名
        [NameInMap("alarm_rule_name")]
        [Validation(Required=false)]
        public string AlarmRuleName { get; set; }

        // 订阅人
        [NameInMap("subscriber_name")]
        [Validation(Required=false)]
        public string SubscriberName { get; set; }

        // 订阅者来源
        [NameInMap("subscriber_source")]
        [Validation(Required=false)]
        public string SubscriberSource { get; set; }

        // 告警消息的状态
        [NameInMap("alarm_status")]
        [Validation(Required=false)]
        public long? AlarmStatus { get; set; }

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

        // 描述消息发送错误原因
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 告警消息的日志跟踪字段
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

    }

}
