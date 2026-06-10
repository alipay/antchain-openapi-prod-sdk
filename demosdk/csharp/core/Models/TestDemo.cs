// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // 1
    public class TestDemo : TeaModel {
        // 1
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 1
        [NameInMap("number")]
        [Validation(Required=false)]
        public long? Number { get; set; }

    }

}
