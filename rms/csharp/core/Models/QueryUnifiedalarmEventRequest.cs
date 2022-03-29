// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作区
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面尺寸
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 告警等级
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // 触发状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 告警对象类型
        [NameInMap("alarm_target_type")]
        [Validation(Required=false)]
        public string AlarmTargetType { get; set; }

        // 模糊查询字段
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 告警规则 ID
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // 根据应用栈过滤
        [NameInMap("alarm_stack_info")]
        [Validation(Required=false)]
        public AlarmStackInfo AlarmStackInfo { get; set; }

        // 查询告警事件产生时间所在区间的开始时间
        [NameInMap("fire_start_time")]
        [Validation(Required=false)]
        public long? FireStartTime { get; set; }

        // 查询告警事件产生时间所在区间的结束时间
        [NameInMap("fire_end_time")]
        [Validation(Required=false)]
        public long? FireEndTime { get; set; }

        // 查询告警事件恢复时间所在区间的开始时间
        [NameInMap("recovered_start_time")]
        [Validation(Required=false)]
        public long? RecoveredStartTime { get; set; }

        // 查询告警事件恢复时间所在区间的结束时间
        [NameInMap("recovered_end_time")]
        [Validation(Required=false)]
        public long? RecoveredEndTime { get; set; }

    }

}
