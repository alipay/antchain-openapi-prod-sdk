// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // StateCount
    public class StateCount : TeaModel {
        // state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // count
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

    }

}
