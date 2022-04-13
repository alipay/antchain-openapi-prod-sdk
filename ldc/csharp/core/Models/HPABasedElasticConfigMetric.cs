// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性伸缩指标
    public class HPABasedElasticConfigMetric : TeaModel {
        // 指标名称：
        // CPU，Memory，QPS，RT
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 目标值
        [NameInMap("target")]
        [Validation(Required=true)]
        public HPABasedElasticConfigMetricTarget Target { get; set; }

    }

}
