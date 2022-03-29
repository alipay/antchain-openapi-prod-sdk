// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmHistoryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 开始时间
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 结束时间
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 应用 / 主机
        [NameInMap("alarm_target_type")]
        [Validation(Required=false)]
        public string AlarmTargetType { get; set; }

        // 告警对象
        [NameInMap("alarm_target")]
        [Validation(Required=false)]
        public string AlarmTarget { get; set; }

        // 告警级别
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // 触发状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 根据应用过滤告警历史
        [NameInMap("alarm_stack_info")]
        [Validation(Required=false)]
        public AlarmStackInfo AlarmStackInfo { get; set; }

    }

}
