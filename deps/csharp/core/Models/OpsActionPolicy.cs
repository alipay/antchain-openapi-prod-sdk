// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 运维策略
    public class OpsActionPolicy : TeaModel {
        // 运维动作类型
        [NameInMap("ops_action_type")]
        [Validation(Required=false)]
        public string OpsActionType { get; set; }

        // 超时时间
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

        // 检查间隔
        [NameInMap("check_interval")]
        [Validation(Required=false)]
        public long? CheckInterval { get; set; }

        // 重试次数
        [NameInMap("retry_times")]
        [Validation(Required=false)]
        public long? RetryTimes { get; set; }

    }

}
