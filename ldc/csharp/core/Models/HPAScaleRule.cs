// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性扩缩容高级配置规则
    public class HPAScaleRule : TeaModel {
        // 冷却窗口时间
        [NameInMap("stabilization_window_seconds")]
        [Validation(Required=false)]
        public long? StabilizationWindowSeconds { get; set; }

        // 扩缩容策略
        [NameInMap("policies")]
        [Validation(Required=false)]
        public List<HPAScalePolicy> Policies { get; set; }

    }

}
