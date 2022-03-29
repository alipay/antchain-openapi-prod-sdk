// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // metric data
    public class XMetricData : TeaModel {
        // key value
        [NameInMap("metric")]
        [Validation(Required=true)]
        public List<XStringKeyValue> Metric { get; set; }

        // time value
        [NameInMap("value")]
        [Validation(Required=false)]
        public XTimeStringValue Value { get; set; }

        //  
        [NameInMap("values")]
        [Validation(Required=false)]
        public List<XTimeStringValue> Values { get; set; }

    }

}
