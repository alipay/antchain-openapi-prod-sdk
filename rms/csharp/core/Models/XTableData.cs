// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XTableData : TeaModel {
        //  
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<XStringKeyValue> Tags { get; set; }

        //  
        [NameInMap("metric_values")]
        [Validation(Required=false)]
        public List<XTimeMetricsValue> MetricValues { get; set; }

    }

}
