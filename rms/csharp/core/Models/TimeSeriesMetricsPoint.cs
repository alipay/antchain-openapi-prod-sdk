// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Metrics 中具体时间点的数据
    public class TimeSeriesMetricsPoint : TeaModel {
        // 时间戳 (毫秒)
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // Metrics 某时间点的具体值
        [NameInMap("value")]
        [Validation(Required=false)]
        public List<TimeSeriesMetricsField> Value { get; set; }

    }

}
