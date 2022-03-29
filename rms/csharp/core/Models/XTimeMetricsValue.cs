// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XTimeMetricsValue : TeaModel {
        //  
        [NameInMap("values")]
        [Validation(Required=true)]
        public List<XStringKeyValue> Values { get; set; }

        //  
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
