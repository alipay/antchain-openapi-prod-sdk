// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 指标时序值
    public class MetricValue : TeaModel {
        // 时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // double类型值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
