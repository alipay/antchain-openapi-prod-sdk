// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmEventstatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 告警等级
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // 触发状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 时间戳
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 工作空间名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 模糊查询告警内容
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 告警规则 ID
        [NameInMap("alarm_rule_id")]
        [Validation(Required=false)]
        public long? AlarmRuleId { get; set; }

        // alarm_target_type
        [NameInMap("alarm_target_type")]
        [Validation(Required=false)]
        public string AlarmTargetType { get; set; }

        // 根据应用过滤
        [NameInMap("alarm_stack_info")]
        [Validation(Required=false)]
        public AlarmStackInfo AlarmStackInfo { get; set; }

    }

}
