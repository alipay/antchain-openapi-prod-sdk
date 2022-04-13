// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性伸缩指标目标值
    public class HPABasedElasticConfigMetricTarget : TeaModel {
        // 支持两种类型：AverageValue，Utilization
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public HPABasedElasticConfigMetricTargetResourceValue Value { get; set; }

        // 利用率
        [NameInMap("utilization")]
        [Validation(Required=false)]
        public long? Utilization { get; set; }

    }

}
