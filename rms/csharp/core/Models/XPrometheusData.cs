// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XPrometheusData : TeaModel {
        //  
        [NameInMap("metrics")]
        [Validation(Required=false)]
        public List<XExpression> Metrics { get; set; }

        //  
        [NameInMap("query")]
        [Validation(Required=false)]
        public XPrometheusQuery Query { get; set; }

    }

}
