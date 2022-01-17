// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // MonitorData
    public class MonitorData : TeaModel {
        // 时间点
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public long? Value { get; set; }

    }

}
