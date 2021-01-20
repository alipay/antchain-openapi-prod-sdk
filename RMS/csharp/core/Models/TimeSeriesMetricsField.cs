// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Metrics 中的一个 field
    public class TimeSeriesMetricsField : TeaModel {
        // Field key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // Field value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
