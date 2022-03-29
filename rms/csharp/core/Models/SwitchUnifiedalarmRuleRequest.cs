// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class SwitchUnifiedalarmRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 告警开始时间
        [NameInMap("suspend_start_time")]
        [Validation(Required=false)]
        public long? SuspendStartTime { get; set; }

        // 告警结束时间
        [NameInMap("suspended_end_time")]
        [Validation(Required=false)]
        public long? SuspendedEndTime { get; set; }

        // 告警暂停原因
        [NameInMap("suspended_reason")]
        [Validation(Required=false)]
        public string SuspendedReason { get; set; }

        // 启停状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 工作空间名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 批量暂停与恢复
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<long?> Ids { get; set; }

    }

}
