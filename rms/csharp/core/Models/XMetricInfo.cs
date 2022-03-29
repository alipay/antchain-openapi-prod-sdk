// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XMetricInfo : TeaModel {
        //  
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        //  
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        //  
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        //  
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

    }

}
