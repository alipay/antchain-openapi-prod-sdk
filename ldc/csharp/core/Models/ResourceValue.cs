// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // ResourceValue
    public class ResourceValue : TeaModel {
        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // Ki、Mi、Gi、Ti、Pi、m、c
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
