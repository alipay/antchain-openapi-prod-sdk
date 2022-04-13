// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性伸缩指标目标值类型
    public class HPABasedElasticConfigMetricTargetResourceValue : TeaModel {
        // 数值
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 数值单位:
        // Byte, Ki, Mi, Gi, Ti, Pi
        // m, C
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
