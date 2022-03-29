// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmNotifyhistoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发送状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 通知渠道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 通知人id
        [NameInMap("subscriber")]
        [Validation(Required=false)]
        public string Subscriber { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面尺寸
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 事件id
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 查询告警内容
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 告警规则 ID
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 告警状态
        [NameInMap("alarm_status")]
        [Validation(Required=false)]
        public long? AlarmStatus { get; set; }

        // 根据应用过滤告警历史
        [NameInMap("alarm_stack_info")]
        [Validation(Required=false)]
        public AlarmStackInfo AlarmStackInfo { get; set; }

        // 是否根据通知对象过滤
        [NameInMap("alarm_subscribers")]
        [Validation(Required=false)]
        public List<UnifiedAlarmSubDTO> AlarmSubscribers { get; set; }

    }

}
