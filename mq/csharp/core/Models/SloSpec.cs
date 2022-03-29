// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // slo配置
    public class SloSpec : TeaModel {
        // 是否开启
        [NameInMap("enable")]
        [Validation(Required=true)]
        public bool? Enable { get; set; }

        // 是否是常驻任务
        [NameInMap("long_running_task")]
        [Validation(Required=true)]
        public bool? LongRunningTask { get; set; }

        // 默认可接受执行时间
        [NameInMap("default_acceptable_execution_interval")]
        [Validation(Required=true)]
        public long? DefaultAcceptableExecutionInterval { get; set; }

    }

}
