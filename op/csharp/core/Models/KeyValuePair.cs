// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // k-v对
    public class KeyValuePair : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
