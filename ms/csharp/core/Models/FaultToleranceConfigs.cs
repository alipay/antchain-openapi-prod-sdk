// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障隔离配置规则
    public class FaultToleranceConfigs : TeaModel {
        // 异常类型值
        [NameInMap("exception_types")]
        [Validation(Required=false)]
        public List<string> ExceptionTypes { get; set; }

        // 时间窗口
        [NameInMap("time_window")]
        [Validation(Required=false)]
        public long? TimeWindow { get; set; }

        // 时间窗口内最少调用次数
        [NameInMap("least_window_count")]
        [Validation(Required=false)]
        public long? LeastWindowCount { get; set; }

        // 最大隔离数量
        [NameInMap("max_ip_count")]
        [Validation(Required=false)]
        public long? MaxIpCount { get; set; }

        // 异常比例倍数
        [NameInMap("exception_rate_multiple")]
        [Validation(Required=false)]
        public long? ExceptionRateMultiple { get; set; }

        // 异常比例阈值
        [NameInMap("least_exception_rate")]
        [Validation(Required=false)]
        public long? LeastExceptionRate { get; set; }

    }

}
