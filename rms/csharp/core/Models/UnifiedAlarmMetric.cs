// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 指标
    public class UnifiedAlarmMetric : TeaModel {
        // 指标
        [NameInMap("metric")]
        [Validation(Required=true)]
        public string Metric { get; set; }

        // 指标数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<MetricData> Data { get; set; }

    }

}
