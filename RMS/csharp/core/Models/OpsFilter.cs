// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // OpsFilter
    public class OpsFilter : TeaModel {
        // black
        [NameInMap("black")]
        [Validation(Required=false)]
        public bool? Black { get; set; }

        // names
        [NameInMap("names")]
        [Validation(Required=false)]
        public List<string> Names { get; set; }

    }

}
