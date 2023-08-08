// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // CctSubCheckLabel
    public class CctSubCheckLabel : TeaModel {
        // sub_label
        [NameInMap("sub_label")]
        [Validation(Required=true)]
        public string SubLabel { get; set; }

        // rate
        [NameInMap("rate")]
        [Validation(Required=true)]
        public long? Rate { get; set; }

    }

}
