// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 返回体度量
    public class RultMetric : TeaModel {
        // 度量编码
        [NameInMap("metric_code")]
        [Validation(Required=true)]
        public string MetricCode { get; set; }

        // 度量聚合结果
        [NameInMap("metric_value")]
        [Validation(Required=true)]
        public string MetricValue { get; set; }

    }

}
