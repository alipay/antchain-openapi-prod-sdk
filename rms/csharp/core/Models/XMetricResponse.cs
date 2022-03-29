// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // time series
    public class XMetricResponse : TeaModel {
        // timeseries
        [NameInMap("result")]
        [Validation(Required=true)]
        public List<XMetricData> Result { get; set; }

        // result type
        [NameInMap("result_type")]
        [Validation(Required=true)]
        public string ResultType { get; set; }

    }

}
